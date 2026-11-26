package o0;

import b2.o;
import b2.r;
import f0.i;
import g1.z5;
import j3.k;
import z.s0;

public abstract class c {
    public static r a(r rVar, boolean z10, i iVar, z5 z5Var, boolean z11, u00.a aVar) {
        r rVarV;
        if (z5Var != null) {
            rVarV = new a(z10, iVar, z5Var, z11, aVar);
        } else if (z5Var == null) {
            rVarV = new a(z10, iVar, null, z11, aVar);
        } else {
            o oVar = o.A;
            rVarV = iVar != null ? s0.a(oVar, iVar, z5Var).V(new a(z10, iVar, null, z11, aVar)) : b2.a.a(oVar, new b(z5Var, z10, z11, aVar));
        }
        return rVar.V(rVarV);
    }

    public static final r b(l3.a aVar, z5 z5Var, boolean z10, k kVar, u00.a aVar2) {
        if (z5Var != null) {
            return new f(aVar, null, z5Var, z10, kVar, aVar2);
        }
        if (z5Var == null) {
            return new f(aVar, null, null, z10, kVar, aVar2);
        }
        return b2.a.a(o.A, new e(z5Var, aVar, z10, kVar, aVar2));
    }
}
