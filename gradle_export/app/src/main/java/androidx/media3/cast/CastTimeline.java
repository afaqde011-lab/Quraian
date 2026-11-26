package androidx.media3.cast;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import java.util.Arrays;

final class CastTimeline extends k2 {
    public static final CastTimeline EMPTY_CAST_TIMELINE = new CastTimeline(new int[0], new SparseArray());
    private final long[] defaultPositionsUs;
    private final long[] durationsUs;
    private final int[] ids;
    private final SparseIntArray idsToIndex;
    private final boolean[] isLive;
    private final q0[] mediaItems;

    public static final class ItemData {
        public final String contentId;
        public final long defaultPositionUs;
        public final long durationUs;
        public final boolean isLive;
        public final q0 mediaItem;
        static final String UNKNOWN_CONTENT_ID = "UNKNOWN_CONTENT_ID";
        public static final ItemData EMPTY = new ItemData(-9223372036854775807L, -9223372036854775807L, false, q0.f1408g, UNKNOWN_CONTENT_ID);

        public ItemData(long j9, long j10, boolean z10, q0 q0Var, String str) {
            this.durationUs = j9;
            this.defaultPositionUs = j10;
            this.isLive = z10;
            this.mediaItem = q0Var;
            this.contentId = str;
        }

        public ItemData copyWithNewValues(long j9, long j10, boolean z10, q0 q0Var, String str) {
            return (j9 == this.durationUs && j10 == this.defaultPositionUs && z10 == this.isLive && str.equals(this.contentId) && q0Var.equals(this.mediaItem)) ? this : new ItemData(j9, j10, z10, q0Var, str);
        }
    }

    public CastTimeline(int[] iArr, SparseArray<ItemData> sparseArray) {
        int length = iArr.length;
        this.idsToIndex = new SparseIntArray(length);
        this.ids = Arrays.copyOf(iArr, length);
        this.durationsUs = new long[length];
        this.defaultPositionsUs = new long[length];
        this.isLive = new boolean[length];
        this.mediaItems = new q0[length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.ids;
            if (i10 >= iArr2.length) {
                return;
            }
            int i11 = iArr2[i10];
            this.idsToIndex.put(i11, i10);
            ItemData itemData = sparseArray.get(i11, ItemData.EMPTY);
            this.mediaItems[i10] = itemData.mediaItem;
            this.durationsUs[i10] = itemData.durationUs;
            long[] jArr = this.defaultPositionsUs;
            long j9 = itemData.defaultPositionUs;
            if (j9 == -9223372036854775807L) {
                j9 = 0;
            }
            jArr[i10] = j9;
            this.isLive[i10] = itemData.isLive;
            i10++;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastTimeline)) {
            return false;
        }
        CastTimeline castTimeline = (CastTimeline) obj;
        return Arrays.equals(this.ids, castTimeline.ids) && Arrays.equals(this.durationsUs, castTimeline.durationsUs) && Arrays.equals(this.defaultPositionsUs, castTimeline.defaultPositionsUs) && Arrays.equals(this.isLive, castTimeline.isLive);
    }

    @Override
    public int getIndexOfPeriod(Object obj) {
        if (obj instanceof Integer) {
            return this.idsToIndex.get(((Integer) obj).intValue(), -1);
        }
        return -1;
    }

    @Override
    public h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        int i11 = this.ids[i10];
        h2Var.i(Integer.valueOf(i11), Integer.valueOf(i11), i10, this.durationsUs[i10], 0L);
        return h2Var;
    }

    @Override
    public int getPeriodCount() {
        return this.ids.length;
    }

    @Override
    public Integer getUidOfPeriod(int i10) {
        return Integer.valueOf(this.ids[i10]);
    }

    @Override
    public j2 getWindow(int i10, j2 j2Var, long j9) {
        long j10 = this.durationsUs[i10];
        boolean z10 = j10 == -9223372036854775807L;
        Integer numValueOf = Integer.valueOf(this.ids[i10]);
        q0 q0Var = this.mediaItems[i10];
        j2Var.b(numValueOf, q0Var, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, !z10, z10, this.isLive[i10] ? q0Var.f1415c : null, this.defaultPositionsUs[i10], j10, i10, i10, 0L);
        return j2Var;
    }

    @Override
    public int getWindowCount() {
        return this.ids.length;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.isLive) + ((Arrays.hashCode(this.defaultPositionsUs) + ((Arrays.hashCode(this.durationsUs) + (Arrays.hashCode(this.ids) * 31)) * 31)) * 31);
    }
}
