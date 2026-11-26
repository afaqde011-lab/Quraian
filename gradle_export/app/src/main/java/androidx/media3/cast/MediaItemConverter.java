package androidx.media3.cast;

import androidx.media3.common.q0;
import com.google.android.gms.cast.MediaQueueItem;

public interface MediaItemConverter {
    q0 toMediaItem(MediaQueueItem mediaQueueItem);

    MediaQueueItem toMediaQueueItem(q0 q0Var);
}
