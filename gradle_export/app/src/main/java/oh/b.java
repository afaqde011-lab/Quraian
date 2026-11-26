package oh;

import android.os.Build;
import c3.s0;
import com.google.android.gms.cast.Cast;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import oi.k;
import th.t;
import zh.u;

public final class b {

    public static final s0 f11974c = new s0(8);

    public final SecretKeySpec f11975a;

    public final boolean f11976b;

    public b(byte[] bArr) throws GeneralSecurityException {
        if (!k.b(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        u.a(bArr.length);
        this.f11975a = new SecretKeySpec(bArr, "AES");
        this.f11976b = true;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i10 = t.f14819a;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if ((numValueOf != null ? numValueOf.intValue() : -1) <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(Cast.MAX_NAMESPACE_LENGTH, bArr, 0, length);
    }
}
