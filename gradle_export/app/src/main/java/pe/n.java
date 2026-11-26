package pe;

import com.google.android.gms.common.internal.d0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

public final class n implements Callable {

    public final boolean f12509a;

    public final String f12510b;

    public final m f12511c;

    public n(boolean z10, String str, m mVar) {
        this.f12509a = z10;
        this.f12510b = str;
        this.f12511c = mVar;
    }

    @Override
    public final Object call() {
        MessageDigest messageDigest;
        boolean z10 = this.f12509a;
        String str = this.f12510b;
        m mVar = this.f12511c;
        String str2 = (z10 || !p.b(str, mVar, true, false).f12522a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        d0.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(mVar.f12508g);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b7 : bArrDigest) {
            char[] cArr2 = ve.c.f15621b;
            cArr[i11] = cArr2[(b7 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b7 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}
