package d10;

import com.google.android.gms.internal.measurement.x5;
import g1.n5;
import g1.w6;
import g1.z6;
import kotlin.NoWhenBranchMatchedException;

public final class e implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public e(u00.n nVar, u00.n nVar2, v1.c cVar, g1.h1 h1Var, m3.r0 r0Var) {
        this.A = 1;
        this.B = nVar;
        this.C = nVar2;
        this.D = h1Var;
        this.E = r0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a10.a0 a0Var;
        b1.i iVar;
        ?? r3;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        b2.o oVar = b2.o.A;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        switch (i) {
            case 0:
                ClassLoader classLoader = (ClassLoader) obj6;
                g2 g2Var = (g2) obj5;
                u00.a aVar = (u00.a) obj4;
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj3;
                int iIntValue = ((Number) obj).intValue();
                s10.e1 typeArgument = (s10.e1) obj2;
                kotlin.jvm.internal.m.e(typeArgument, "typeArgument");
                f fVar = aVar == null ? null : new f(new a30.l(zVar, 15), iIntValue, 0);
                if (typeArgument.equals(s10.e1.c)) {
                    return a10.z.c;
                }
                s10.g1 g1Var = typeArgument.a;
                if (g1Var != null) {
                    int iOrdinal = g1Var.ordinal();
                    if (iOrdinal == 0) {
                        a0Var = a10.a0.A;
                    } else if (iOrdinal == 1) {
                        a0Var = a10.a0.B;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a0Var = a10.a0.C;
                    }
                } else {
                    a0Var = null;
                }
                s10.b1 b1Var = typeArgument.b;
                return new a10.z(a0Var, b1Var != null ? kh.n.l0(b1Var, classLoader, g2Var, fVar) : null);
            case 1:
                l1.g0 g0Var = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                boolean z = (iIntValue2 & 3) != 2;
                l1.g0 g0Var2 = g0Var;
                a30.x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue2 & 1, z)) {
                    g0Var2.V();
                    return b0Var;
                }
                b2.r rVarD = h0.z1.d(oVar, 1.0f);
                u00.n nVar = (u00.n) obj6;
                u00.n nVar2 = (u00.n) obj5;
                g1.h1 h1Var = (g1.h1) obj4;
                m3.r0 r0Var = (m3.r0) obj3;
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
                int iT = l1.q.t(g0Var);
                l1.m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarD, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                b3.f fVar2 = b3.h.f;
                l1.q.I(vVarA, g0Var, fVar2);
                b3.f fVar3 = b3.h.e;
                l1.q.I(m1VarM, g0Var, fVar3);
                b3.f fVar4 = b3.h.g;
                if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iT))) {
                    x5.v(iT, g0Var2, iT, fVar4);
                }
                b3.f fVar5 = b3.h.d;
                l1.q.I(rVarC, g0Var, fVar5);
                if (nVar == null || nVar2 == null) {
                    iVar = nVar != null ? h0.i.a : h0.i.b;
                } else {
                    iVar = h0.i.g;
                }
                b2.r rVarD2 = h0.z1.d(oVar, 1.0f);
                h0.v1 v1VarA = h0.t1.a(iVar, b2.b.K, g0Var, 48);
                int iT2 = l1.q.t(g0Var);
                l1.m1 m1VarM2 = g0Var2.m();
                b2.r rVarC2 = b2.a.c(rVarD2, g0Var);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(v1VarA, g0Var, fVar2);
                l1.q.I(m1VarM2, g0Var, fVar3);
                if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iT2))) {
                    x5.v(iT2, g0Var2, iT2, fVar4);
                }
                l1.q.I(rVarC2, g0Var, fVar5);
                if (nVar != null) {
                    g0Var2.c0(-516028300);
                    r3 = 0;
                    z6.a(r0Var, v1.d.d(-738208900, new g1.i2(0, nVar), g0Var), g0Var, 48);
                    g0Var2.r(false);
                } else {
                    r3 = 0;
                    g0Var2.c0(-515838022);
                    g0Var2.r(false);
                }
                if (nVar2 == null) {
                    g0Var2.c0(-515799087);
                } else {
                    g0Var2.c0(260455984);
                    nVar2.invoke(g0Var, Integer.valueOf((int) r3));
                }
                g0Var2.r((boolean) r3);
                g0Var2.r(true);
                g0Var2.c0(-250360576);
                g1.x5.c((b2.r) null, 0.0f, h1Var.x, g0Var, 0, 3);
                g0Var2.r((boolean) r3);
                g0Var2.r(true);
                return b0Var;
            default:
                l1.g0 g0Var3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b2.r rVarM = z2.d0.m(oVar, "Container");
                    h1.y0 y0Var = new h1.y0((l1.z0) obj6, l1.z0.class, "value", "getValue()Ljava/lang/Object;", 0);
                    b2.c cVarE = h1.e1.e((w6) obj5);
                    float f = n5.a;
                    b2.r rVarG = f2.h.g(rVarM, new b1.l(y0Var, (h0.n1) obj4, cVarE, 11));
                    v1.c cVar = (v1.c) obj3;
                    z2.w0 w0VarD = h0.o.d(b2.b.A, true);
                    int iT3 = l1.q.t(g0Var3);
                    l1.m1 m1VarM3 = g0Var4.m();
                    b2.r rVarC3 = b2.a.c(rVarG, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD, g0Var3, b3.h.f);
                    l1.q.I(m1VarM3, g0Var3, b3.h.e);
                    b3.f fVar6 = b3.h.g;
                    if (g0Var4.S || !kotlin.jvm.internal.m.a(g0Var4.N(), Integer.valueOf(iT3))) {
                        x5.v(iT3, g0Var4, iT3, fVar6);
                    }
                    l1.q.I(rVarC3, g0Var3, b3.h.d);
                    cVar.invoke(g0Var3, 0);
                    g0Var4.r(true);
                } else {
                    g0Var4.V();
                }
                return b0Var;
        }
    }
}
