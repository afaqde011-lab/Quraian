package q0;

import a1.w2;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class s implements u00.a {
    public final int A = 0;
    public final boolean B;
    public final boolean C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public s(w2 w2Var, h1.l lVar, b1.e0 e0Var, q2.a aVar, c3.g1 g1Var, y yVar, y3.c cVar, boolean z10, boolean z11) {
        this.D = w2Var;
        this.E = lVar;
        this.F = e0Var;
        this.G = aVar;
        this.H = g1Var;
        this.I = cVar;
        this.B = z10;
        this.C = z11;
    }

    public s(t9.a aVar, boolean z10, u00.a aVar2, u00.a aVar3, boolean z11, u00.a aVar4, u00.a aVar5, t9.d dVar) {
        this.D = aVar;
        this.B = z10;
        this.E = aVar2;
        this.F = aVar3;
        this.C = z11;
        this.G = aVar4;
        this.H = aVar5;
        this.I = dVar;
    }

    public final Object invoke() {
        w0.j jVar;
        a40.u1 u1Var;
        s9.i iVar;
        s9.i iVar2;
        switch (this.A) {
            case 0:
                w2 w2Var = (w2) this.D;
                h1.l lVar = (h1.l) this.E;
                b1.e0 e0Var = (b1.e0) this.F;
                q2.a aVar = (q2.a) this.G;
                c3.g1 g1Var = (c3.g1) this.H;
                y3.c cVar = (y3.c) this.I;
                w2Var.f136b = lVar;
                boolean z10 = this.B;
                if (!z10 && (jVar = e0Var.f1945f.f15828a) != null && (u1Var = jVar.U) != null) {
                    u1Var.i((CancellationException) null);
                    jVar.U = null;
                }
                e0Var.f1950k = aVar;
                e0Var.f1948i = g1Var;
                e0Var.f1942c = cVar;
                e0Var.f1949j = z10;
                e0Var.f1944e = this.C;
                break;
            default:
                t9.a aVar2 = (t9.a) this.D;
                u00.a aVar3 = (u00.a) this.E;
                u00.a aVar4 = (u00.a) this.G;
                u00.a aVar5 = (u00.a) this.H;
                t9.d dVar = (t9.d) this.I;
                boolean z11 = aVar2.f13919f;
                boolean z12 = this.B;
                if (z11 != z12) {
                    aVar2.f13919f = z12;
                    s9.c cVar2 = aVar2.f13920g;
                    if (cVar2 != null && (iVar2 = cVar2.f13911b) != null) {
                        iVar2.b();
                    }
                }
                aVar2.f14416i = aVar3;
                aVar2.g(this.C);
                aVar2.f14417j = aVar4;
                aVar2.f14418k = aVar5;
                s9.g gVar = (s9.g) dVar.f14422c.getValue();
                List list = (List) dVar.f14421b.getValue();
                List list2 = (List) dVar.f14423d.getValue();
                kotlin.jvm.internal.m.e(gVar, "currentInfo");
                kotlin.jvm.internal.m.e(list, "backInfo");
                kotlin.jvm.internal.m.e(list2, "forwardInfo");
                aVar2.f13914a = gVar;
                aVar2.f13915b = list;
                aVar2.f13916c = list2;
                s9.c cVar3 = aVar2.f13920g;
                if (cVar3 != null && (iVar = cVar3.f13911b) != null) {
                    iVar.d(aVar2);
                }
                break;
        }
        return g00.b0.a;
    }
}
