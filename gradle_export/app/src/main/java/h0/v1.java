package h0;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;

public final class v1 implements z2.w0, r1 {

    public final e f6472a;

    public final b2.h f6473b;

    public v1(e eVar, b2.h hVar) {
        this.f6472a = eVar;
        this.f6473b = hVar;
    }

    @Override
    public final int a(z2.l1 l1Var) {
        return l1Var.A;
    }

    @Override
    public final int b(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6472a.a());
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
                int iMin2 = Math.min(v0Var.D(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, v0Var.f0(iMin2));
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
                iMax = Math.max(iMax, v0Var2.f0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fT2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override
    public final long c(int i10, int i11, int i12, boolean z10) {
        return !z10 ? y3.b.a(i10, i11, 0, i12) : g4.G(i10, i11, 0, i12);
    }

    @Override
    public final int d(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6472a.a());
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
            int iS = v0Var.s(i10);
            if (fT == 0.0f) {
                i11 += iS;
            } else if (fT > 0.0f) {
                f3 += fT;
                iMax = Math.max(iMax, Math.round(iS / fT));
            }
        }
        return ((list.size() - 1) * iR0) + Math.round(iMax * f3) + i11;
    }

    @Override
    public final int e(z2.l1 l1Var) {
        return l1Var.B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return kotlin.jvm.internal.m.a(this.f6472a, v1Var.f6472a) && kotlin.jvm.internal.m.a(this.f6473b, v1Var.f6473b);
    }

    @Override
    public final z2.x0 f(z2.l1[] l1VarArr, z2.y0 y0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        return y0Var.o0(i10, i11, h00.y.A, new u1(l1VarArr, this, i11, iArr));
    }

    @Override
    public final int g(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6472a.a());
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
                int iMin2 = Math.min(v0Var.D(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, v0Var.d(iMin2));
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
                iMax = Math.max(iMax, v0Var2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fT2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override
    public final void h(int i10, int[] iArr, int[] iArr2, z2.y0 y0Var) {
        this.f6472a.c(y0Var, i10, iArr, y0Var.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return this.f6473b.hashCode() + (this.f6472a.hashCode() * 31);
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) {
        int iR0 = wVar.R0(this.f6472a.a());
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
            int iD = v0Var.D(i10);
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
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        return c.w(this, y3.a.j(j9), y3.a.i(j9), y3.a.h(j9), y3.a.g(j9), y0Var.R0(this.f6472a.a()), y0Var, list, new z2.l1[list.size()], 0, list.size(), null, 0);
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f6472a + ", verticalAlignment=" + this.f6473b + ')';
    }
}
