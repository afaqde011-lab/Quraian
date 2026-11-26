package androidx.datastore.preferences.protobuf;

import com.google.android.gms.cast.Cast;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l extends w00.a {

    public static final Logger f639g = Logger.getLogger(l.class.getName());

    public static final boolean f640h = h1.f617e;

    public d0 f641b;

    public final byte[] f642c;

    public final int f643d;

    public int f644e;

    public final OutputStream f645f;

    public l(OutputStream outputStream, int i10) {
        super(1);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f642c = new byte[iMax];
        this.f643d = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f645f = outputStream;
    }

    public static int T(int i10, g gVar) {
        int iV = V(i10);
        int size = gVar.size();
        return W(size) + size + iV;
    }

    public static int U(String str) {
        int length;
        try {
            length = k1.a(str);
        } catch (j1 unused) {
            length = str.getBytes(x.f684a).length;
        }
        return W(length) + length;
    }

    public static int V(int i10) {
        return W(i10 << 3);
    }

    public static int W(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int X(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public final void N(byte[] bArr, int i10, int i11) throws IOException {
        b0(bArr, i10, i11);
    }

    public final void O(int i10) {
        int i11 = this.f644e;
        int i12 = i11 + 1;
        this.f644e = i12;
        byte[] bArr = this.f642c;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f644e = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f644e = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f644e = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void P(long j9) {
        int i10 = this.f644e;
        int i11 = i10 + 1;
        this.f644e = i11;
        byte[] bArr = this.f642c;
        bArr[i10] = (byte) (j9 & 255);
        int i12 = i10 + 2;
        this.f644e = i12;
        bArr[i11] = (byte) ((j9 >> 8) & 255);
        int i13 = i10 + 3;
        this.f644e = i13;
        bArr[i12] = (byte) ((j9 >> 16) & 255);
        int i14 = i10 + 4;
        this.f644e = i14;
        bArr[i13] = (byte) (255 & (j9 >> 24));
        int i15 = i10 + 5;
        this.f644e = i15;
        bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f644e = i16;
        bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f644e = i17;
        bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
        this.f644e = i10 + 8;
        bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
    }

    public final void Q(int i10, int i11) {
        R((i10 << 3) | i11);
    }

    public final void R(int i10) {
        boolean z10 = f640h;
        byte[] bArr = this.f642c;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f644e;
                this.f644e = i11 + 1;
                h1.j(bArr, i11, (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f644e;
            this.f644e = i12 + 1;
            h1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f644e;
            this.f644e = i13 + 1;
            bArr[i13] = (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f644e;
        this.f644e = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void S(long j9) {
        boolean z10 = f640h;
        byte[] bArr = this.f642c;
        if (z10) {
            while ((j9 & (-128)) != 0) {
                int i10 = this.f644e;
                this.f644e = i10 + 1;
                h1.j(bArr, i10, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                j9 >>>= 7;
            }
            int i11 = this.f644e;
            this.f644e = i11 + 1;
            h1.j(bArr, i11, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            int i12 = this.f644e;
            this.f644e = i12 + 1;
            bArr[i12] = (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255);
            j9 >>>= 7;
        }
        int i13 = this.f644e;
        this.f644e = i13 + 1;
        bArr[i13] = (byte) j9;
    }

    public final void Y() throws IOException {
        this.f645f.write(this.f642c, 0, this.f644e);
        this.f644e = 0;
    }

    public final void Z(int i10) throws IOException {
        if (this.f643d - this.f644e < i10) {
            Y();
        }
    }

    public final void a0(byte b7) throws IOException {
        if (this.f644e == this.f643d) {
            Y();
        }
        int i10 = this.f644e;
        this.f644e = i10 + 1;
        this.f642c[i10] = b7;
    }

    public final void b0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f644e;
        int i13 = this.f643d;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f642c;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f644e += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f644e = i13;
        Y();
        if (i16 > i13) {
            this.f645f.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f644e = i16;
        }
    }

    public final void c0(int i10, boolean z10) throws IOException {
        Z(11);
        Q(i10, 0);
        byte b7 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f644e;
        this.f644e = i11 + 1;
        this.f642c[i11] = b7;
    }

    public final void d0(int i10, g gVar) {
        o0(i10, 2);
        e0(gVar);
    }

    public final void e0(g gVar) throws IOException {
        q0(gVar.size());
        N(gVar.B, gVar.h(), gVar.size());
    }

    public final void f0(int i10, int i11) {
        Z(14);
        Q(i10, 5);
        O(i11);
    }

    public final void g0(int i10) throws IOException {
        Z(4);
        O(i10);
    }

    public final void h0(int i10, long j9) {
        Z(18);
        Q(i10, 1);
        P(j9);
    }

    public final void i0(long j9) throws IOException {
        Z(8);
        P(j9);
    }

    public final void j0(int i10, int i11) throws IOException {
        Z(20);
        Q(i10, 0);
        if (i11 >= 0) {
            R(i11);
        } else {
            S(i11);
        }
    }

    public final void k0(int i10) throws IOException {
        if (i10 >= 0) {
            q0(i10);
        } else {
            s0(i10);
        }
    }

    public final void l0(int i10, a aVar, u0 u0Var) throws IOException {
        o0(i10, 2);
        q0(aVar.a(u0Var));
        u0Var.a(aVar, this.f641b);
    }

    public final void m0(int i10, String str) throws IOException {
        o0(i10, 2);
        n0(str);
    }

    public final void n0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iW = W(length);
            int i10 = iW + length;
            int i11 = this.f643d;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iT = k1.f638a.t(str, bArr, 0, length);
                q0(iT);
                b0(bArr, 0, iT);
                return;
            }
            if (i10 > i11 - this.f644e) {
                Y();
            }
            int iW2 = W(str.length());
            int i12 = this.f644e;
            byte[] bArr2 = this.f642c;
            try {
                if (iW2 == iW) {
                    int i13 = i12 + iW2;
                    this.f644e = i13;
                    int iT2 = k1.f638a.t(str, bArr2, i13, i11 - i13);
                    this.f644e = i12;
                    R((iT2 - i12) - iW2);
                    this.f644e = iT2;
                } else {
                    int iA = k1.a(str);
                    R(iA);
                    this.f644e = k1.f638a.t(str, bArr2, this.f644e, iA);
                }
            } catch (j1 e3) {
                this.f644e = i12;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (j1 e11) {
            f639g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(x.f684a);
            try {
                q0(bytes.length);
                N(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new CodedOutputStream$OutOfSpaceException(e12);
            }
        }
    }

    public final void o0(int i10, int i11) {
        q0((i10 << 3) | i11);
    }

    public final void p0(int i10, int i11) throws IOException {
        Z(20);
        Q(i10, 0);
        R(i11);
    }

    public final void q0(int i10) throws IOException {
        Z(5);
        R(i10);
    }

    public final void r0(int i10, long j9) {
        Z(20);
        Q(i10, 0);
        S(j9);
    }

    public final void s0(long j9) throws IOException {
        Z(10);
        S(j9);
    }
}
