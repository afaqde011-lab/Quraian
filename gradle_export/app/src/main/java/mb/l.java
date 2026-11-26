package mb;

import android.content.Context;
import c3.c2;
import c3.o0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.x5;
import l1.f2;
import l1.g0;
import l1.m1;
import l1.p1;
import l1.r1;
import u.i0;
import z2.f0;

public abstract class l {

    public static final k f10811a = new k();

    public static final u f10812b = new u();

    public static final void a(m mVar, b2.r rVar, u00.k kVar, b2.d dVar, z2.p pVar, l1.j jVar, int i10, int i11) {
        u00.k kVar2;
        b2.d dVar2;
        int i12;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-421592773);
        int i13 = (g0Var.g(mVar) ? 4 : 2) | i10;
        if ((i10 & 896) == 0) {
            i13 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 7168) == 0) {
            kVar2 = kVar;
            i13 |= g0Var.i(kVar2) ? 2048 : 1024;
        } else {
            kVar2 = kVar;
        }
        if ((i10 & 57344) == 0) {
            i13 |= g0Var.i(null) ? 16384 : 8192;
        }
        if ((i10 & 458752) == 0) {
            dVar2 = dVar;
            i13 |= g0Var.g(dVar2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 3670016) == 0) {
            i13 |= g0Var.g(pVar) ? 1048576 : 524288;
        }
        if ((i10 & 29360128) == 0) {
            i13 |= g0Var.d(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i13 |= g0Var.g(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i13 |= g0Var.e(1) ? 536870912 : 268435456;
        }
        if ((i11 & 14) == 0) {
            i12 = i11 | (g0Var.h(true) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((1533916891 & i13) == 306783378 && (i12 & 11) == 2 && g0Var.C()) {
            g0Var.V();
        } else {
            wb.i iVarA = c0.a(mVar.f10813a, pVar, g0Var);
            int i14 = i13 >> 6;
            int i15 = i14 & 57344;
            j jVarH = h(iVarA, mVar.f10815c, kVar2, null, pVar, g0Var, 0);
            xb.h hVar = iVarA.f15956x;
            c(hVar instanceof q ? rVar.V((b2.r) hVar) : rVar, jVarH, dVar2, pVar, g0Var, 384 | (i14 & 7168) | i15 | (i14 & 458752) | (i14 & 3670016) | ((i12 << 21) & 29360128));
            g0Var = g0Var;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a(mVar, rVar, kVar, dVar, pVar, i10, i11, 0);
        }
    }

    public static final void b(wb.i iVar, b2.r rVar, l1.j jVar) {
        g0 g0Var = (g0) jVar;
        g0Var.d0(1451072229);
        b bVar = b.C;
        b2.i iVar2 = b2.b.E;
        lb.f fVarG = g(w.f10817a, g0Var);
        g0Var.d0(2032051394);
        a(new m(iVar, f10812b, fVarG), rVar, bVar, iVar2, z2.o.f17146b, g0Var, 1572912, 0);
        g0Var.r(false);
        g0Var.r(false);
    }

    public static final void c(b2.r rVar, j jVar, b2.d dVar, z2.p pVar, l1.j jVar2, int i10) {
        int i11;
        g0 g0Var = (g0) jVar2;
        g0Var.e0(777774312);
        if ((i10 & 14) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= g0Var.g(jVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= g0Var.g(null) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 7168) == 0) {
            i11 |= g0Var.g(dVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= g0Var.g(pVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= g0Var.d(1.0f) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((3670016 & i10) == 0) {
            i11 |= g0Var.g(null) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= g0Var.h(true) ? 8388608 : 4194304;
        }
        if ((i11 & 23967451) == 4793490 && g0Var.C()) {
            g0Var.V();
        } else {
            xb.e eVar = c0.f10804b;
            b2.r rVarV = f2.h.d(rVar).V(new r(jVar, dVar, pVar, 1.0f));
            c cVar = c.f10800b;
            g0Var.d0(544976794);
            int iHashCode = Long.hashCode(g0Var.T);
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            m1 m1VarM = g0Var.m();
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.d0(1405779621);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(new b6.n(2, gVar));
            } else {
                g0Var.q0();
            }
            l1.q.I(cVar, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            x5.z(g0Var, true, false, false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b4.o(rVar, jVar, dVar, pVar, i10);
        }
    }

    public static final void d(wb.i iVar, b2.r rVar, v1.c cVar, z2.p pVar, l1.j jVar, int i10, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.d0(1925822313);
        b bVar = b.C;
        g00.e eVar = (i11 & 16) != 0 ? null : qt.a.b;
        if ((i11 & 64) != 0) {
            cVar = null;
        }
        b2.i iVar2 = b2.b.E;
        lb.f fVarG = g(w.f10817a, g0Var);
        g0Var.d0(428575962);
        m mVar = new m(iVar, f10812b, fVarG);
        xb.e eVar2 = c0.f10804b;
        e(mVar, rVar, bVar, null, iVar2, pVar, (eVar == null && cVar == null) ? o.f10816a : new v1.c(new b0(eVar, cVar, 0), -1302781228, true), g0Var, 1572912, 0);
        g0Var.r(false);
        g0Var.r(false);
    }

    public static final void e(m mVar, b2.r rVar, u00.k kVar, u00.k kVar2, b2.d dVar, z2.p pVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        v1.c cVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-892827826);
        int i13 = (g0Var.g(mVar) ? 4 : 2) | i10;
        if ((i10 & 896) == 0) {
            i13 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 7168) == 0) {
            i13 |= g0Var.i(kVar) ? 2048 : 1024;
        }
        int i14 = i13 | (g0Var.i(kVar2) ? 16384 : 8192);
        if ((458752 & i10) == 0) {
            i14 |= g0Var.g(dVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((3670016 & i10) == 0) {
            i14 |= g0Var.g(pVar) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i14 |= g0Var.d(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i14 |= g0Var.g(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i14 |= g0Var.e(1) ? 536870912 : 268435456;
        }
        if ((i11 & 14) == 0) {
            i12 = i11 | (g0Var.h(true) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((1533916891 & i14) == 306783378 && (i12 & 91) == 18 && g0Var.C()) {
            g0Var.V();
        } else {
            wb.i iVarA = c0.a(mVar.f10813a, pVar, g0Var);
            int i15 = i14 >> 6;
            int i16 = i14 >> 12;
            j jVarH = h(iVarA, mVar.f10815c, kVar, kVar2, pVar, g0Var, 64);
            xb.h hVar = iVarA.f15956x;
            boolean z10 = hVar instanceof q;
            l1.c cVar3 = l1.i.f9868a;
            if (z10) {
                g0Var.d0(-247973763);
                g00.e yVar = new y(hVar, cVar, jVarH, dVar, pVar, 0);
                g0Var.Z(Integer.rotateLeft(748478484, 1), v1.d.f15331a);
                Object objN = g0Var.N();
                if (objN == cVar3) {
                    cVar2 = new v1.c(yVar, 748478484, true);
                    g0Var.n0(cVar2);
                } else {
                    kotlin.jvm.internal.m.c(objN, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
                    cVar2 = (v1.c) objN;
                    cVar2.k(yVar);
                }
                v1.c cVar4 = cVar2;
                g0Var.r(false);
                h0.c.a(rVar, dVar, true, cVar4, g0Var, (i15 & 14) | 3456 | (i16 & 112), 0);
                g0Var.r(false);
            } else {
                g0Var.d0(-247974462);
                g0Var.d0(733328855);
                int i17 = (((((i15 & 14) | 384) | (i16 & 112)) >> 3) & 14) | 48;
                i0 i0Var = h0.o.f6447a;
                kotlin.jvm.internal.m.a(dVar, b2.b.A);
                g0Var.c0(244380021);
                boolean z11 = (((i17 & 14) ^ 6) > 4 && g0Var.g(dVar)) || (i17 & 6) == 4;
                Object objN2 = g0Var.N();
                if (z11 || objN2 == cVar3) {
                    objN2 = new h0.q(dVar, true);
                    g0Var.n0(objN2);
                }
                h0.q qVar = (h0.q) objN2;
                g0Var.r(false);
                g0Var.d0(-1323940314);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b3.i.f2042c.getClass();
                b3.g gVar = b3.h.f2035b;
                v1.c cVar5 = new v1.c(new f0(rVar), -511438721, true);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(qVar, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                b3.f fVar = b3.h.f2040g;
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                    x5.v(iHashCode, g0Var, iHashCode, fVar);
                }
                cVar5.invoke(new f2(g0Var), g0Var, 0);
                g0Var.d0(2058660585);
                cVar.invoke(new x(h0.s.f6456a, jVarH, dVar, pVar), g0Var, Integer.valueOf(i12 & 112));
                g0Var.r(false);
                g0Var.r(true);
                g0Var.r(false);
                g0Var.r(false);
                g0Var.r(false);
            }
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new z(mVar, rVar, kVar, kVar2, dVar, pVar, cVar, i10, i11);
        }
    }

    public static final void f(x xVar, b2.r rVar, m2.b bVar, b2.d dVar, z2.p pVar, float f3, boolean z10, l1.j jVar, int i10) {
        int i11;
        m2.b bVar2;
        b2.d dVar2;
        z2.p pVar2;
        b2.r rVar2;
        float f10;
        boolean z11;
        m2.b bVar3;
        b2.r rVar3;
        float f11;
        boolean z12;
        g0 g0Var = (g0) jVar;
        g0Var.e0(880638523);
        if ((i10 & 14) == 0) {
            i11 = (g0Var.g(xVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 176;
        if ((i10 & 7168) == 0) {
            i12 = i11 | 1200;
        }
        if ((57344 & i10) == 0) {
            i12 |= 8192;
        }
        if ((458752 & i10) == 0) {
            i12 |= Cast.MAX_MESSAGE_LENGTH;
        }
        if ((3670016 & i10) == 0) {
            i12 |= 524288;
        }
        if ((29360128 & i10) == 0) {
            i12 |= 4194304;
        }
        if ((234881024 & i10) == 0) {
            i12 |= 33554432;
        }
        if ((191739611 & i12) == 38347922 && g0Var.C()) {
            g0Var.V();
            rVar3 = rVar;
            bVar3 = bVar;
            dVar2 = dVar;
            pVar2 = pVar;
            f11 = f3;
            z12 = z10;
        } else {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                bVar2 = xVar.f10819b;
                xVar.getClass();
                dVar2 = xVar.f10820c;
                pVar2 = xVar.f10821d;
                xVar.getClass();
                xVar.getClass();
                xVar.getClass();
                rVar2 = b2.o.A;
                f10 = 1.0f;
                z11 = true;
            } else {
                g0Var.V();
                rVar2 = rVar;
                bVar2 = bVar;
                dVar2 = dVar;
                pVar2 = pVar;
                f10 = f3;
                z11 = z10;
            }
            g0Var.s();
            xb.e eVar = c0.f10804b;
            b2.r rVarV = (z11 ? f2.h.d(rVar2) : rVar2).V(new r(bVar2, dVar2, pVar2, f10));
            c cVar = c.f10801c;
            g0Var.d0(544976794);
            int iHashCode = Long.hashCode(g0Var.T);
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            m1 m1VarM = g0Var.m();
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.d0(1405779621);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(new b6.n(3, gVar));
            } else {
                g0Var.q0();
            }
            l1.q.I(cVar, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            x5.z(g0Var, true, false, false);
            bVar3 = bVar2;
            rVar3 = rVar2;
            f11 = f10;
            z12 = z11;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a0(xVar, rVar3, bVar3, dVar2, pVar2, f11, z12, i10);
        }
    }

    public static final lb.f g(p1 p1Var, l1.j jVar) {
        g0 g0Var = (g0) jVar;
        lb.f fVar = (lb.f) g0Var.k(p1Var);
        return fVar == null ? lb.a.a((Context) g0Var.k(o0.f2722b)) : fVar;
    }

    public static final j h(Object obj, lb.f fVar, u00.k kVar, u00.k kVar2, z2.p pVar, l1.j jVar, int i10) {
        wb.i iVar;
        g0 g0Var = (g0) jVar;
        g0Var.d0(1645646697);
        g0Var.d0(952940650);
        xb.e eVar = c0.f10804b;
        g0Var.d0(1087186730);
        boolean z10 = obj instanceof wb.i;
        l1.c cVar = l1.i.f9868a;
        if (z10) {
            iVar = (wb.i) obj;
            g0Var.r(false);
        } else {
            Context context = (Context) g0Var.k(o0.f2722b);
            g0Var.d0(375474364);
            boolean zG = g0Var.g(context) | g0Var.g(obj);
            Object objN = g0Var.N();
            if (zG || objN == cVar) {
                wb.h hVar = new wb.h(context);
                hVar.f15918c = obj;
                objN = hVar.a();
                g0Var.n0(objN);
            }
            iVar = (wb.i) objN;
            g0Var.r(false);
            g0Var.r(false);
        }
        Object obj2 = iVar.f15936b;
        if (obj2 instanceof wb.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj2 instanceof i2.d) {
            j("ImageBitmap");
            throw null;
        }
        if (obj2 instanceof o2.f) {
            j("ImageVector");
            throw null;
        }
        if (obj2 instanceof m2.b) {
            j("Painter");
            throw null;
        }
        if (iVar.f15937c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        g0Var.d0(294038899);
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = new j(iVar, fVar);
            g0Var.n0(objN2);
        }
        j jVar2 = (j) objN2;
        g0Var.r(false);
        jVar2.L = kVar;
        jVar2.M = kVar2;
        jVar2.N = pVar;
        jVar2.O = 1;
        jVar2.P = ((Boolean) g0Var.k(c2.f2637a)).booleanValue();
        jVar2.S.setValue(fVar);
        jVar2.R.setValue(iVar);
        jVar2.d();
        g0Var.r(false);
        g0Var.r(false);
        return jVar2;
    }

    public static final j i(Object obj, z2.p pVar, l1.j jVar, int i10, int i11) {
        g0 g0Var = (g0) jVar;
        g0Var.d0(236159766);
        b bVar = b.C;
        if ((i11 & 8) != 0) {
            pVar = z2.o.f17146b;
        }
        j jVarH = h(obj, g(w.f10817a, g0Var), bVar, null, pVar, g0Var, 0);
        g0Var.r(false);
        return jVarH;
    }

    public static void j(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + a1.b.p("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }
}
