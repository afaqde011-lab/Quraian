package nf;

import com.google.android.gms.internal.fido.zzho;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class c1 implements Comparable {
    public static int d(byte b7) {
        return (b7 >> 5) & 7;
    }

    public static c1 e(byte... bArr) {
        bArr.getClass();
        e1 e1Var = new e1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return b.k(e1Var);
        } finally {
            try {
                e1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final c1 c(Class cls) throws zzho {
        if (cls.isInstance(this)) {
            return (c1) cls.cast(this);
        }
        throw new zzho("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }
}
