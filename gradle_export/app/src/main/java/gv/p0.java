package gv;

import android.graphics.DashPathEffect;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.o3;
import g1.x5;
import g1.z6;
import k2.h;
import kotlin.jvm.internal.m;
import l1.p2;

public final class p0 implements u00.o {
    public final int A = 1;
    public final int B;
    public final u00.k C;
    public final Object D;
    public final Object E;

    public p0(int i, u00.k kVar, p2 p2Var, p2 p2Var2) {
        this.B = i;
        this.C = kVar;
        this.D = p2Var;
        this.E = p2Var2;
    }

    public p0(u30.b bVar, int i, ru.d dVar, u00.k kVar) {
        this.D = bVar;
        this.B = i;
        this.E = dVar;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                u30.b<ru.d> bVar = (u30.b) this.D;
                ru.d dVar = (ru.d) this.E;
                h0.w DropdownMenuNoPaddingVertical = (h0.w) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(DropdownMenuNoPaddingVertical, "$this$DropdownMenuNoPaddingVertical");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.o oVar = b2.o.A;
                    b2.r rVarD = h0.c.D(h0.z1.d(oVar, 1.0f), 12, 10);
                    h0.v vVarA = h0.u.a(h0.i.g(0), b2.b.M, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
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
                    l1.q.I(vVarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    String strU = z3.U(g0Var, 2131887279);
                    b2.r rVarD2 = h0.z1.d(oVar, 1.0f);
                    long j = dl.a.k;
                    z6.b(strU, rVarD2, j, kh.o.z(14), q3.u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597488, 0, 261032);
                    x5.c(h0.c.E(oVar, 0.0f, 8, 1), 0.0f, i2.t.b(0.12f, j), g0Var, 6, 2);
                    g0Var2.c0(-550120891);
                    for (ru.d dVar2 : bVar) {
                        boolean z = dVar2 == dVar;
                        u00.k kVar = this.C;
                        boolean zG = g0Var2.g(kVar) | g0Var2.e(dVar2.ordinal());
                        Object objN = g0Var2.N();
                        if (zG || objN == l1.i.a) {
                            objN = new a1.o1(kVar, dVar2, 13);
                            g0Var2.n0(objN);
                        }
                        p.y(dVar2, this.B, z, (u00.a) objN, g0Var, 0);
                    }
                    g0Var2.r(false);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                p2 p2Var = (p2) this.D;
                p2 p2Var2 = (p2) this.E;
                h0.w SettingsCardWidget = (h0.w) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(SettingsCardWidget, "$this$SettingsCardWidget");
                boolean z2 = (iIntValue2 & 17) != 16;
                l1.g0 g0Var4 = g0Var3;
                a30.x xVar = g0Var4.a;
                if (g0Var4.S(iIntValue2 & 1, z2)) {
                    final float f = 12;
                    h0.v1 v1VarA = h0.t1.a(h0.i.g(f), b2.b.K, g0Var3, 54);
                    int iHashCode2 = Long.hashCode(g0Var4.T);
                    l1.m1 m1VarM2 = g0Var4.m();
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarC2 = b2.a.c(oVar2, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(v1VarA, g0Var3, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM2, g0Var3, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var3, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var3, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC2, g0Var3, fVar4);
                    b2.r rVarM = h0.z1.m(oVar2, 24);
                    m2.b bVarR = y3.R(2131231393, g0Var3, 0);
                    long j2 = dl.a.k;
                    o3.a(bVarR, (String) null, rVarM, j2, g0Var3, 440, 0);
                    z6.b(z3.U(g0Var3, 2131887104), (b2.r) null, j2, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(21), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var3, 1597440, 48, 260010);
                    g0Var4.r(true);
                    b2.r dashedBorder = h0.z1.g(h0.z1.d(h0.c.G(oVar2, 0.0f, 16, 0.0f, 0.0f, 13), 1.0f), st.g.a, 0.0f, 2);
                    final long jB = i2.t.b(0.2f, dl.a.i);
                    final float f2 = 1;
                    final float f3 = 8;
                    kotlin.jvm.internal.m.e(dashedBorder, "$this$dashedBorder");
                    b2.r rVarE = h0.c.E(f2.h.e(dashedBorder, new u00.k() {
                        @Override
                        public final Object invoke(Object obj4) {
                            k2.d drawBehind = (k2.d) obj4;
                            m.e(drawBehind, "$this$drawBehind");
                            float fA0 = drawBehind.A0(f2);
                            float fA1 = drawBehind.A0(f);
                            float f4 = fA0 / 2;
                            k2.d.a1(drawBehind, jB, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.b() >> 32)) - fA0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.b() & 4294967295L)) - fA0)) & 4294967295L), (((long) Float.floatToRawIntBits(fA1)) << 32) | (((long) Float.floatToRawIntBits(fA1)) & 4294967295L), new h(fA0, 0.0f, 0, 0, new i2.h(new DashPathEffect(new float[]{drawBehind.A0(f3), drawBehind.A0(f3)}, 0.0f)), 14), 224);
                            return b0.a;
                        }
                    }), f, 0.0f, 2);
                    z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode3 = Long.hashCode(g0Var4.T);
                    l1.m1 m1VarM3 = g0Var4.m();
                    b2.r rVarC3 = b2.a.c(rVarE, g0Var3);
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD, g0Var3, fVar);
                    l1.q.I(m1VarM3, g0Var3, fVar2);
                    com.google.android.gms.internal.measurement.x5.u(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
                    l1.q.I(rVarC3, g0Var3, fVar4);
                    z6.b("بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيمِ", (b2.r) null, j2, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, new m3.r0(0L, kh.o.F(((Number) p2Var.getValue()).floatValue(), 4294967296L), (q3.u) null, dl.f.b, 0L, 0L, 0, 2, kh.o.F(((Number) p2Var2.getValue()).floatValue(), 4294967296L), (m3.z) null, 16580573), g0Var3, 6, 0, 130042);
                    g0Var4.r(true);
                    sm.d0.a(this.B, ot.c.d, this.C, kk.e.d(g0Var3), h0.c.G(oVar2, 0.0f, 28, 0.0f, 0.0f, 13), g0Var3, 24576);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
