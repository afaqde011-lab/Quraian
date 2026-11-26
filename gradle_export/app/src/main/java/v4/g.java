package v4;

import android.net.Uri;
import com.google.android.gms.cast.MediaError;

public final class g {

    public final Uri f15452a;

    public final int f15453b;

    public final int f15454c;

    public final boolean f15455d;

    public final String f15456e;

    public final int f15457f;

    public g(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
        uri.getClass();
        this.f15452a = uri;
        this.f15453b = i10;
        this.f15454c = i11;
        this.f15455d = z10;
        this.f15456e = str;
        this.f15457f = i12;
    }

    public g(String str, String str2) {
        this.f15452a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f15453b = 0;
        this.f15454c = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        this.f15455d = false;
        this.f15456e = str2;
        this.f15457f = 0;
    }
}
