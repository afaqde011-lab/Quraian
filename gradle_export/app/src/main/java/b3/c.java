package b3;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import java.util.HashSet;

public final class c extends b2.q implements y, o, j2, e2, a3.c, c2, x, p, g2.g, g2.s, g2.v, a2, f2.b {
    public b2.p O;
    public HashSet P;

    @Override
    public final void A(v2.k kVar, v2.l lVar, long j9) {
        boolean z10;
        boolean z11;
        boolean z12;
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        p10.a aVar = ((v2.y) pVar).D;
        v2.y yVar = (v2.y) aVar.D;
        ?? r12 = kVar.f15387a;
        int size = r12.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            }
            v2.s sVar = (v2.s) r12.get(i10);
            if (v2.r.b(sVar) || v2.r.d(sVar)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            z11 = false;
            break;
        }
        int size2 = r12.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z11 = true;
                break;
            } else {
                if (((v2.s) r12.get(i11)).b()) {
                    z11 = false;
                    break;
                }
                i11++;
            }
        }
        if (yVar.C) {
            z12 = true;
            break;
        }
        int size3 = r12.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                if (!z11) {
                    z12 = false;
                    break;
                }
                break;
            } else {
                v2.s sVar2 = (v2.s) r12.get(i12);
                if (!v2.r.b(sVar2) && !v2.r.d(sVar2)) {
                    i12++;
                }
            }
            z12 = true;
            break;
        }
        if (((v2.w) aVar.B) != v2.w.C) {
            if (lVar == v2.l.A && z12) {
                aVar.C = kVar;
                aVar.j(kVar, !z10 || yVar.C);
            }
            if (lVar == v2.l.B && z10 && kVar.equals((v2.k) aVar.C) && yVar.C) {
                int size4 = r12.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ((v2.s) r12.get(i13)).a();
                }
            }
            if (lVar == v2.l.C && !z12 && !kVar.equals((v2.k) aVar.C)) {
                aVar.j(kVar, true);
            }
        }
        if (lVar == v2.l.C) {
            int size5 = r12.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    aVar.B = v2.w.A;
                    ((v2.y) aVar.D).C = false;
                    aVar.C = null;
                    break;
                } else if (!v2.r.d((v2.s) r12.get(i14))) {
                    break;
                } else {
                    i14++;
                }
            }
            if (kVar.equals((v2.k) aVar.C) && z10) {
                int size6 = r12.size();
                for (int i15 = 0; i15 < size6; i15++) {
                    if (((v2.s) r12.get(i15)).b()) {
                        if (yVar.C) {
                            break;
                        }
                        aVar.C(kVar);
                        return;
                    }
                }
                int size7 = r12.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    ((v2.s) r12.get(i16)).a();
                }
            }
        }
    }

    public final void B1(boolean z10) {
        if (!this.N) {
            y2.a.c("initializeModifier called on unattached node");
        }
        b2.p pVar = this.O;
        if ((this.C & 4) != 0 && !z10) {
            m.v(this, 2).G1();
        }
        if ((this.C & 2) != 0) {
            l2 l2Var = (l2) m.y(this).f2059g0.F;
            kotlin.jvm.internal.m.c(l2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (l2Var.O) {
                p1 p1Var = this.H;
                kotlin.jvm.internal.m.b(p1Var);
                ((b0) p1Var).c2(this);
                z1 z1Var = p1Var.f2107n0;
                if (z1Var != null) {
                    ((c3.v1) z1Var).invalidate();
                }
            }
            if (!z10) {
                m.v(this, 2).G1();
                m.y(this).G();
            }
        }
        if (pVar instanceof j0.t) {
            j0.t tVar = (j0.t) pVar;
            l0 l0VarY = m.y(this);
            switch (tVar.A) {
                case 0:
                    ((j0.v) tVar.B).l = l0VarY;
                    break;
                case 1:
                    ((k0.y) tVar.B).f8552j = l0VarY;
                    break;
                default:
                    ((m0.w) tVar.B).f10405w.setValue(l0VarY);
                    break;
            }
        }
        if ((this.C & 256) != 0 && (pVar instanceof b1.h)) {
            l2 l2Var2 = (l2) m.y(this).f2059g0.F;
            kotlin.jvm.internal.m.c(l2Var2, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (l2Var2.O) {
                m.y(this).G();
            }
        }
        int i10 = this.C;
        if ((i10 & 16) != 0 && (pVar instanceof v2.y)) {
            ((v2.y) pVar).D.A = this.H;
        }
        if ((i10 & 8) != 0) {
            ((c3.z) m.z(this)).B();
        }
    }

    @Override
    public final void F(g2.y yVar) {
        b2.p pVar = this.O;
        y2.a.c("onFocusEvent called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override
    public final int G(u0 u0Var, z2.v0 v0Var, int i10) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z2.g0) pVar).e(new z2.z(u0Var, u0Var.getLayoutDirection()), new r1(v0Var, z2.z0.A, z2.a1.A, 2), y3.b.b(0, 0, 0, i10, 7)).d();
    }

    @Override
    public final int T(u0 u0Var, z2.v0 v0Var, int i10) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z2.g0) pVar).e(new z2.z(u0Var, u0Var.getLayoutDirection()), new r1(v0Var, z2.z0.B, z2.a1.A, 2), y3.b.b(0, 0, 0, i10, 7)).d();
    }

    @Override
    public final void W(p1 p1Var) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((b1.h) pVar).W(p1Var);
    }

    @Override
    public final void X() {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        p10.a aVar = ((v2.y) pVar).D;
        v2.w wVar = (v2.w) aVar.B;
        v2.y yVar = (v2.y) aVar.D;
        if (wVar == v2.w.B) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            v2.x xVar = new v2.x(yVar, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            xVar.invoke(motionEventObtain);
            motionEventObtain.recycle();
            aVar.B = v2.w.A;
            yVar.C = false;
            aVar.C = null;
        }
    }

    @Override
    public final boolean Z0() {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v2.y) pVar).D.getClass();
        return true;
    }

    @Override
    public final long b() {
        return kh.n.m0(m.v(this, Cast.MAX_NAMESPACE_LENGTH).C);
    }

    @Override
    public final y3.c c() {
        return m.y(this).Z;
    }

    @Override
    public final void c1(z2.a0 a0Var) {
    }

    @Override
    public final void d(long j9) {
    }

    @Override
    public final int d0(u0 u0Var, z2.v0 v0Var, int i10) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z2.g0) pVar).e(new z2.z(u0Var, u0Var.getLayoutDirection()), new r1(v0Var, z2.z0.B, z2.a1.B, 2), y3.b.b(0, i10, 0, 0, 13)).c();
    }

    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z2.g0) pVar).e(y0Var, v0Var, j9);
    }

    @Override
    public final void e0() {
        m.m(this);
    }

    @Override
    public final Object f(y3.c cVar, Object obj) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((z2.i1) pVar).f(cVar, obj);
    }

    @Override
    public final void f0() {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((v2.y) pVar).D.getClass();
    }

    @Override
    public final y3.m getLayoutDirection() {
        return m.y(this).f2053a0;
    }

    @Override
    public final void h() {
        if (this.O instanceof v2.y) {
            X();
        }
    }

    @Override
    public final void i(o0 o0Var) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        o0Var.a();
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        j3.o oVarK1 = ((j3.p) pVar).k1();
        kotlin.jvm.internal.m.c(a0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        j3.o oVar = (j3.o) a0Var;
        u.i0 i0Var = oVar.A;
        if (oVarK1.C) {
            oVar.C = true;
        }
        if (oVarK1.D) {
            oVar.D = true;
        }
        u.i0 i0Var2 = oVarK1.A;
        Object[] objArr = i0Var2.f14857b;
        Object[] objArr2 = i0Var2.f14858c;
        long[] jArr = i0Var2.f14856a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        j3.z zVar = (j3.z) obj;
                        if (!i0Var.b(zVar)) {
                            i0Var.m(zVar, obj2);
                        } else if (obj2 instanceof j3.a) {
                            Object objG = i0Var.g(zVar);
                            kotlin.jvm.internal.m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            j3.a aVar = (j3.a) objG;
                            String str = aVar.f7926a;
                            if (str == null) {
                                str = ((j3.a) obj2).f7926a;
                            }
                            g00.e eVar = aVar.f7927b;
                            if (eVar == null) {
                                eVar = ((j3.a) obj2).f7927b;
                            }
                            i0Var.m(zVar, new j3.a(str, eVar));
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final void q0(g2.p pVar) {
        b2.p pVar2 = this.O;
        y2.a.c("applyFocusProperties called on wrong node");
        pVar2.getClass();
        throw new ClassCastException();
    }

    @Override
    public final y3 r0() {
        return a3.a.f168g;
    }

    @Override
    public final void t1() {
        B1(true);
    }

    public final String toString() {
        return this.O.toString();
    }

    @Override
    public final boolean u() {
        return this.N;
    }

    @Override
    public final void u1() {
        if (!this.N) {
            y2.a.c("unInitializeModifier called on unattached node");
        }
        if ((this.C & 8) != 0) {
            ((c3.z) m.z(this)).B();
        }
    }

    @Override
    public final Object y0(me.i iVar) {
        a1.n nVar;
        this.P.add(iVar);
        if (!this.A.N) {
            y2.a.c("visitAncestors called on an unattached node");
        }
        b2.q qVar = this.A.E;
        l0 l0VarY = m.y(this);
        while (l0VarY != null) {
            if ((((b2.q) l0VarY.f2059g0.G).D & 32) != 0) {
                while (qVar != null) {
                    if ((qVar.C & 32) != 0) {
                        ?? E = qVar;
                        ?? eVar = 0;
                        while (E != 0) {
                            if (E instanceof a3.c) {
                                a3.c cVar = (a3.c) E;
                                if (cVar.r0().w(iVar)) {
                                    return cVar.r0().F(iVar);
                                }
                            } else if ((E.C & 32) != 0 && (E instanceof l)) {
                                b2.q qVar2 = ((l) E).P;
                                int i10 = 0;
                                E = E;
                                eVar = eVar;
                                while (qVar2 != null) {
                                    if ((qVar2.C & 32) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            E = qVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new m1.e(0, new b2.q[16]);
                                            }
                                            if (E != 0) {
                                                eVar.b(E);
                                                E = 0;
                                            }
                                            eVar.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.F;
                                    E = E;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            E = m.e(eVar);
                        }
                    }
                    qVar = qVar.E;
                }
            }
            l0VarY = l0VarY.x();
            qVar = (l0VarY == null || (nVar = l0VarY.f2059g0) == null) ? null : (l2) nVar.F;
        }
        return ((u00.a) iVar.B).invoke();
    }

    @Override
    public final int z(u0 u0Var, z2.v0 v0Var, int i10) {
        b2.p pVar = this.O;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((z2.g0) pVar).e(new z2.z(u0Var, u0Var.getLayoutDirection()), new r1(v0Var, z2.z0.A, z2.a1.B, 2), y3.b.b(0, i10, 0, 0, 13)).c();
    }
}
