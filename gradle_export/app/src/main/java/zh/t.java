package zh;

import c3.s0;
import java.security.SecureRandom;

public abstract class t {

    public static final s0 f17502a = new s0(15);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f17502a.get()).nextBytes(bArr);
        return bArr;
    }
}
