package iz;

import a30.x;
import b2.r;
import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import g1.c5;
import g1.n5;
import g1.s;
import g1.t6;
import h0.n1;
import h0.p1;
import h0.u;
import h0.v;
import h0.z1;
import i2.t;
import l1.g0;
import l1.m1;
import l1.z0;
import m3.r0;
import q0.h1;
import q0.i1;
import r3.e0;

public final class f implements u00.n {
    public final int A = 3;
    public final boolean B;
    public final Object C;
    public final boolean D;
    public final Object E;
    public final Object F;
    public final Object G;

    public f(bx.c cVar, boolean z, boolean z2, gm.a aVar, u00.a aVar2, u00.a aVar3, int i) {
        this.C = cVar;
        this.B = z;
        this.D = z2;
        this.G = aVar;
        this.E = aVar2;
        this.F = aVar3;
    }

    public f(boolean z, ry.f fVar, u00.k kVar, r rVar, boolean z2, xp.a aVar, int i) {
        this.B = z;
        this.E = fVar;
        this.C = kVar;
        this.F = rVar;
        this.D = z2;
        this.G = aVar;
    }

    public f(boolean z, u00.k kVar, u00.a aVar, u00.a aVar2, boolean z2, z0 z0Var) {
        this.B = z;
        this.C = kVar;
        this.E = aVar;
        this.F = aVar2;
        this.D = z2;
        this.G = z0Var;
    }

    public f(boolean z, boolean z2, String str, String str2, u00.a aVar, u00.a aVar2, int i) {
        this.B = z;
        this.D = z2;
        this.C = str;
        this.G = str2;
        this.E = aVar;
        this.F = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z0 z0Var;
        int i = this.A;
        b0 b0Var = b0.a;
        Object obj3 = this.F;
        Object obj4 = this.E;
        Object obj5 = this.G;
        Object obj6 = this.C;
        switch (i) {
            case 0:
                u00.k kVar = (u00.k) obj6;
                u00.a aVar = (u00.a) obj4;
                u00.a aVar2 = (u00.a) obj3;
                z0 z0Var2 = (z0) obj5;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = (iIntValue & 3) != 2;
                g0 g0Var2 = g0Var;
                x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue & 1, z)) {
                    g0Var2.V();
                } else {
                    b2.o oVar = b2.o.A;
                    r rVarD = z1.d(oVar, 1.0f);
                    h0.f fVarG = h0.i.g(12);
                    b2.g gVar = b2.b.M;
                    v vVarA = u.a(fVarG, gVar, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarD, g0Var);
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
                    r rVarD2 = z1.d(oVar, 1.0f);
                    float f = 4;
                    v vVarA2 = u.a(h0.i.g(f), gVar, g0Var, 6);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    r rVarC2 = b2.a.c(rVarD2, g0Var);
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
                    String str = (String) z0Var2.getValue();
                    r rVarD3 = z1.d(oVar, 1.0f);
                    boolean z2 = this.B;
                    boolean z3 = !z2;
                    p0.e eVarA = p0.f.a(16);
                    i1 i1Var = new i1(0, 0, 7, 119);
                    boolean zH = g0Var2.h(z2) | g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj7 = l1.i.a;
                    if (zH || objN == obj7) {
                        z0Var = z0Var2;
                        objN = new ev.n(z2, kVar, z0Var);
                        g0Var2.n0(objN);
                    } else {
                        z0Var = z0Var2;
                    }
                    h1 h1Var = new h1((u00.k) objN, (u00.k) null, 62);
                    c5 c5Var = c5.a;
                    long j = dl.a.i;
                    long jB = t.b(0.08f, j);
                    long jB2 = t.b(0.08f, j);
                    long jB3 = t.b(0.08f, j);
                    long jB4 = t.b(0.08f, j);
                    long jB5 = t.b(0.08f, j);
                    long jB6 = t.b(0.08f, j);
                    long j2 = dl.a.U;
                    long jB7 = t.b(0.08f, j);
                    z0 z0Var3 = z0Var;
                    long j3 = dl.a.k;
                    t6 t6VarC = c5.c(j3, j3, j3, j3, jB, jB2, jB3, jB7, j3, jB4, jB5, jB6, j2, 0L, 0L, 0L, g0Var, 2147452416);
                    boolean zG = g0Var2.g(aVar2);
                    Object objN2 = g0Var2.N();
                    if (zG || objN2 == obj7) {
                        objN2 = new h(aVar2, z0Var3, 0);
                        g0Var2.n0(objN2);
                    }
                    v1.c cVar = d.a;
                    boolean z4 = this.D;
                    n5.a(str, (u00.k) objN2, rVarD3, z3, (r0) null, cVar, z4, (e0) null, i1Var, h1Var, true, 0, 0, eVarA, t6VarC, g0Var, 12583296);
                    j.a(390, z1.e(z1.d(oVar, 1.0f), j.a), g0Var, z4);
                    g0Var2.r(true);
                    float f2 = 48;
                    r rVarD4 = z1.d(z1.e(oVar, f2), 1.0f);
                    float f3 = 32;
                    p0.e eVarA2 = p0.f.a(f3);
                    p1 p1Var = s.a;
                    long j4 = dl.a.N;
                    g1.r rVarA = s.a(j, j4, j, j4, g0Var, 0);
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN3 = g0Var2.N();
                    if (zG2 || objN3 == obj7) {
                        objN3 = new i(kVar, z0Var3, 0);
                        g0Var2.n0(objN3);
                    }
                    g1.x5.a((u00.a) objN3, rVarD4, z3, eVarA2, rVarA, (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-1959432745, new cz.o(2, z2), g0Var), g0Var, 805306416, 480);
                    g1.x5.a(aVar, z1.d(z1.e(oVar, f2), 1.0f), false, p0.f.a(f3), s.a(t.b(0.2f, dl.a.o), j3, 0L, 0L, g0Var, 12), (g1.u) null, (n1) null, (f0.i) null, d.b, g0Var, 805306416, 484);
                    h0.c.h(z1.e(oVar, f), g0Var);
                    g0Var2.r(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                d.m(this.B, (ry.f) obj4, (u00.k) obj6, (r) obj3, this.D, (xp.a) obj5, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                st.j.i(this.B, this.D, (String) obj6, (String) obj5, (u00.a) obj4, (u00.a) obj3, (l1.j) obj, l1.q.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yr.a.k((bx.c) obj6, this.B, this.D, (gm.a) obj5, (u00.a) obj4, (u00.a) obj3, (l1.j) obj, l1.q.K(9));
                break;
        }
        return b0Var;
    }
}
