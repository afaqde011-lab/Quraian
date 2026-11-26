package g1;

import com.google.android.gms.cast.MediaError;

public final class w implements u00.n {
    public final int A;
    public final Object B;
    public final Object C;

    public w(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public w(u00.o oVar, h1.b1 b1Var) {
        this.A = 10;
        this.C = oVar;
        this.B = b1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b2.r rVarB = h0.c.B(h0.z1.a(b2.o.A, s.f5956c, s.f5957d), (h0.n1) this.B);
                    b1.i iVar = h0.i.f6410e;
                    b2.h hVar = b2.b.K;
                    u00.o oVar = (u00.o) this.C;
                    h0.v1 v1VarA = h0.t1.a(iVar, hVar, jVar, 54);
                    int iT = l1.q.t(jVar);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(rVarB, jVar);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA, jVar, b3.h.f2039f);
                    l1.q.I(m1VarM, jVar, b3.h.f2038e);
                    b3.f fVar = b3.h.f2040g;
                    if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
                        com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar);
                    }
                    l1.q.I(rVarC, jVar, b3.h.f2037d);
                    oVar.invoke(h0.x1.f6475a, jVar, 6);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                return g00.b0.a;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                String str = (String) this.C;
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = (String) this.B;
                    boolean zG = g0Var2.g(str2) | g0Var2.g(str);
                    String str3 = (String) this.B;
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new al.l(str3, str, 13);
                        g0Var2.n0(objN);
                    }
                    z6.b(str2, j3.q.c(b2.o.A, false, (u00.k) objN), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar2, 0, 0, 262140);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 2:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b3 b3Var = (b3) this.B;
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b2.r rVarB2 = h0.c.B(b2.o.A, a3.f5712d);
                    int iA = b3Var.a();
                    boolean zG2 = g0Var3.g(b3Var);
                    Object objN2 = g0Var3.N();
                    if (zG2 || objN2 == l1.i.f9868a) {
                        objN2 = new j2(b3Var, 0);
                        g0Var3.n0(objN2);
                    }
                    a3.f(rVarB2, iA, (u00.k) objN2, (h1) this.C, jVar3, 6);
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            case 3:
                l1.j jVar4 = (l1.j) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar4;
                if (g0Var4.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o3.b((o2.f) this.B, (String) this.C, null, 0L, jVar4, 0, 12);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 4:
                String str4 = (String) this.B;
                l1.j jVar5 = (l1.j) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l1.g0 g0Var5 = (l1.g0) jVar5;
                if (g0Var5.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG3 = g0Var5.g(str4);
                    Object objN3 = g0Var5.N();
                    if (zG3 || objN3 == l1.i.f9868a) {
                        objN3 = new b6.o(str4, 7);
                        g0Var5.n0(objN3);
                    }
                    z6.b(str4, j3.q.c(b2.o.A, false, (u00.k) objN3), ((h1) this.C).f5819f, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar5, 0, 0, 262136);
                } else {
                    g0Var5.V();
                }
                return g00.b0.a;
            case 5:
                l1.j jVar6 = (l1.j) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                l1.g0 g0Var6 = (l1.g0) jVar6;
                if (g0Var6.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    z6.a(((l8) this.B).f5868j, (v1.c) this.C, jVar6, 0);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 6:
                l1.j jVar7 = (l1.j) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l1.g0 g0Var7 = (l1.g0) jVar7;
                if (g0Var7.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    b8 b8Var = (b8) this.B;
                    a7 a7Var = (a7) this.C;
                    h0.v1 v1VarA2 = h0.t1.a(h0.i.f6406a, b2.b.J, jVar7, 0);
                    int iT2 = l1.q.t(jVar7);
                    l1.m1 m1VarM2 = g0Var7.m();
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarC2 = b2.a.c(oVar2, jVar7);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var7.g0();
                    if (g0Var7.S) {
                        g0Var7.l(gVar2);
                    } else {
                        g0Var7.q0();
                    }
                    l1.q.I(v1VarA2, jVar7, b3.h.f2039f);
                    l1.q.I(m1VarM2, jVar7, b3.h.f2038e);
                    b3.f fVar2 = b3.h.f2040g;
                    if (g0Var7.S || !kotlin.jvm.internal.m.a(g0Var7.N(), Integer.valueOf(iT2))) {
                        com.google.android.gms.internal.measurement.x5.v(iT2, g0Var7, iT2, fVar2);
                    }
                    l1.q.I(rVarC2, jVar7, b3.h.f2037d);
                    float f3 = k1.d0.f8609w;
                    float f10 = k1.d0.f8607u;
                    z7.n(h0.z1.n(oVar2, f3, f10), z7.u(b8Var), b8Var, 0, a7Var, jVar7, 3078);
                    z7.e(h0.z1.n(oVar2, z7.f6050e, k1.d0.f8605s), jVar7, 6);
                    z7.n(h0.z1.n(oVar2, f3, f10), b8Var.c(), b8Var, 1, a7Var, jVar7, 3078);
                    g0Var7.r(true);
                } else {
                    g0Var7.V();
                }
                return g00.b0.a;
            case 7:
                l1.j jVar8 = (l1.j) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                l1.g0 g0Var8 = (l1.g0) jVar8;
                if (g0Var8.S(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    c5.f5746a.a(true, false, (f0.i) this.B, null, (t6) this.C, g6.a(k1.c0.f8580d, jVar8), 0.0f, 0.0f, jVar8, 100663734, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 8:
                l1.j jVar9 = (l1.j) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l1.g0 g0Var9 = (l1.g0) jVar9;
                if (g0Var9.S(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l1.z0 z0Var = (l1.z0) this.B;
                    Object objN4 = g0Var9.N();
                    if (objN4 == l1.i.f9868a) {
                        objN4 = new d0.o2(z0Var, 6);
                        g0Var9.n0(objN4);
                    }
                    b2.r rVarN = z2.d0.n(b2.o.A, (u00.k) objN4);
                    v1.c cVar = (v1.c) this.C;
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iT3 = l1.q.t(jVar9);
                    l1.m1 m1VarM3 = g0Var9.m();
                    b2.r rVarC3 = b2.a.c(rVarN, jVar9);
                    b3.i.f2042c.getClass();
                    b3.g gVar3 = b3.h.f2035b;
                    g0Var9.g0();
                    if (g0Var9.S) {
                        g0Var9.l(gVar3);
                    } else {
                        g0Var9.q0();
                    }
                    l1.q.I(w0VarD, jVar9, b3.h.f2039f);
                    l1.q.I(m1VarM3, jVar9, b3.h.f2038e);
                    b3.f fVar3 = b3.h.f2040g;
                    if (g0Var9.S || !kotlin.jvm.internal.m.a(g0Var9.N(), Integer.valueOf(iT3))) {
                        com.google.android.gms.internal.measurement.x5.v(iT3, g0Var9, iT3, fVar3);
                    }
                    l1.q.I(rVarC3, jVar9, b3.h.f2037d);
                    cVar.invoke(jVar9, 0);
                    g0Var9.r(true);
                } else {
                    g0Var9.V();
                }
                return g00.b0.a;
            case 9:
                l1.j jVar10 = (l1.j) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                String str5 = (String) this.B;
                l1.g0 g0Var10 = (l1.g0) jVar10;
                if (g0Var10.S(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zG4 = g0Var10.g(str5);
                    Object objN5 = g0Var10.N();
                    if (zG4 || objN5 == l1.i.f9868a) {
                        objN5 = new b6.o(str5, 16);
                        g0Var10.n0(objN5);
                    }
                    b2.r rVarC4 = j3.q.c(b2.o.A, false, (u00.k) objN5);
                    v1.c cVar2 = (v1.c) this.C;
                    z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
                    int iT4 = l1.q.t(jVar10);
                    l1.m1 m1VarM4 = g0Var10.m();
                    b2.r rVarC5 = b2.a.c(rVarC4, jVar10);
                    b3.i.f2042c.getClass();
                    b3.g gVar4 = b3.h.f2035b;
                    g0Var10.g0();
                    if (g0Var10.S) {
                        g0Var10.l(gVar4);
                    } else {
                        g0Var10.q0();
                    }
                    l1.q.I(w0VarD2, jVar10, b3.h.f2039f);
                    l1.q.I(m1VarM4, jVar10, b3.h.f2038e);
                    b3.f fVar4 = b3.h.f2040g;
                    if (g0Var10.S || !kotlin.jvm.internal.m.a(g0Var10.N(), Integer.valueOf(iT4))) {
                        com.google.android.gms.internal.measurement.x5.v(iT4, g0Var10, iT4, fVar4);
                    }
                    l1.q.I(rVarC5, jVar10, b3.h.f2037d);
                    cVar2.invoke(jVar10, 0);
                    g0Var10.r(true);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 10:
                l1.j jVar11 = (l1.j) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                l1.g0 g0Var11 = (l1.g0) jVar11;
                if (g0Var11.S(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ((u00.o) this.C).invoke((h1.b1) this.B, jVar11, 6);
                } else {
                    g0Var11.V();
                }
                return g00.b0.a;
            case 11:
                return Boolean.valueOf(kotlin.jvm.internal.m.a((j10.k) obj, (j10.b) this.B) && kotlin.jvm.internal.m.a((j10.k) obj2, (j10.b) this.C));
            default:
                l1.j jVar12 = (l1.j) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                gm.a aVar = (gm.a) this.C;
                l1.g0 g0Var12 = (l1.g0) jVar12;
                if (g0Var12.S(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    String str6 = ((bx.c) this.B).b;
                    gm.a aVar2 = gm.a.B;
                    z6.b(str6, null, dl.a.i, aVar == aVar2 ? kh.o.z(16) : kh.o.z(15), aVar == aVar2 ? q3.u.D : q3.u.B, null, 0L, null, new x3.k(3), kh.o.z(20), 2, false, 2, 0, null, null, jVar12, 0, 25008, 238506);
                } else {
                    g0Var12.V();
                }
                return g00.b0.a;
        }
    }
}
