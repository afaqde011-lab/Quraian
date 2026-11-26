package s20;

import e30.a0;
import e30.a1;
import e30.f0;
import e30.h0;
import kotlin.NoWhenBranchMatchedException;

public final class t extends g {
    public t(n20.b bVar, int i) {
        super(new r(new f(bVar, i)));
    }

    @Override
    public final e30.w a(j10.z module) {
        e30.w wVarC;
        kotlin.jvm.internal.m.e(module, "module");
        h0.B.getClass();
        h0 h0Var = h0.C;
        g10.i iVarD = module.d();
        iVarD.getClass();
        j10.e eVarJ = iVarD.j(g10.o.Q.i());
        Object obj = this.a;
        s sVar = (s) obj;
        if (sVar instanceof q) {
            wVarC = ((q) obj).a;
        } else {
            if (!(sVar instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = ((r) obj).a;
            n20.b bVar = fVar.a;
            int i = fVar.b;
            j10.e eVarD = j10.w.d(module, bVar);
            if (eVarD == null) {
                wVarC = g30.l.c(g30.k.D, bVar.toString(), String.valueOf(i));
            } else {
                a0 a0VarN = eVarD.n();
                kotlin.jvm.internal.m.d(a0VarN, "getDefaultType(...)");
                e30.w wVarZ0 = ab.a0.z0(a0VarN);
                for (int i2 = 0; i2 < i; i2++) {
                    g10.i iVarD2 = module.d();
                    a1 a1Var = a1.C;
                    wVarZ0 = iVarD2.h(wVarZ0);
                }
                wVarC = wVarZ0;
            }
        }
        return e30.c.t(h0Var, eVarJ, va.a.R(new f0(wVarC)));
    }
}
