package androidx.glance.appwidget.protobuf;

import com.google.android.gms.cast.Cast;

public final class m extends o {

    public final byte[] f923e;

    public final int f924f;

    public int f925g;

    public m(int i10, byte[] bArr) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f923e = bArr;
        this.f925g = 0;
        this.f924f = i10;
    }

    @Override
    public final void A0(int i10, long j9) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 0);
        B0(j9);
    }

    @Override
    public final void B0(long j9) throws CodedOutputStream$OutOfSpaceException {
        boolean z10 = o.f933d;
        byte[] bArr = this.f923e;
        if (z10 && C0() >= 10) {
            while ((j9 & (-128)) != 0) {
                int i10 = this.f925g;
                this.f925g = i10 + 1;
                i1.k(bArr, i10, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                j9 >>>= 7;
            }
            int i11 = this.f925g;
            this.f925g = i11 + 1;
            i1.k(bArr, i11, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            try {
                int i12 = this.f925g;
                this.f925g = i12 + 1;
                bArr[i12] = (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255);
                j9 >>>= 7;
            } catch (IndexOutOfBoundsException e3) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
            }
        }
        int i13 = this.f925g;
        this.f925g = i13 + 1;
        bArr[i13] = (byte) j9;
    }

    public final int C0() {
        return this.f924f - this.f925g;
    }

    @Override
    public final void b0(byte[] bArr, int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i10, this.f923e, this.f925g, i11);
            this.f925g += i11;
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), Integer.valueOf(i11)), e3);
        }
    }

    @Override
    public final void m0(byte b7) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f923e;
            int i10 = this.f925g;
            this.f925g = i10 + 1;
            bArr[i10] = b7;
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
        }
    }

    @Override
    public final void n0(int i10, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 0);
        m0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override
    public final void o0(int i10, i iVar) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 2);
        z0(iVar.size());
        h hVar = (h) iVar;
        b0(hVar.D, hVar.h(), hVar.size());
    }

    @Override
    public final void p0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 5);
        q0(i11);
    }

    @Override
    public final void q0(int i10) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f923e;
            int i11 = this.f925g;
            int i12 = i11 + 1;
            this.f925g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f925g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f925g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f925g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
        }
    }

    @Override
    public final void r0(int i10, long j9) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 1);
        s0(j9);
    }

    @Override
    public final void s0(long j9) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f923e;
            int i10 = this.f925g;
            int i11 = i10 + 1;
            this.f925g = i11;
            bArr[i10] = (byte) (((int) j9) & 255);
            int i12 = i10 + 2;
            this.f925g = i12;
            bArr[i11] = (byte) (((int) (j9 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f925g = i13;
            bArr[i12] = (byte) (((int) (j9 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f925g = i14;
            bArr[i13] = (byte) (((int) (j9 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f925g = i15;
            bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f925g = i16;
            bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f925g = i17;
            bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
            this.f925g = i10 + 8;
            bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
        }
    }

    @Override
    public final void t0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 0);
        u0(i11);
    }

    @Override
    public final void u0(int i10) throws CodedOutputStream$OutOfSpaceException {
        if (i10 >= 0) {
            z0(i10);
        } else {
            B0(i10);
        }
    }

    @Override
    public final void v0(int i10, a aVar, z0 z0Var) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 2);
        z0(aVar.b(z0Var));
        z0Var.d(aVar, this.f934b);
    }

    @Override
    public final void w0(int i10, String str) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 2);
        int i11 = this.f925g;
        try {
            int iJ0 = o.j0(str.length() * 3);
            int iJ1 = o.j0(str.length());
            byte[] bArr = this.f923e;
            if (iJ1 != iJ0) {
                z0(l1.b(str));
                this.f925g = l1.f922a.C(str, bArr, this.f925g, C0());
                return;
            }
            int i12 = i11 + iJ1;
            this.f925g = i12;
            int iC = l1.f922a.C(str, bArr, i12, C0());
            this.f925g = i11;
            z0((iC - i11) - iJ1);
            this.f925g = iC;
        } catch (k1 e3) {
            this.f925g = i11;
            l0(str, e3);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(e10);
        }
    }

    @Override
    public final void x0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        z0((i10 << 3) | i11);
    }

    @Override
    public final void y0(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        x0(i10, 0);
        z0(i11);
    }

    @Override
    public final void z0(int i10) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f923e;
            if (i11 == 0) {
                int i12 = this.f925g;
                this.f925g = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f925g;
                    this.f925g = i13 + 1;
                    bArr[i13] = (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f925g), Integer.valueOf(this.f924f), 1), e3);
        }
    }
}
