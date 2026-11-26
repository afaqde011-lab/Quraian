package androidx.media3.cast;

import android.util.SparseArray;
import androidx.media3.common.q0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

final class CastTimelineTracker {
    private final MediaItemConverter mediaItemConverter;
    private final SparseArray<CastTimeline.ItemData> itemIdToData = new SparseArray<>();
    final HashMap<String, q0> mediaItemsByContentId = new HashMap<>();

    public CastTimelineTracker(MediaItemConverter mediaItemConverter) {
        this.mediaItemConverter = mediaItemConverter;
    }

    private void removeUnusedItemDataEntries(int[] iArr) {
        HashSet hashSet = new HashSet(iArr.length * 2);
        int i10 = 0;
        for (int i11 : iArr) {
            hashSet.add(Integer.valueOf(i11));
        }
        while (i10 < this.itemIdToData.size()) {
            if (hashSet.contains(Integer.valueOf(this.itemIdToData.keyAt(i10)))) {
                i10++;
            } else {
                this.mediaItemsByContentId.remove(this.itemIdToData.valueAt(i10).contentId);
                this.itemIdToData.removeAt(i10);
            }
        }
    }

    private void updateItemData(int i10, q0 q0Var, MediaInfo mediaInfo, String str, long j9) {
        boolean z10;
        CastTimeline.ItemData itemData = this.itemIdToData.get(i10, CastTimeline.ItemData.EMPTY);
        long streamDurationUs = CastUtils.getStreamDurationUs(mediaInfo);
        if (streamDurationUs == -9223372036854775807L) {
            streamDurationUs = itemData.durationUs;
        }
        if (mediaInfo == null) {
            z10 = itemData.isLive;
        } else {
            z10 = mediaInfo.getStreamType() == 2;
        }
        boolean z11 = z10;
        if (j9 == -9223372036854775807L) {
            j9 = itemData.defaultPositionUs;
        }
        this.itemIdToData.put(i10, itemData.copyWithNewValues(streamDurationUs, j9, z11, q0Var, str));
    }

    public CastTimeline getCastTimeline(RemoteMediaClient remoteMediaClient) {
        int[] itemIds = remoteMediaClient.getMediaQueue().getItemIds();
        if (itemIds.length > 0) {
            removeUnusedItemDataEntries(itemIds);
        }
        MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
        if (mediaStatus == null || mediaStatus.getMediaInfo() == null) {
            return CastTimeline.EMPTY_CAST_TIMELINE;
        }
        int currentItemId = mediaStatus.getCurrentItemId();
        MediaInfo mediaInfo = mediaStatus.getMediaInfo();
        mediaInfo.getClass();
        String contentId = mediaInfo.getContentId();
        q0 q0Var = this.mediaItemsByContentId.get(contentId);
        if (q0Var == null) {
            q0Var = q0.f1408g;
        }
        updateItemData(currentItemId, q0Var, mediaStatus.getMediaInfo(), contentId, -9223372036854775807L);
        for (MediaQueueItem mediaQueueItem : mediaStatus.getQueueItems()) {
            long startTime = (long) (mediaQueueItem.getStartTime() * 1000000.0d);
            MediaInfo media = mediaQueueItem.getMedia();
            String contentId2 = media != null ? media.getContentId() : "UNKNOWN_CONTENT_ID";
            q0 mediaItem = this.mediaItemsByContentId.get(contentId2);
            int itemId = mediaQueueItem.getItemId();
            if (mediaItem == null) {
                mediaItem = this.mediaItemConverter.toMediaItem(mediaQueueItem);
            }
            updateItemData(itemId, mediaItem, media, contentId2, startTime);
        }
        return new CastTimeline(itemIds, this.itemIdToData);
    }

    public void onMediaItemsAdded(List<q0> list, MediaQueueItem[] mediaQueueItemArr) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            HashMap<String, q0> map = this.mediaItemsByContentId;
            MediaInfo media = mediaQueueItemArr[i10].getMedia();
            media.getClass();
            map.put(media.getContentId(), list.get(i10));
        }
    }

    public void onMediaItemsSet(List<q0> list, MediaQueueItem[] mediaQueueItemArr) {
        this.mediaItemsByContentId.clear();
        onMediaItemsAdded(list, mediaQueueItemArr);
    }
}
