package hf;

import android.util.Base64;
import java.security.SecureRandom;

public abstract class g {

    public static final SecureRandom f7054a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f7054a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
