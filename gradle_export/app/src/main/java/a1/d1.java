package a1;

import com.google.android.gms.cast.Cast;

public final class d1 implements CharSequence {
    public CharSequence A;
    public i0 B;
    public int C;
    public int D;

    public final void a(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (i10 > i11) {
            g0.a.a("start=" + i10 + " > end=" + i11);
        }
        if (i12 > i13) {
            g0.a.a("textStart=" + i12 + " > textEnd=" + i13);
        }
        if (i10 < 0) {
            g0.a.a("start must be non-negative, but was " + i10);
        }
        if (i12 < 0) {
            g0.a.a("textStart must be non-negative, but was " + i12);
        }
        i0 i0Var = this.B;
        int i14 = i13 - i12;
        if (i0Var == null) {
            int iMax = Math.max(255, i14 + Cast.MAX_NAMESPACE_LENGTH);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(this.A.length() - i11, 64);
            int i15 = i10 - iMin;
            x0.E(this.A, cArr, 0, i15, i10);
            int i16 = iMax - iMin2;
            int i17 = iMin2 + i11;
            x0.E(this.A, cArr, i16, i11, i17);
            x0.E(charSequence, cArr, iMin, i12, i13);
            i0 i0Var2 = new i0(0);
            i0Var2.f55b = iMax;
            i0Var2.f56c = cArr;
            i0Var2.f57d = iMin + i14;
            i0Var2.f58e = i16;
            this.B = i0Var2;
            this.C = i15;
            this.D = i17;
            return;
        }
        int i18 = this.C;
        int i19 = i10 - i18;
        int i20 = i11 - i18;
        if (i19 < 0 || i20 > i0Var.f55b - i0Var.a()) {
            this.A = toString();
            this.B = null;
            this.C = -1;
            this.D = -1;
            a(i10, i11, charSequence, i12, i13);
            return;
        }
        int i21 = i14 - (i20 - i19);
        if (i21 > i0Var.a()) {
            int iA = i21 - i0Var.a();
            int i22 = i0Var.f55b;
            do {
                i22 *= 2;
            } while (i22 - i0Var.f55b < iA);
            char[] cArr2 = new char[i22];
            h00.n.s0(i0Var.f56c, cArr2, 0, 0, i0Var.f57d);
            int i23 = i0Var.f55b;
            int i24 = i0Var.f58e;
            int i25 = i23 - i24;
            int i26 = i22 - i25;
            h00.n.s0(i0Var.f56c, cArr2, i26, i24, i25 + i24);
            i0Var.f56c = cArr2;
            i0Var.f55b = i22;
            i0Var.f58e = i26;
        }
        int i27 = i0Var.f57d;
        if (i19 < i27 && i20 <= i27) {
            int i28 = i27 - i20;
            char[] cArr3 = i0Var.f56c;
            h00.n.s0(cArr3, cArr3, i0Var.f58e - i28, i20, i27);
            i0Var.f57d = i19;
            i0Var.f58e -= i28;
        } else if (i19 >= i27 || i20 < i27) {
            int iA2 = i0Var.a() + i19;
            int iA3 = i0Var.a() + i20;
            int i29 = i0Var.f58e;
            char[] cArr4 = i0Var.f56c;
            h00.n.s0(cArr4, cArr4, i0Var.f57d, i29, iA2);
            i0Var.f57d += iA2 - i29;
            i0Var.f58e = iA3;
        } else {
            i0Var.f58e = i0Var.a() + i20;
            i0Var.f57d = i19;
        }
        x0.E(charSequence, i0Var.f56c, i0Var.f57d, i12, i13);
        i0Var.f57d += i14;
    }

    @Override
    public final char charAt(int i10) {
        i0 i0Var = this.B;
        if (i0Var != null && i10 >= this.C) {
            int iA = i0Var.f55b - i0Var.a();
            int i11 = this.C;
            if (i10 >= iA + i11) {
                return this.A.charAt(i10 - ((iA - this.D) + i11));
            }
            int i12 = i10 - i11;
            int i13 = i0Var.f57d;
            return i12 < i13 ? i0Var.f56c[i12] : i0Var.f56c[(i12 - i13) + i0Var.f58e];
        }
        return this.A.charAt(i10);
    }

    @Override
    public final int length() {
        i0 i0Var = this.B;
        if (i0Var == null) {
            return this.A.length();
        }
        return (i0Var.f55b - i0Var.a()) + (this.A.length() - (this.D - this.C));
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return toString().subSequence(i10, i11);
    }

    @Override
    public final String toString() {
        i0 i0Var = this.B;
        if (i0Var == null) {
            return this.A.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A, 0, this.C);
        sb2.append(i0Var.f56c, 0, i0Var.f57d);
        char[] cArr = i0Var.f56c;
        int i10 = i0Var.f58e;
        sb2.append(cArr, i10, i0Var.f55b - i10);
        CharSequence charSequence = this.A;
        sb2.append(charSequence, this.D, charSequence.length());
        return sb2.toString();
    }
}
