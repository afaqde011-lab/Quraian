package h0;

import com.google.protobuf.RuntimeVersion;

public final class f implements e, h {

    public final float f6402a;

    public final boolean f6403b;

    public final g f6404c;

    public final float f6405d;

    public f(float f3, boolean z10, g gVar) {
        this.f6402a = f3;
        this.f6403b = z10;
        this.f6404c = gVar;
        this.f6405d = f3;
    }

    @Override
    public final float a() {
        return this.f6405d;
    }

    @Override
    public final void b(y3.c cVar, int i10, int[] iArr, int[] iArr2) {
        c(cVar, i10, iArr, y3.m.A, iArr2);
    }

    @Override
    public final void c(y3.c cVar, int i10, int[] iArr, y3.m mVar, int[] iArr2) {
        int i11;
        if (iArr.length == 0) {
            return;
        }
        int iR0 = cVar.R0(this.f6402a);
        boolean z10 = this.f6403b && mVar == y3.m.B;
        if (z10) {
            int length = iArr.length;
            int i12 = 0;
            int iMin = 0;
            int i13 = 0;
            while (i12 < length) {
                int iMax = Math.max(0, i10 - iArr[i12]);
                iArr2[i13] = iMax;
                iMin = Math.min(iR0, iMax);
                i10 = iArr2[i13] - iMin;
                i12++;
                i13++;
            }
            i11 = i10 + iMin;
        } else {
            int length2 = iArr.length;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i14 < length2) {
                int i18 = iArr[i14];
                int iMin2 = Math.min(i15, i10 - i18);
                iArr2[i17] = iMin2;
                int iMin3 = Math.min(iR0, (i10 - iMin2) - i18);
                int i19 = iArr2[i17] + i18 + iMin3;
                i14++;
                i16 = iMin3;
                i15 = i19;
                i17++;
            }
            i11 = i10 - (i15 - i16);
        }
        g gVar = this.f6404c;
        if (gVar == null || i11 <= 0) {
            return;
        }
        int iK = gVar.k(i11, mVar);
        if (z10) {
            iK -= i11;
        }
        if (iK != 0) {
            int length3 = iArr2.length;
            for (int i20 = 0; i20 < length3; i20++) {
                iArr2[i20] = iArr2[i20] + iK;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return y3.f.b(this.f6402a, fVar.f6402a) && this.f6403b == fVar.f6403b && kotlin.jvm.internal.m.a(this.f6404c, fVar.f6404c);
    }

    public final int hashCode() {
        int iE = w.c.e(Float.hashCode(this.f6402a) * 31, 31, this.f6403b);
        g gVar = this.f6404c;
        return iE + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6403b ? RuntimeVersion.SUFFIX : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        w.c.r(this.f6402a, sb2, ", ");
        sb2.append(this.f6404c);
        sb2.append(')');
        return sb2.toString();
    }
}
