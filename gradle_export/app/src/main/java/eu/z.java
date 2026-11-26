package eu;

import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import l1.g0;
import l1.m1;

public final class z implements u00.n {
    public final int A;
    public final boolean B;
    public final u00.a C;
    public final u00.a D;

    public z(boolean z, u00.a aVar, u00.a aVar2) {
        this.A = 5;
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
    }

    public z(boolean z, u00.a aVar, u00.a aVar2, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        u00.a aVar = this.D;
        u00.a aVar2 = this.C;
        g00.b0 b0Var = g00.b0.a;
        boolean z = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b0.a(z, aVar2, aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                b0.a(z, aVar2, aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p30.f.H(z, aVar2, aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p30.f.H(z, aVar2, aVar, (l1.j) obj, l1.q.K(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                p30.f.H(z, aVar2, aVar, (l1.j) obj, l1.q.K(1));
                break;
            default:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z2 = (iIntValue & 3) != 2;
                g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue & 1, z2)) {
                    g0Var2.V();
                } else {
                    h0.d dVar = h0.i.c;
                    b2.g gVar = b2.b.M;
                    h0.v vVarA = h0.u.a(dVar, gVar, g0Var, 0);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = b2.a.c(oVar, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(vVarA, g0Var, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var, fVar4);
                    h0.v vVarA2 = h0.u.a(h0.i.g(20), gVar, g0Var, 6);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(oVar, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA2, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC2, g0Var, fVar4);
                    b2.r rVarD = z1.d(oVar, 1.0f);
                    String strU = z3.U(g0Var, 2131887257);
                    long jZ = kh.o.z(20);
                    long jZ2 = kh.o.z(24);
                    long j = dl.a.i;
                    k00.f.a(strU, rVarD, j, jZ, new y3.o(jZ2), q3.u.D, new x3.k(3), 2, 0.8f, null, g0Var, 113470512, 512);
                    b2.r rVarE = z1.e(z1.d(oVar, 1.0f), 48);
                    v1 v1VarA = t1.a(h0.i.g(12), b2.b.J, g0Var, 6);
                    int iHashCode3 = Long.hashCode(g0Var2.T);
                    m1 m1VarM3 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarE, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, g0Var, fVar);
                    l1.q.I(m1VarM3, g0Var, fVar2);
                    x5.u(iHashCode3, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC3, g0Var, fVar4);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    c1 c1Var = new c1(1.0f, true);
                    float f = 32;
                    p0.e eVarA = p0.f.a(f);
                    boolean z3 = !z;
                    p1 p1Var = g1.s.a;
                    long jB = i2.t.b(0.12f, j);
                    long j2 = dl.a.k;
                    g1.x5.a(this.C, c1Var, z3, eVarA, g1.s.a(jB, j2, i2.t.b(0.12f, j), j2, g0Var, 0), (g1.u) null, (n1) null, (f0.i) null, iz.d.f, g0Var, 805306368, 480);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    c1 c1Var2 = new c1(1.0f, true);
                    p0.e eVarA2 = p0.f.a(f);
                    long j3 = dl.a.l;
                    g1.x5.a(this.D, c1Var2, z3, eVarA2, g1.s.a(j, j3, j, j3, g0Var, 0), (g1.u) null, (n1) null, (f0.i) null, iz.d.g, g0Var, 805306368, 480);
                    x5.z(g0Var2, true, true, true);
                }
                break;
        }
        return b0Var;
    }
}
