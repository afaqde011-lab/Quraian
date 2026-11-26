package r9;

import kotlin.jvm.internal.d0;
import u00.k;
import u00.n;
import w.j0;
import w.v;

public final class d implements k {
    public final boolean A;
    public final q9.c B;
    public final int C;
    public final n D;
    public final boolean E;
    public final k F;
    public final k G;

    public d(boolean z10, q9.c cVar, int i10, n nVar, boolean z11, k kVar, k kVar2) {
        this.A = z10;
        this.B = cVar;
        this.C = i10;
        this.D = nVar;
        this.E = z11;
        this.F = kVar;
        this.G = kVar2;
    }

    public final Object invoke(Object obj) {
        n nVar;
        j0 j0Var;
        j0 j0Var2;
        j0 j0Var3;
        v vVar = (v) obj;
        boolean z10 = this.A;
        q9.c cVar = this.B;
        if (z10) {
            Object obj2 = cVar.c().get("predictivePopTransitionSpec");
            nVar = d0.f(2, obj2) ? (n) obj2 : null;
            int i10 = this.C;
            return (nVar == null || (j0Var3 = (j0) nVar.invoke(vVar, Integer.valueOf(i10))) == null) ? (j0) this.D.invoke(vVar, Integer.valueOf(i10)) : j0Var3;
        }
        if (this.E) {
            Object obj3 = cVar.c().get("popTransitionSpec");
            nVar = d0.f(1, obj3) ? (k) obj3 : null;
            return (nVar == null || (j0Var2 = (j0) nVar.invoke(vVar)) == null) ? (j0) this.F.invoke(vVar) : j0Var2;
        }
        Object obj4 = cVar.c().get("transitionSpec");
        nVar = d0.f(1, obj4) ? (k) obj4 : null;
        return (nVar == null || (j0Var = (j0) nVar.invoke(vVar)) == null) ? (j0) this.G.invoke(vVar) : j0Var;
    }
}
