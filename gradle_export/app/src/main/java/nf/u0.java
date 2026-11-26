package nf;

import com.google.android.gms.internal.measurement.x5;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public class u0 implements Iterable, Serializable {
    public static final u0 C = new u0(v0.f11255a);
    public int A = 0;
    public final byte[] B;

    static {
        int i10 = s0.f11254a;
    }

    public u0(byte[] bArr) {
        bArr.getClass();
        this.B = bArr;
    }

    public static int k(int i10, int i11, int i12) {
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

    public static u0 l(int i10, byte[] bArr) {
        k(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new u0(bArr2);
    }

    public byte a(int i10) {
        return this.B[i10];
    }

    public byte b(int i10) {
        return this.B[i10];
    }

    public int c() {
        return 0;
    }

    public int e() {
        return this.B.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0) || e() != ((u0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return obj.equals(this);
        }
        u0 u0Var = (u0) obj;
        int i10 = this.A;
        int i11 = u0Var.A;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iE = e();
        if (iE > u0Var.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > u0Var.e()) {
            throw new IllegalArgumentException(w.c.h(iE, u0Var.e(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = u0Var.B;
        int iC = c() + iE;
        int iC2 = c();
        int iC3 = u0Var.c();
        while (iC2 < iC) {
            if (this.B[iC2] != bArr[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    public void h(int i10, byte[] bArr) {
        System.arraycopy(this.B, 0, bArr, 0, i10);
    }

    public final int hashCode() {
        int i10 = this.A;
        if (i10 != 0) {
            return i10;
        }
        int iE = e();
        int iC = c();
        byte[] bArr = v0.f11255a;
        int i11 = iE;
        for (int i12 = iC; i12 < iC + iE; i12++) {
            i11 = (i11 * 31) + this.B[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.A = i11;
        return i11;
    }

    public final ByteArrayInputStream i() {
        return new ByteArrayInputStream(this.B, c(), e());
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final byte[] m() {
        int iE = e();
        if (iE == 0) {
            return v0.f11255a;
        }
        byte[] bArr = new byte[iE];
        h(iE, bArr);
        return bArr;
    }

    public final String toString() {
        u0 t0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        if (e() <= 50) {
            strConcat = b.d(this);
        } else {
            int iK = k(0, 47, e());
            if (iK == 0) {
                t0Var = C;
            } else {
                t0Var = new t0(this.B, c(), iK);
            }
            strConcat = b.d(t0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iE);
        sb2.append(" contents=\"");
        return x5.n(sb2, strConcat, "\">");
    }
}
