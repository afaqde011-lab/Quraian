package l9;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR;
    public static final u.e D;
    public static final String[] E;
    public final Bundle A;
    public MediaMetadata B;
    public byte[] C;

    static {
        u.e eVar = new u.e(0);
        D = eVar;
        eVar.put("android.media.metadata.TITLE", 1);
        eVar.put("android.media.metadata.ARTIST", 1);
        eVar.put("android.media.metadata.DURATION", 0);
        eVar.put("android.media.metadata.ALBUM", 1);
        eVar.put("android.media.metadata.AUTHOR", 1);
        eVar.put("android.media.metadata.WRITER", 1);
        eVar.put("android.media.metadata.COMPOSER", 1);
        eVar.put("android.media.metadata.COMPILATION", 1);
        eVar.put("android.media.metadata.DATE", 1);
        eVar.put("android.media.metadata.YEAR", 0);
        eVar.put("android.media.metadata.GENRE", 1);
        eVar.put("android.media.metadata.TRACK_NUMBER", 0);
        eVar.put("android.media.metadata.NUM_TRACKS", 0);
        eVar.put("android.media.metadata.DISC_NUMBER", 0);
        eVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        eVar.put("android.media.metadata.ART", 2);
        eVar.put("android.media.metadata.ART_URI", 1);
        eVar.put("android.media.metadata.ALBUM_ART", 2);
        eVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        eVar.put("android.media.metadata.USER_RATING", 3);
        eVar.put("android.media.metadata.RATING", 3);
        eVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        eVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        eVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        eVar.put("android.media.metadata.DISPLAY_ICON", 2);
        eVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        eVar.put("android.media.metadata.MEDIA_ID", 1);
        eVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        eVar.put("android.media.metadata.MEDIA_URI", 1);
        eVar.put("android.media.metadata.ADVERTISEMENT", 0);
        eVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        E = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new com.google.android.gms.common.internal.k0(24);
    }

    public y(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.A = bundle2;
        f0.h(bundle2);
    }

    public y(Parcel parcel) {
        Bundle bundle = parcel.readBundle(f0.class.getClassLoader());
        bundle.getClass();
        this.A = bundle;
    }

    public final long a(String str) {
        return this.A.getLong(str, 0L);
    }

    public final Bitmap b() {
        String[] strArr = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ALBUM_ART", "android.media.metadata.ART"};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            Bundle bundle = this.A;
            if (bundle.containsKey(str)) {
                try {
                    return (Bitmap) bundle.getParcelable(str);
                } catch (Exception e3) {
                    e7.a.n("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.A);
    }
}
