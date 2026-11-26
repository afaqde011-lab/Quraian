package mb;

import d40.p1;
import kotlin.jvm.internal.d0;
import l1.g0;
import oo.k0;
import w.g1;
import w.h0;
import w.i1;
import w.k1;
import w.o1;
import w.r1;
import w.u1;
import x.j1;
import x.n1;

public final class y extends kotlin.jvm.internal.n implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(3);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        n1 n1VarT;
        Object g0Var;
        boolean z11;
        j1 j1Var;
        w.j1 j1Var2;
        switch (this.A) {
            case 0:
                h0.t tVar = (h0.t) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((g0) jVar).g(tVar) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    g0 g0Var2 = (g0) jVar;
                    if (g0Var2.C()) {
                        g0Var2.V();
                    } else {
                        q qVar = (q) ((xb.h) this.B);
                        long j9 = tVar.f6461b;
                        p1 p1Var = qVar.A;
                        y3.a aVar = new y3.a(j9);
                        p1Var.getClass();
                        p1Var.k((Object) null, aVar);
                        ((v1.c) this.C).invoke(new x(tVar, (j) this.D, (b2.d) this.E, (z2.p) this.F), jVar, 0);
                    }
                } else {
                    q qVar2 = (q) ((xb.h) this.B);
                    long j10 = tVar.f6461b;
                    p1 p1Var2 = qVar2.A;
                    y3.a aVar2 = new y3.a(j10);
                    p1Var2.getClass();
                    p1Var2.k((Object) null, aVar2);
                    ((v1.c) this.C).invoke(new x(tVar, (j) this.D, (b2.d) this.E, (z2.p) this.F), jVar, 0);
                }
                return g00.b0.a;
            default:
                k0 k0Var = (k0) this.F;
                b2.r rVar = (b2.r) obj;
                ((Number) obj3).intValue();
                w.f fVar = w.f.Q;
                n1 n1Var = (n1) this.C;
                g0 g0Var3 = (g0) ((l1.j) obj2);
                g0Var3.c0(-1539505585);
                r1 r1Var = (r1) this.B;
                String str = r1Var.f15803a;
                g0Var3.Z(-1996110647, str);
                u1 u1Var = (u1) this.D;
                Object objN = g0Var3.N();
                l1.c cVar = l1.i.f9868a;
                if (objN == cVar) {
                    z1.s sVar = u1Var.H;
                    w.j1 j1Var3 = (w.j1) sVar.get(str);
                    if (j1Var3 == null) {
                        j1Var3 = new w.j1(str, u1Var);
                        sVar.put(str, j1Var3);
                    }
                    objN = j1Var3;
                    g0Var3.n0(objN);
                }
                w.j1 j1Var4 = (w.j1) objN;
                g0Var3.Z(-1996106866, n1Var);
                if (n1Var != null) {
                    f5.c cVar2 = n1Var.f16323a;
                    g0Var3.c0(-1749734647);
                    String string = str.toString();
                    boolean zG = g0Var3.g(n1Var);
                    Object objN2 = g0Var3.N();
                    if (zG || objN2 == cVar) {
                        objN2 = cVar2.J0();
                        g0Var3.n0(objN2);
                    }
                    if (n1Var.g()) {
                        objN2 = cVar2.J0();
                    }
                    g0Var3.c0(1498260051);
                    Boolean bool = (Boolean) fVar.invoke(objN2);
                    g0Var3.r(false);
                    Object value = n1Var.f16326d.getValue();
                    g0Var3.c0(1498260051);
                    Boolean bool2 = (Boolean) fVar.invoke(value);
                    g0Var3.r(false);
                    z10 = false;
                    n1VarT = x.c.m(n1Var, bool, bool2, string, g0Var3, 0);
                    g0Var3.r(false);
                } else {
                    z10 = false;
                    g0Var3.c0(-1749482679);
                    boolean z12 = true;
                    d0.d(1, fVar);
                    Boolean bool3 = (Boolean) fVar.invoke(g00.b0.a);
                    boolean zBooleanValue = bool3.booleanValue();
                    Object objN3 = g0Var3.N();
                    if (objN3 == cVar) {
                        if (j1Var4.c().isEmpty()) {
                            z12 = zBooleanValue;
                        } else if (zBooleanValue) {
                            z12 = false;
                        }
                        objN3 = new x.k0(Boolean.valueOf(z12));
                        g0Var3.n0(objN3);
                    }
                    x.k0 k0Var2 = (x.k0) objN3;
                    k0Var2.W0(bool3);
                    n1VarT = x.c.t(k0Var2, null, g0Var3, 0, 2);
                    g0Var3.r(false);
                }
                n1 n1Var2 = n1VarT;
                g0Var3.Z(-1996043323, Boolean.valueOf(u1Var.b()));
                j1 j1VarN = x.c.n(n1Var2, x.c.f16264s, null, g0Var3, 0, 2);
                g0Var3.r(z10);
                boolean zG2 = g0Var3.g(n1Var2);
                u1 u1Var2 = (u1) this.D;
                Object objN4 = g0Var3.N();
                if (zG2 || objN4 == cVar) {
                    z11 = z10;
                    i1 i1Var = j1Var4.f15787h;
                    j1Var = j1VarN;
                    j1Var2 = j1Var4;
                    g0Var = new w.g0(u1Var2, n1Var2, j1Var, k0Var, i1Var);
                    g0Var3.n0(g0Var);
                } else {
                    z11 = z10;
                    g0Var = objN4;
                    j1Var2 = j1Var4;
                    j1Var = j1VarN;
                }
                w.g0 g0Var4 = (w.g0) g0Var;
                if (!kotlin.jvm.internal.m.a((j1) g0Var4.f15761d.getValue(), j1Var)) {
                    g0Var4.f15761d.setValue(j1Var);
                    g0Var4.f15764g.setValue(null);
                    g0Var4.f15763f = h0.f15771a;
                }
                g0Var4.f15762e.setValue(k0Var);
                g0Var3.r(z11);
                w.n1 n1Var3 = (w.n1) this.E;
                Object objN5 = g0Var3.N();
                if (objN5 == cVar) {
                    objN5 = new k1(j1Var2, g0Var4, n1Var3, r1Var);
                    g0Var3.n0(objN5);
                }
                k1 k1Var = (k1) objN5;
                r1Var.f15805c.setValue(k1Var);
                k1Var.D.setValue(j1Var2);
                l1.i1 i1Var2 = k1Var.G;
                Boolean bool4 = Boolean.TRUE;
                i1Var2.setValue(bool4);
                k1Var.E.setValue(g0Var4);
                k1Var.F.setValue(o1.f15799b);
                k1Var.H.setValue(n1Var3);
                k1Var.B.i(0.0f);
                k1Var.C.setValue(bool4);
                k1Var.I.setValue(r1Var);
                g0Var3.r(z11);
                b2.r rVarV = rVar.V(new g1(k1Var));
                g0Var3.r(z11);
                return rVarV;
        }
    }
}
