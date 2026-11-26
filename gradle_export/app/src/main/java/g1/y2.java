package g1;

import java.time.LocalDate;
import java.util.Collection;

public final class y2 implements u00.n {
    public final h1.t A;
    public final long B;
    public final z00.e C;
    public final b2.r D;
    public final h1 E;
    public final u00.k F;
    public final d6 G;

    public y2(h1.t tVar, long j9, z00.e eVar, b2.r rVar, h1 h1Var, u00.k kVar, d6 d6Var) {
        this.A = tVar;
        this.B = j9;
        this.C = eVar;
        this.D = rVar;
        this.E = h1Var;
        this.F = kVar;
        this.G = d6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            h1.t tVar = this.A;
            h1.s sVarB = tVar.b();
            final int i10 = ((h1.v) tVar).e(LocalDate.of(sVarB.A, sVarB.B, 1)).f6534a;
            final int i11 = tVar.a(this.B).f6534a;
            z00.e eVar = this.C;
            k0.y yVarA = k0.a0.a(Math.max(0, (i11 - ((z00.c) eVar).A) - 3), jVar, 2);
            k0.b bVar = new k0.b(3);
            final h1 h1Var = this.E;
            b2.r rVarF = z.n.f(this.D, h1Var.f5814a, i2.b0.f7111b);
            b1.i iVar = h0.i.f6411f;
            h0.f fVarG = h0.i.g(a3.f5714f);
            boolean zI = g0Var.i(tVar) | g0Var.i(eVar) | g0Var.e(i11) | g0Var.e(i10) | g0Var.g(this.F) | g0Var.g(this.G) | g0Var.g(h1Var);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                final z00.e eVar2 = this.C;
                final h1.t tVar2 = this.A;
                final u00.k kVar = this.F;
                final d6 d6Var = this.G;
                u00.k kVar2 = new u00.k() {
                    public final Object invoke(Object obj3) {
                        int size;
                        k0.i iVar2 = (k0.i) obj3;
                        Collection collection = eVar2;
                        kotlin.jvm.internal.m.e(collection, "<this>");
                        if (!(collection instanceof Collection)) {
                            z00.d it = collection.iterator();
                            int i12 = 0;
                            do {
                                z00.d dVar = it;
                                if (dVar.C) {
                                    dVar.next();
                                    i12++;
                                } else {
                                    size = i12;
                                }
                            } while (i12 >= 0);
                            va.a.j0();
                            throw null;
                        }
                        size = collection.size();
                        iVar2.q(size, null, k0.s.A, new v1.c(new x2(collection, tVar2, i11, i10, kVar, d6Var, h1Var), 674613074, true));
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar2);
                objN = kVar2;
            }
            kh.n.i(bVar, rVarF, yVarA, null, fVarG, iVar, null, false, null, (u00.k) objN, jVar, 1769472, 0, 920);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
