package androidx.glance.appwidget.protobuf;

import com.google.android.gms.cast.Cast;
import java.io.IOException;
import java.io.OutputStream;

public final class n extends o {

    public final byte[] f926e;

    public final int f927f;

    public int f928g;

    public final OutputStream f929h;

    public n(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f926e = new byte[iMax];
        this.f927f = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f929h = outputStream;
    }

    @Override
    public final void A0(int i10, long j9) throws IOException {
        I0(20);
        E0(i10, 0);
        G0(j9);
    }

    @Override
    public final void B0(long j9) throws IOException {
        I0(10);
        G0(j9);
    }

    public final void C0(int i10) {
        int i11 = this.f928g;
        int i12 = i11 + 1;
        this.f928g = i12;
        byte[] bArr = this.f926e;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f928g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f928g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f928g = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void D0(long j9) {
        int i10 = this.f928g;
        int i11 = i10 + 1;
        this.f928g = i11;
        byte[] bArr = this.f926e;
        bArr[i10] = (byte) (j9 & 255);
        int i12 = i10 + 2;
        this.f928g = i12;
        bArr[i11] = (byte) ((j9 >> 8) & 255);
        int i13 = i10 + 3;
        this.f928g = i13;
        bArr[i12] = (byte) ((j9 >> 16) & 255);
        int i14 = i10 + 4;
        this.f928g = i14;
        bArr[i13] = (byte) (255 & (j9 >> 24));
        int i15 = i10 + 5;
        this.f928g = i15;
        bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f928g = i16;
        bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f928g = i17;
        bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
        this.f928g = i10 + 8;
        bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
    }

    public final void E0(int i10, int i11) {
        F0((i10 << 3) | i11);
    }

    public final void F0(int i10) {
        boolean z10 = o.f933d;
        byte[] bArr = this.f926e;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f928g;
                this.f928g = i11 + 1;
                i1.k(bArr, i11, (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f928g;
            this.f928g = i12 + 1;
            i1.k(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f928g;
            this.f928g = i13 + 1;
            bArr[i13] = (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f928g;
        this.f928g = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void G0(long j9) {
        boolean z10 = o.f933d;
        byte[] bArr = this.f926e;
        if (z10) {
            while ((j9 & (-128)) != 0) {
                int i10 = this.f928g;
                this.f928g = i10 + 1;
                i1.k(bArr, i10, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                j9 >>>= 7;
            }
            int i11 = this.f928g;
            this.f928g = i11 + 1;
            i1.k(bArr, i11, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            int i12 = this.f928g;
            this.f928g = i12 + 1;
            bArr[i12] = (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255);
            j9 >>>= 7;
        }
        int i13 = this.f928g;
        this.f928g = i13 + 1;
        bArr[i13] = (byte) j9;
    }

    public final void H0() throws IOException {
        this.f929h.write(this.f926e, 0, this.f928g);
        this.f928g = 0;
    }

    public final void I0(int i10) throws IOException {
        if (this.f927f - this.f928g < i10) {
            H0();
        }
    }

    public final void J0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f928g;
        int i13 = this.f927f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f926e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f928g += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f928g = i13;
        H0();
        if (i16 > i13) {
            this.f929h.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f928g = i16;
        }
    }

    @Override
    public final void b0(byte[] bArr, int i10, int i11) throws IOException {
        J0(bArr, i10, i11);
    }

    @Override
    public final void m0(byte b7) throws IOException {
        if (this.f928g == this.f927f) {
            H0();
        }
        int i10 = this.f928g;
        this.f928g = i10 + 1;
        this.f926e[i10] = b7;
    }

    @Override
    public final void n0(int i10, boolean z10) throws IOException {
        I0(11);
        E0(i10, 0);
        byte b7 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f928g;
        this.f928g = i11 + 1;
        this.f926e[i11] = b7;
    }

    @Override
    public final void o0(int i10, i iVar) throws IOException {
        x0(i10, 2);
        z0(iVar.size());
        h hVar = (h) iVar;
        b0(hVar.D, hVar.h(), hVar.size());
    }

    @Override
    public final void p0(int i10, int i11) throws IOException {
        I0(14);
        E0(i10, 5);
        C0(i11);
    }

    @Override
    public final void q0(int i10) throws IOException {
        I0(4);
        C0(i10);
    }

    @Override
    public final void r0(int i10, long j9) throws IOException {
        I0(18);
        E0(i10, 1);
        D0(j9);
    }

    @Override
    public final void s0(long j9) throws IOException {
        I0(8);
        D0(j9);
    }

    @Override
    public final void t0(int i10, int i11) throws IOException {
        I0(20);
        E0(i10, 0);
        if (i11 >= 0) {
            F0(i11);
        } else {
            G0(i11);
        }
    }

    @Override
    public final void u0(int i10) throws IOException {
        if (i10 >= 0) {
            z0(i10);
        } else {
            B0(i10);
        }
    }

    @Override
    public final void v0(int i10, a aVar, z0 z0Var) throws IOException {
        x0(i10, 2);
        z0(aVar.b(z0Var));
        z0Var.d(aVar, this.f934b);
    }

    @Override
    public final void w0(int i10, String str) throws IOException {
        x0(i10, 2);
        try {
            int length = str.length() * 3;
            int iJ0 = o.j0(length);
            int i11 = iJ0 + length;
            int i12 = this.f927f;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int iC = l1.f922a.C(str, bArr, 0, length);
                z0(iC);
                J0(bArr, 0, iC);
                return;
            }
            if (i11 > i12 - this.f928g) {
                H0();
            }
            int iJ1 = o.j0(str.length());
            int i13 = this.f928g;
            byte[] bArr2 = this.f926e;
            try {
                if (iJ1 != iJ0) {
                    int iB = l1.b(str);
                    F0(iB);
                    this.f928g = l1.f922a.C(str, bArr2, this.f928g, iB);
                    return;
                }
                int i14 = i13 + iJ1;
                this.f928g = i14;
                int iC2 = l1.f922a.C(str, bArr2, i14, i12 - i14);
                this.f928g = i13;
                F0((iC2 - i13) - iJ1);
                this.f928g = iC2;
            } catch (k1 e3) {
                this.f928g = i13;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(e10);
            }
        } catch (k1 e11) {
            l0(str, e11);
        }
    }

    @Override
    public final void x0(int i10, int i11) throws IOException {
        z0((i10 << 3) | i11);
    }

    @Override
    public final void y0(int i10, int i11) throws IOException {
        I0(20);
        E0(i10, 0);
        F0(i11);
    }

    @Override
    public final void z0(int i10) throws IOException {
        I0(5);
        F0(i10);
    }
}
