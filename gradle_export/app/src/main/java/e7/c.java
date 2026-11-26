package e7;

import android.net.Uri;
import androidx.media3.common.t0;

public interface c {
    kh.v O(Uri uri);

    kh.v o0(byte[] bArr);

    default kh.v x0(t0 t0Var) {
        byte[] bArr = t0Var.f1637k;
        if (bArr != null) {
            return o0(bArr);
        }
        Uri uri = t0Var.m;
        if (uri != null) {
            return O(uri);
        }
        return null;
    }
}
