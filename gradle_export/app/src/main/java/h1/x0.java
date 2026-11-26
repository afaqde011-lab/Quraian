package h1;

import a1.q2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import bv.y2;
import c3.o1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.o3;
import g1.s4;
import g1.z6;
import h0.m2;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.Map;
import java.util.WeakHashMap;
import l1.m1;
import z2.l1;

public final class x0 implements u00.o {
    public final int A;
    public final u00.a B;

    public x0(int i10, u00.a aVar) {
        this.A = i10;
        this.B = aVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.A;
        Map map = h00.y.A;
        i2.o0 o0Var = i2.b0.f7111b;
        l1.c cVar = l1.i.f9868a;
        b2.o oVar = b2.o.A;
        g00.b0 b0Var = g00.b0.a;
        f0.i iVar = null;
        u00.a aVar = this.B;
        switch (i10) {
            case 0:
                z2.y0 y0Var = (z2.y0) obj;
                z2.v0 v0Var = (z2.v0) obj2;
                y3.a aVar2 = (y3.a) obj3;
                float f3 = ((y3.f) aVar.invoke()).A;
                l1 l1VarO = v0Var.O(y3.a.a(aVar2.f16587a, 0, 0, y3.b.f(y3.f.b(f3, Float.NaN) ? 0 : y0Var.R0(f3), aVar2.f16587a), 0, 11));
                return y0Var.o0(l1VarO.A, l1VarO.B, map, new q2(l1VarO, 10));
            case 1:
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w) obj, "$this$MembershipSectionWidget");
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarC = h0.c.C(w50.c.n(z1.d(oVar, 1.0f), true, aVar), 16);
                    v1 v1VarA = t1.a(h0.i.g(4), b2.b.K, jVar, 54);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarC, jVar);
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
                    l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                    l1.q.E(jVar, b3.h.f2041h);
                    l1.q.I(rVarC2, jVar, b3.h.f2037d);
                    float f10 = 20;
                    o3.a(y3.R(2131231125, jVar, 0), null, z1.m(oVar, f10), dl.a.n, jVar, 440, 0);
                    z6.b(z3.U(jVar, 2131887318), null, dl.a.k, kh.o.z(14), q3.u.C, null, 0L, null, null, kh.o.z(14), 0, false, 0, 0, null, null, jVar, 1597440, 48, 260010);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    h0.c.h(new h0.c1(1.0f, true), jVar);
                    o3.a(y3.R(2131231131, jVar, 0), null, z1.m(oVar, f10), dl.a.m, jVar, 440, 0);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 2:
                z2.y0 y0Var2 = (z2.y0) obj;
                z2.v0 v0Var2 = (z2.v0) obj2;
                kotlin.jvm.internal.m.e(y0Var2, "$this$layout");
                kotlin.jvm.internal.m.e(v0Var2, "measurable");
                l1 l1VarO2 = v0Var2.O(((y3.a) obj3).f16587a);
                int iF = w00.a.F(((Number) aVar.invoke()).floatValue() * l1VarO2.B);
                int i11 = l1VarO2.A;
                int i12 = l1VarO2.B;
                return y0Var2.o0(i11, ab.a0.y(i12 - iF, 0, i12), map, new oo.q0(iF, 0, l1VarO2));
            case 3:
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w) obj, "$this$ModalBottomSheet");
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    long j9 = dl.a.q;
                    g4.d(6, j9, jVar2, true);
                    b2.r rVarM = h0.c.M(z.n.f(z1.d(oVar, 1.0f), j9, o0Var), h0.c.f6388g);
                    float f11 = 16;
                    b2.r rVarG = h0.c.G(h0.c.E(rVarM, f11, 0.0f, 2), 0.0f, 0.0f, 0.0f, f11, 7);
                    h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.N, jVar2, 48);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarG, jVar2);
                    b3.i.f2042c.getClass();
                    b3.g gVar2 = b3.h.f2035b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, jVar2, b3.h.f2039f);
                    l1.q.I(m1VarM2, jVar2, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode2), jVar2, b3.h.f2040g);
                    l1.q.E(jVar2, b3.h.f2041h);
                    l1.q.I(rVarC3, jVar2, b3.h.f2037d);
                    kl.a.a((b2.r) null, false, jVar2, 48, 1);
                    rd.a.a(aVar, jVar2, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 4:
                h0.t tVar = (h0.t) obj;
                l1.j jVar3 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(tVar, "$this$BoxWithConstraints");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((l1.g0) jVar3).g(tVar) ? 4 : 2;
                }
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    y3.c cVar2 = (y3.c) g0Var3.k(o1.f2734h);
                    g0Var3.c0(-477462184);
                    WeakHashMap weakHashMap = m2.f6423w;
                    int i13 = h0.b.e(jVar3).f6439r.e().f6469d - h0.b.e(jVar3).f6428e.e().f12758d;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    float fH0 = cVar2.h0(i13);
                    g0Var3.r(false);
                    Object objN = g0Var3.N();
                    if (objN == cVar) {
                        objN = x5.s(fH0, g0Var3);
                    }
                    l1.z0 z0Var = (l1.z0) objN;
                    y3.f fVar = new y3.f(fH0);
                    boolean zD = g0Var3.d(fH0);
                    Object objN2 = g0Var3.N();
                    if (zD || objN2 == cVar) {
                        objN2 = new y2(fH0, z0Var, (k00.c) null);
                        g0Var3.n0(objN2);
                    }
                    l1.q.i(fVar, jVar3, (u00.n) objN2);
                    float f12 = ((y3.f) x.d.a(((y3.f) z0Var.getValue()).A, x.c.v(1.0f, 400.0f, null, 4), "authDialogKeyboardHeight", jVar3, 432, 8).getValue()).A;
                    float fB = tVar.b() - f12;
                    y3.f fVar2 = new y3.f(fB);
                    y3.f fVar3 = new y3.f(tp.h.e);
                    y3.f fVar4 = new y3.f(tVar.b());
                    if (fVar3.compareTo(fVar4) > 0) {
                        fVar3 = fVar4;
                    }
                    y3.f fVar5 = new y3.f(tp.h.d);
                    y3.f fVar6 = new y3.f(tVar.b());
                    if (fVar5.compareTo(fVar6) > 0) {
                        fVar5 = fVar6;
                    }
                    float f13 = ((y3.f) ab.a0.C(fVar2, fVar3, fVar5)).A;
                    float f14 = ((y3.f) ab.a0.v(new y3.f(f13 - fB), new y3.f(0))).A;
                    h0.s sVar = h0.s.f6456a;
                    b2.r rVarB = sVar.b();
                    boolean zG = g0Var3.g(aVar);
                    Object objN3 = g0Var3.N();
                    if (zG || objN3 == cVar) {
                        objN3 = new s4(1, aVar);
                        g0Var3.n0(objN3);
                    }
                    h0.o.a(v2.f0.b(rVarB, aVar, (PointerInputEventHandler) objN3), jVar3, 0);
                    b2.r rVarE = z1.e(z1.q(h0.c.G(sVar.a(oVar, b2.b.E), 0.0f, 0.0f, 0.0f, f12 - f14, 7), tp.h.c), f13);
                    float f15 = 24;
                    b2.r rVarG2 = z.n.g(z.n.f(f2.h.c(rVarE, p0.f.a(f15)), dl.a.L, o0Var), 1, dl.a.Y, p0.f.a(f15));
                    z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode3 = Long.hashCode(g0Var3.T);
                    m1 m1VarM3 = g0Var3.m();
                    b2.r rVarC4 = b2.a.c(rVarG2, jVar3);
                    b3.i.f2042c.getClass();
                    b3.g gVar3 = b3.h.f2035b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar3);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(w0VarD, jVar3, b3.h.f2039f);
                    l1.q.I(m1VarM3, jVar3, b3.h.f2038e);
                    l1.q.I(Integer.valueOf(iHashCode3), jVar3, b3.h.f2040g);
                    l1.q.E(jVar3, b3.h.f2041h);
                    l1.q.I(rVarC4, jVar3, b3.h.f2037d);
                    y3.e(jVar3, 0);
                    g0Var3.r(true);
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case 5:
                l1.j jVar4 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((w.d0) obj, "$this$AnimatedVisibility");
                b2.o oVar2 = b2.o.A;
                b2.r rVarD = z1.d(oVar2, 1.0f);
                z2.w0 w0VarD2 = h0.o.d(b2.b.E, false);
                l1.g0 g0Var4 = (l1.g0) jVar4;
                int iHashCode4 = Long.hashCode(g0Var4.T);
                m1 m1VarM4 = g0Var4.m();
                b2.r rVarC5 = b2.a.c(rVarD, jVar4);
                b3.i.f2042c.getClass();
                b3.g gVar4 = b3.h.f2035b;
                g0Var4.g0();
                if (g0Var4.S) {
                    g0Var4.l(gVar4);
                } else {
                    g0Var4.q0();
                }
                l1.q.I(w0VarD2, jVar4, b3.h.f2039f);
                l1.q.I(m1VarM4, jVar4, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode4), jVar4, b3.h.f2040g);
                l1.q.E(jVar4, b3.h.f2041h);
                l1.q.I(rVarC5, jVar4, b3.h.f2037d);
                z6.b(z3.U(jVar4, 2131887334), w50.c.o(h0.c.G(oVar2, 0.0f, 50, 0.0f, 0.0f, 13), false, (j3.k) null, aVar, 7), dl.a.k, kh.o.z(16), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar4, 24576, 0, 262120);
                g0Var4.r(true);
                return b0Var;
            default:
                ((Integer) obj3).getClass();
                l1.g0 g0Var5 = (l1.g0) ((l1.j) obj2);
                g0Var5.c0(-756081143);
                z.v0 v0Var3 = (z.v0) g0Var5.k(z.s0.f16964a);
                if (v0Var3 != null) {
                    g0Var5.c0(-1604682242);
                } else {
                    g0Var5.c0(-1604549624);
                    Object objN4 = g0Var5.N();
                    if (objN4 == cVar) {
                        objN4 = w.c.g(g0Var5);
                    }
                    iVar = (f0.i) objN4;
                }
                g0Var5.r(false);
                b2.r rVarA = androidx.compose.foundation.b.a(b2.o.A, iVar, v0Var3, true, null, this.B);
                g0Var5.r(false);
                return rVarA;
        }
    }
}
