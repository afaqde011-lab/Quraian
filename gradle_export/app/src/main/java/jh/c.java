package jh;

import com.google.android.gms.cast.Cast;
import java.util.Arrays;

public abstract class c {

    public static final byte[] f8284a;

    static {
        byte[] bArr = new byte[Cast.MAX_NAMESPACE_LENGTH];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 10; i10++) {
            bArr[i10 + 48] = (byte) i10;
        }
        for (int i11 = 0; i11 < 26; i11++) {
            byte b7 = (byte) (i11 + 10);
            bArr[i11 + 65] = b7;
            bArr[i11 + 97] = b7;
        }
        f8284a = bArr;
    }
}
