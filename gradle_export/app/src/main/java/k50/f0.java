package k50;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class f0 extends l {
    public final transient byte[][] E;
    public final transient int[] F;

    public f0(byte[][] bArr, int[] iArr) {
        super(l.D.A);
        this.E = bArr;
        this.F = iArr;
    }

    @Override
    public final String a() {
        throw null;
    }

    @Override
    public final l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.E;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.F;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.b(bArrDigest);
        return new l(bArrDigest);
    }

    @Override
    public final int d() {
        return this.F[this.E.length - 1];
    }

    @Override
    public final String e() {
        return t().e();
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.d() == d() && l(0, lVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f(int i, byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        return t().f(i, other);
    }

    @Override
    public final byte[] h() {
        return s();
    }

    @Override
    public final int hashCode() {
        int i = this.B;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.E;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.F;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.B = i3;
        return i3;
    }

    @Override
    public final byte i(int i) {
        byte[][] bArr = this.E;
        int length = bArr.length - 1;
        int[] iArr = this.F;
        ab.a0.u(iArr[length], i, 1L);
        int iG = l50.b.g(this, i);
        return bArr[iG][(i - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override
    public final int j(byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        return t().j(other);
    }

    @Override
    public final boolean l(int i, l other, int i2) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i >= 0 && i <= d() - i2) {
            int i3 = i2 + i;
            int iG = l50.b.g(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.F;
                int i5 = iG == 0 ? 0 : iArr[iG - 1];
                int i6 = iArr[iG] - i5;
                byte[][] bArr = this.E;
                int i7 = iArr[bArr.length + iG];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (other.m(i4, bArr[iG], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean m(int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i < 0 || i > d() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iG = l50.b.g(this, i);
        while (i < i4) {
            int[] iArr = this.F;
            int i5 = iG == 0 ? 0 : iArr[iG - 1];
            int i6 = iArr[iG] - i5;
            byte[][] bArr = this.E;
            int i7 = iArr[bArr.length + iG];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!ab.a0.o(bArr[iG], (i - i5) + i7, other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iG++;
        }
        return true;
    }

    @Override
    public final l n(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("beginIndex=", i, " < 0").toString());
        }
        if (i2 > d()) {
            StringBuilder sbQ = oi.k.q("endIndex=", i2, " > length(");
            sbQ.append(d());
            sbQ.append(')');
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(w.c.h(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == d()) {
            return this;
        }
        if (i == i2) {
            return l.D;
        }
        int iG = l50.b.g(this, i);
        int iG2 = l50.b.g(this, i2 - 1);
        byte[][] bArr = this.E;
        byte[][] bArr2 = (byte[][]) h00.n.x0(bArr, iG, iG2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.F;
        if (iG <= iG2) {
            int i4 = iG;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iG2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new f0(bArr2, iArr);
    }

    @Override
    public final l p() {
        return t().p();
    }

    @Override
    public final void r(i iVar, int i) {
        int iG = l50.b.g(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.F;
            int i3 = iG == 0 ? 0 : iArr[iG - 1];
            int i4 = iArr[iG] - i3;
            byte[][] bArr = this.E;
            int i5 = iArr[bArr.length + iG];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            d0 d0Var = new d0(bArr[iG], i6, i6 + iMin, true);
            d0 d0Var2 = iVar.A;
            if (d0Var2 == null) {
                d0Var.g = d0Var;
                d0Var.f = d0Var;
                iVar.A = d0Var;
            } else {
                d0 d0Var3 = d0Var2.g;
                kotlin.jvm.internal.m.b(d0Var3);
                d0Var3.b(d0Var);
            }
            i2 += iMin;
            iG++;
        }
        iVar.B += (long) i;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.E;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.F;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            h00.n.r0(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final l t() {
        return new l(s());
    }

    @Override
    public final String toString() {
        return t().toString();
    }
}
