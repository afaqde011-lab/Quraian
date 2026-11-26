package g1;

import java.util.List;

public final class q4 implements u00.k {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public q4(qr.g gVar, to.a aVar, boolean z10, u00.k kVar, u00.k kVar2, u00.k kVar3, u00.k kVar4) {
        this.A = 2;
        this.C = gVar;
        this.D = aVar;
        this.B = z10;
        this.E = kVar;
        this.F = kVar2;
        this.G = kVar3;
        this.H = kVar4;
    }

    public q4(boolean z10, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.A = i10;
        this.B = z10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
        this.G = obj5;
        this.H = obj6;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        boolean z10 = this.B;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        Object obj5 = this.E;
        Object obj6 = this.D;
        Object obj7 = this.C;
        switch (i10) {
            case 0:
                m6 m6Var = (m6) obj7;
                fc.n nVar = m6Var.f5887d;
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                u00.a aVar = (u00.a) obj3;
                a40.z zVar = (a40.z) obj2;
                j3.a0 a0Var = (j3.a0) obj;
                if (z10) {
                    es.b bVar = new es.b(3, aVar);
                    a10.w[] wVarArr = j3.y.f8004a;
                    a0Var.a(j3.n.f7959v, new j3.a(str, bVar));
                    n6 n6Var = (n6) ((l1.i1) nVar.f5632g).getValue();
                    n6 n6Var2 = n6.C;
                    if (n6Var == n6Var2) {
                        a0Var.a(j3.n.f7957t, new j3.a(str2, new d0.g(m6Var, zVar, m6Var, 1)));
                    } else if (nVar.g().f6524a.containsKey(n6Var2)) {
                        a0Var.a(j3.n.f7958u, new j3.a(str3, new a1.o1(m6Var, zVar, 11)));
                    }
                }
                break;
            case 1:
                List list = (List) obj7;
                List list2 = (List) obj6;
                ju.l lVar = (ju.l) obj4;
                j0.h hVar = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar, "$this$LazyColumn");
                hVar.p("social_proof_header", "header", new v1.c(new bz.o((ju.f) obj5, lVar, (lu.z) obj3, (u30.b) obj2, 8), -2073916831, true));
                if (!z10) {
                    hVar.r(list2.size(), new a1.v2(new m3.b0(20), list2, 26), new as.r0(16, list2), new v1.c(new mu.t(list2, list2, lVar, 1), 2039820996, true));
                } else {
                    hVar.r(list.size(), new a1.v2(new m3.b0(19), list, 25), new as.r0(15, list), new v1.c(new mu.t(list, list, lVar, 0), 2039820996, true));
                }
                break;
            default:
                qr.g gVar = (qr.g) obj7;
                to.a aVar2 = (to.a) obj6;
                u00.k kVar = (u00.k) obj5;
                u00.k kVar2 = (u00.k) obj4;
                u00.k kVar3 = (u00.k) obj3;
                u00.k kVar4 = (u00.k) obj2;
                j0.h hVar2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar2, "$this$LazyRow");
                if (!gVar.c) {
                    h00.b bVar2 = gVar.b;
                    hVar2.r(bVar2.a(), new q0.w0(new wp.a(2), bVar2, 7), new as.r0(23, bVar2), new v1.c(new wr.j(bVar2, this.B, aVar2, kVar, kVar2, kVar3, kVar4), 802480018, true));
                } else {
                    j0.h.s(hVar2, 2, null, new v1.c(new j0.g(aVar2, 4), 1661013367, true), 6);
                }
                break;
        }
        return b0Var;
    }
}
