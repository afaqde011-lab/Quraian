package ol;

import b2.g;
import b2.o;
import b2.r;
import ev.p;
import h.e;
import h0.z1;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.q;
import l1.q2;
import l1.r1;
import l1.z0;
import m3.c0;
import u00.k;
import u00.n;
import w.s0;
import x.b1;
import x.y;

public abstract class a {
    public static final q2 a = new q2(new e(18));

    public static final void a(b hostState, r rVar, j jVar, int i) {
        m.e(hostState, "hostState");
        g0 g0Var = (g0) jVar;
        g0Var.e0(440290656);
        int i2 = (g0Var.g(hostState) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            bl.a aVar = (bl.a) hostState.a.getValue();
            Object objN = g0Var.N();
            Object obj = i.a;
            if (objN == obj) {
                objN = q.z((Object) null);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            if (aVar != null) {
                z0Var.setValue(aVar);
            }
            Long lValueOf = aVar != null ? Long.valueOf(aVar.a) : null;
            boolean zG = ((i2 & 14) == 4) | g0Var.g(aVar);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj) {
                objN2 = new p(aVar, hostState, null, 29);
                g0Var.n0(objN2);
            }
            q.i(lValueOf, g0Var, (n) objN2);
            gm.a aVar2 = (gm.a) g0Var.k(dl.e.a);
            boolean z = aVar2 == gm.a.B;
            float fA = aVar2.a();
            boolean z2 = aVar != null;
            o oVar = o.A;
            r rVarV = rVar.V(z ? z1.x(oVar, (g) null, 3) : z1.d(oVar, 1.0f));
            b1 b1VarV = x.c.v(0.86f, 400.0f, (Object) null, 4);
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new c0(18);
                g0Var.n0(objN3);
            }
            w.c0.c(z2, rVarV, s0.j((k) objN3, b1VarV).a(s0.c((y) null, 3)), s0.d((y) null, 3), (String) null, v1.d.d(1428390280, new as.c0(z0Var, fA, 4), g0Var), g0Var, 200064, 16);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(hostState, rVar, i, 11);
        }
    }
}
