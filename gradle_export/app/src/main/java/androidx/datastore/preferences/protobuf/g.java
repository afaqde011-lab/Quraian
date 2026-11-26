package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.x5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

public class g implements Iterable, Serializable {
    public static final g C = new g(x.f685b);
    public static final e D;
    public int A = 0;
    public final byte[] B;

    static {
        D = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.B = bArr;
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

    public static g c(int i10, int i11, byte[] bArr) {
        byte[] bArrCopyOfRange;
        b(i10, i10 + i11, bArr.length);
        switch (D.f599a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte a(int i10) {
        return this.B[i10];
    }

    public void e(int i10, byte[] bArr) {
        System.arraycopy(this.B, 0, bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i10 = this.A;
        int i11 = gVar.A;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbQ = oi.k.q("Ran off end of other: 0, ", size, ", ");
            sbQ.append(gVar.size());
            throw new IllegalArgumentException(sbQ.toString());
        }
        byte[] bArr = gVar.B;
        int iH = h() + size;
        int iH2 = h();
        int iH3 = gVar.h();
        while (iH2 < iH) {
            if (this.B[iH2] != bArr[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    public int h() {
        return 0;
    }

    public final int hashCode() {
        int i10 = this.A;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iH = h();
        int i11 = size;
        for (int i12 = iH; i12 < iH + size; i12++) {
            i11 = (i11 * 31) + this.B[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.A = i11;
        return i11;
    }

    public byte i(int i10) {
        return this.B[i10];
    }

    @Override
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.B.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = w50.c.B(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iB = b(0, 47, size());
            sb2.append(w50.c.B(iB == 0 ? C : new f(this.B, h(), iB)));
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
