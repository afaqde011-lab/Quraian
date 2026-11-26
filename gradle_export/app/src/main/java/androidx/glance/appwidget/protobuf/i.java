package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.measurement.x5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

public abstract class i implements Iterable, Serializable {
    public static final h B = new h(e0.f886b);
    public static final f C;
    public int A;

    static {
        C = c.a() ? new f(1) : new f(0);
    }

    public static int b(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(g4.c.i("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(w.c.h(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(w.c.h(i11, i12, "End index: ", " >= "));
    }

    public static h c(int i10, int i11, byte[] bArr) {
        byte[] bArrCopyOfRange;
        b(i10, i10 + i11, bArr.length);
        switch (C.f887a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new h(bArrCopyOfRange);
    }

    public abstract byte a(int i10);

    public abstract void e(int i10, byte[] bArr);

    public final int hashCode() {
        int i10 = this.A;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        h hVar = (h) this;
        int iH = hVar.h();
        int i11 = size;
        for (int i12 = iH; i12 < iH + size; i12++) {
            i11 = (i11 * 31) + hVar.D[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.A = i11;
        return i11;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = c7.i.A(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            h hVar = (h) this;
            int iB = b(0, 47, hVar.size());
            sb2.append(c7.i.A(iB == 0 ? B : new g(hVar.D, hVar.h(), iB)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return x5.n(sb3, string, "\">");
    }
}
