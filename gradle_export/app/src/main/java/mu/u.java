package mu;

import h0.z1;
import java.util.List;
import l1.g0;
import l1.r1;

public abstract class u {
    public static final float a = 78;

    public static final void a(ju.f page, lu.z zVar, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        Object objZ0;
        Object obj;
        kotlin.jvm.internal.m.e(page, "page");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-538063376);
        int i2 = (jVar3.g(page) ? 4 : 2) | i | (jVar3.g(zVar) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((gm.a) jVar3.k(dl.e.a)) == gm.a.B;
            u30.b bVar = zVar.j.c;
            boolean zH = jVar3.h(z) | jVar3.g(bVar);
            Object objN = jVar3.N();
            if (zH) {
                if (z) {
                    objZ0 = bVar;
                } else {
                    objZ0 = bVar;
                }
                jVar3.n0(objZ0);
                obj = objZ0;
            } else {
                obj = objN;
                if (objN == l1.i.a) {
                    if (z || ((h00.b) bVar).a() % 2 == 0) {
                        objZ0 = bVar;
                    } else {
                        objZ0 = h00.q.Z0(h00.q.L0(bVar), bVar);
                    }
                    jVar3.n0(objZ0);
                    obj = objZ0;
                }
            }
            b2.r rVarV = rVar.V(z1.c);
            v1.c cVarD = v1.d.d(1670709574, new eu.p(2, (List) obj, page, zVar, bVar, z), jVar3);
            jVar2 = jVar3;
            h0.c.a(rVarV, (b2.d) null, false, cVarD, jVar2, 3072, 6);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 21, page, zVar, rVar);
        }
    }
}
