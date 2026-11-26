package ct;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.a7;
import g1.b8;
import g1.c8;
import g1.d8;
import g1.h7;
import g1.j7;
import g1.l3;
import g1.x5;
import g1.z7;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t0;
import l0.s0;
import l1.m1;
import l1.z0;
import s10.w0;
import ur.h1;

public final class a implements u00.n {
    public final int A = 2;
    public final int B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;

    public a(int i, int i2, z0 z0Var, u00.a aVar, u00.n nVar) {
        this.B = i;
        this.C = i2;
        this.D = z0Var;
        this.F = aVar;
        this.E = nVar;
    }

    public a(int i, int i2, u00.k kVar, jk.a aVar, b2.r rVar, int i3) {
        this.B = i;
        this.C = i2;
        this.D = kVar;
        this.F = aVar;
        this.E = rVar;
    }

    public a(Object obj, int i, s0 s0Var, v1.c cVar, int i2) {
        this.D = obj;
        this.B = i;
        this.E = s0Var;
        this.F = cVar;
        this.C = i2;
    }

    public a(String str, int i, b2.r rVar, u00.a aVar, int i2, int i3) {
        this.D = str;
        this.B = i;
        this.E = rVar;
        this.F = aVar;
        this.C = i3;
    }

    public a(h1 h1Var, u00.k kVar, b2.r rVar, int i, int i2) {
        this.D = h1Var;
        this.F = kVar;
        this.E = rVar;
        this.B = i;
        this.C = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l1.g0 g0Var;
        Object obj3;
        u00.a aVar;
        b3.f fVar;
        b3.e eVar;
        b8 b8Var;
        l1.j jVar;
        int i;
        int i2 = this.A;
        int i3 = this.C;
        int i4 = this.B;
        Object obj4 = this.D;
        g00.b0 b0Var = g00.b0.a;
        Object obj5 = this.E;
        Object obj6 = this.F;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                a.a.b((String) obj4, this.B, (b2.r) obj5, (u00.a) obj6, (l1.j) obj, l1.q.K(1), this.C);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l0.q.b(this.D, this.B, (s0) obj5, (v1.c) obj6, (l1.j) obj, l1.q.K(i3 | 1));
                break;
            case 2:
                z0 z0Var = (z0) obj4;
                u00.a aVar2 = (u00.a) obj6;
                u00.n nVar = (u00.n) obj5;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = (iIntValue & 3) != 2;
                l1.g0 g0Var2 = (l1.g0) jVar2;
                a30.x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue & 1, z)) {
                    g0Var2.V();
                } else {
                    float f = z7.a;
                    Object[] objArr = new Object[0];
                    w0 w0Var = new w0(new c8(0), new j7(3), 15);
                    boolean zE = g0Var2.e(i4) | g0Var2.e(i3);
                    Object objN = g0Var2.N();
                    Object obj7 = l1.i.a;
                    if (zE || objN == obj7) {
                        objN = new h7(i4, i3);
                        g0Var2.n0(objN);
                    }
                    b8 b8Var2 = (d8) y1.k.f(objArr, w0Var, (u00.a) objN, jVar2, 0);
                    p0.e eVarA = p0.f.a(24);
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = h0.c.C(z.n.f(f2.h.c(oVar, eVarA), dl.a.N, i2.b0.b), 16);
                    h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, jVar2, 48);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarC, jVar2);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar2 = b3.h.f;
                    l1.q.I(vVarA, jVar2, fVar2);
                    b3.f fVar3 = b3.h.e;
                    l1.q.I(m1VarM, jVar2, fVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar4 = b3.h.g;
                    l1.q.I(numValueOf, jVar2, fVar4);
                    b3.e eVar2 = b3.h.h;
                    l1.q.E(jVar2, eVar2);
                    b3.f fVar5 = b3.h.d;
                    l1.q.I(rVarC2, jVar2, fVar5);
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        g0Var2.c0(-897373543);
                        long j = dl.a.i;
                        long jB = i2.t.b(0.1f, j);
                        long j2 = dl.a.d;
                        long jB2 = i2.t.b(0.1f, j);
                        long jB3 = i2.t.b(0.2f, j);
                        g0Var = g0Var2;
                        long j3 = dl.a.k;
                        obj3 = obj7;
                        a7 a7VarK = x5.k(jB, j2, j2, jB3, jB2, j3, j3, jVar2);
                        jVar = jVar2;
                        z7.l(b8Var2, (b2.r) null, a7VarK, 0, jVar, 0);
                        g0Var.r(false);
                        aVar = aVar2;
                        i = 0;
                        fVar = fVar4;
                        eVar = eVar2;
                        b8Var = b8Var2;
                    } else {
                        g0Var = g0Var2;
                        obj3 = obj7;
                        g0Var.c0(-896639494);
                        long j4 = dl.a.i;
                        long jB4 = i2.t.b(0.1f, j4);
                        long j5 = dl.a.d;
                        long jB5 = i2.t.b(0.1f, j4);
                        long jB6 = i2.t.b(0.2f, j4);
                        long j6 = dl.a.k;
                        aVar = aVar2;
                        fVar = fVar4;
                        eVar = eVar2;
                        b8Var = b8Var2;
                        a7 a7VarK2 = x5.k(jB4, j5, j5, jB6, jB5, j6, j6, jVar2);
                        jVar = jVar2;
                        i = 0;
                        z7.j(0, (b2.r) null, a7VarK2, b8Var, jVar);
                        g0Var.r(false);
                    }
                    b2.r rVarQ = z1.q(oVar, RCHTTPStatusCodes.BAD_REQUEST);
                    v1 v1VarA = t1.a(h0.i.a, b2.b.J, jVar, i);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarQ, jVar);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA, jVar, fVar2);
                    l1.q.I(m1VarM2, jVar, fVar3);
                    com.google.android.gms.internal.measurement.x5.u(iHashCode2, jVar, fVar, jVar, eVar);
                    l1.q.I(rVarC3, jVar, fVar5);
                    Object objN2 = g0Var.N();
                    Object obj8 = obj3;
                    if (objN2 == obj8) {
                        objN2 = new k(z0Var, 13);
                        g0Var.n0(objN2);
                    }
                    l1.j jVar3 = jVar;
                    x5.d((u00.a) objN2, (b2.r) null, false, (l3) null, (t0) null, v1.d.d(-1166077427, new g1.i(z0Var, 2), jVar), jVar3, 1572870, 62);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c.h(new c1(1.0f, true), jVar3);
                    l1.g0 g0Var3 = g0Var;
                    b5.i(z3.U(jVar3, 2131887344), aVar, (b2.r) null, false, 0L, jVar3, 0);
                    String strU = z3.U(jVar3, 2131887345);
                    boolean zG = g0Var3.g(nVar) | g0Var3.i(b8Var);
                    Object objN3 = g0Var3.N();
                    if (zG || objN3 == obj8) {
                        objN3 = new l6.c(nVar, b8Var, 7);
                        g0Var3.n0(objN3);
                    }
                    b5.i(strU, (u00.a) objN3, (b2.r) null, false, 0L, jVar3, 0);
                    g0Var3.r(true);
                    g0Var3.r(true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                sm.d0.a(this.B, this.C, (u00.k) obj4, (jk.a) obj6, (b2.r) obj5, (l1.j) obj, l1.q.K(24577));
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.q((h1) obj4, (u00.k) obj6, (b2.r) obj5, (l1.j) obj, l1.q.K(i4 | 1), this.C);
                break;
        }
        return b0Var;
    }
}
