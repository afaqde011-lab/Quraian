package h0;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class q implements z2.w0 {

    public final b2.d f6454a;

    public final boolean f6455b;

    public q(b2.d dVar, boolean z10) {
        this.f6454a = dVar;
        this.f6455b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f6454a, qVar.f6454a) && this.f6455b == qVar.f6455b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6455b) + (this.f6454a.hashCode() * 31);
    }

    @Override
    public final z2.x0 j(final z2.y0 y0Var, List list, long j9) {
        int iJ;
        int i10;
        z2.l1 l1VarO;
        boolean zIsEmpty = list.isEmpty();
        h00.y yVar = h00.y.A;
        if (zIsEmpty) {
            return y0Var.o0(y3.a.j(j9), y3.a.i(j9), yVar, new xn.a(29));
        }
        long j10 = this.f6455b ? j9 : j9 & (-8589934589L);
        if (list.size() == 1) {
            final z2.v0 v0Var = (z2.v0) list.get(0);
            Object objU = v0Var.U();
            m mVar = objU instanceof m ? (m) objU : null;
            if (mVar != null ? mVar.P : false) {
                iJ = y3.a.j(j9);
                i10 = y3.a.i(j9);
                int iJ2 = y3.a.j(j9);
                int i11 = y3.a.i(j9);
                if (!((i11 >= 0) & (iJ2 >= 0))) {
                    y3.i.a("width and height must be >= 0");
                }
                l1VarO = v0Var.O(y3.b.h(iJ2, iJ2, i11, i11));
            } else {
                l1VarO = v0Var.O(j10);
                iJ = Math.max(y3.a.j(j9), l1VarO.A);
                i10 = Math.max(y3.a.i(j9), l1VarO.B);
            }
            final int i12 = i10;
            final int i13 = iJ;
            final z2.l1 l1Var = l1VarO;
            return y0Var.o0(i13, i12, yVar, new u00.k() {
                public final Object invoke(Object obj) {
                    o.b((z2.k1) obj, l1Var, v0Var, y0Var.getLayoutDirection(), i13, i12, this.f6454a);
                    return g00.b0.a;
                }
            });
        }
        z2.l1[] l1VarArr = new z2.l1[list.size()];
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.A = y3.a.j(j9);
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.A = y3.a.i(j9);
        int size = list.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            z2.v0 v0Var2 = (z2.v0) list.get(i14);
            Object objU2 = v0Var2.U();
            m mVar2 = objU2 instanceof m ? (m) objU2 : null;
            if (mVar2 != null ? mVar2.P : false) {
                z10 = true;
            } else {
                z2.l1 l1VarO2 = v0Var2.O(j10);
                l1VarArr[i14] = l1VarO2;
                xVar.A = Math.max(xVar.A, l1VarO2.A);
                xVar2.A = Math.max(xVar2.A, l1VarO2.B);
            }
        }
        if (z10) {
            int i15 = xVar.A;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = xVar2.A;
            long jA = y3.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list.size();
            for (int i18 = 0; i18 < size2; i18++) {
                z2.v0 v0Var3 = (z2.v0) list.get(i18);
                Object objU3 = v0Var3.U();
                m mVar3 = objU3 instanceof m ? (m) objU3 : null;
                if (mVar3 != null ? mVar3.P : false) {
                    l1VarArr[i18] = v0Var3.O(jA);
                }
            }
        }
        return y0Var.o0(xVar.A, xVar2.A, yVar, new cz.f(l1VarArr, list, y0Var, xVar, xVar2, this, 2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f6454a);
        sb2.append(", propagateMinConstraints=");
        return x5.o(sb2, this.f6455b, ')');
    }
}
