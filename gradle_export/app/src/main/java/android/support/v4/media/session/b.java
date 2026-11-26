package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import java.util.ArrayList;

public interface b extends IInterface {
    void L(Bundle bundle);

    void O(ArrayList arrayList);

    void V0(CharSequence charSequence);

    void Z1(PlaybackStateCompat playbackStateCompat);

    void c1();

    void d2(ParcelableVolumeInfo parcelableVolumeInfo);

    void e1(MediaMetadataCompat mediaMetadataCompat);
}
