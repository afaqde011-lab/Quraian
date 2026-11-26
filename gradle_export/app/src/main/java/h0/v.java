package h0;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;

public final class v implements z2.w0, r1 {

    public final h f6470a;

    public final b2.c f6471b;

    public v(h hVar, b2.c cVar) {
        this.f6470a = hVar;
        this.f6471b = cVar;
    }

    @Override
    public final int a(z2.l1 l1Var) {
        return l1Var.B;
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6470a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f3 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z2.v0 v0Var = (z2.v0) list.get(i12);
            float fT = c.t(c.s(v0Var));
            int iF0 = v0Var.f0(i10);
            if (fT == 0.0f) {
                i11 += iF0;
            } else if (fT > 0.0f) {
                f3 += fT;
                iMax = Math.max(iMax, Math.round(iF0 / fT));
            }
        }
        return ((list.size() - 1) * iR0) + Math.round(iMax * f3) + i11;
    }

    @Override
    public final long c(int i10, int i11, int i12, boolean z10) {
        return !z10 ? y3.b.a(0, i12, i10, i11) : g4.F(0, i12, i10, i11);
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6470a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iR0, i10);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z2.v0 v0Var = (z2.v0) list.get(i11);
            float fT = c.t(c.s(v0Var));
            if (fT == 0.0f) {
                int iMin2 = Math.min(v0Var.d(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, v0Var.s(iMin2));
            } else if (fT > 0.0f) {
                f3 += fT;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z2.v0 v0Var2 = (z2.v0) list.get(i12);
            float fT2 = c.t(c.s(v0Var2));
            if (fT2 > 0.0f) {
                iMax = Math.max(iMax, v0Var2.s(iRound != Integer.MAX_VALUE ? Math.round(iRound * fT2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override
    public final int e(z2.l1 l1Var) {
        return l1Var.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.f6470a, vVar.f6470a) && kotlin.jvm.internal.m.a(this.f6471b, vVar.f6471b);
    }

    @Override
    public final z2.x0 f(z2.l1[] l1VarArr, z2.y0 y0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return y0Var.o0(i11, i10, h00.y.A, new g1.g2(l1VarArr, this, i11, y0Var, iArr));
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6470a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i11 = 0;
        float f3 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z2.v0 v0Var = (z2.v0) list.get(i12);
            float fT = c.t(c.s(v0Var));
            int iD = v0Var.d(i10);
            if (fT == 0.0f) {
                i11 += iD;
            } else if (fT > 0.0f) {
                f3 += fT;
                iMax = Math.max(iMax, Math.round(iD / fT));
            }
        }
        return ((list.size() - 1) * iR0) + Math.round(iMax * f3) + i11;
    }

    @Override
    public final void h(int i10, int[] iArr, int[] iArr2, z2.y0 y0Var) {
        this.f6470a.b(y0Var, i10, iArr, iArr2);
    }

    public final int hashCode() {
        return this.f6471b.hashCode() + (this.f6470a.hashCode() * 31);
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6470a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iR0, i10);
        int size = list.size();
        int iMax = 0;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z2.v0 v0Var = (z2.v0) list.get(i11);
            float fT = c.t(c.s(v0Var));
            if (fT == 0.0f) {
                int iMin2 = Math.min(v0Var.d(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, v0Var.D(iMin2));
            } else if (fT > 0.0f) {
                f3 += fT;
            }
        }
        int iRound = f3 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i10 - iMin, 0) / f3);
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z2.v0 v0Var2 = (z2.v0) list.get(i12);
            float fT2 = c.t(c.s(v0Var2));
            if (fT2 > 0.0f) {
                iMax = Math.max(iMax, v0Var2.D(iRound != Integer.MAX_VALUE ? Math.round(iRound * fT2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        return c.w(this, y3.a.i(j9), y3.a.j(j9), y3.a.g(j9), y3.a.h(j9), y0Var.R0(this.f6470a.a()), y0Var, list, new z2.l1[list.size()], 0, list.size(), null, 0);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f6470a + ", horizontalAlignment=" + this.f6471b + ')';
    }
}
