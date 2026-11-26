package b4;

import android.content.Context;
import android.view.View;
import b3.l0;
import b3.p2;
import c3.o0;
import c3.o1;
import com.google.android.gms.cast.Cast;
import kotlin.KotlinNothingValueException;
import l1.e0;
import l1.g0;
import l1.m1;
import l1.r1;

public abstract class l {

    public static final k f2154a = new k();

    public static final void a(u00.k kVar, b2.r rVar, u00.k kVar2, l1.j jVar, int i10) {
        u00.k kVar3;
        b2.r rVar2;
        u00.k kVar4;
        c cVar = c.E;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1783766393);
        int i11 = (g0Var.i(kVar) ? 4 : 2) | i10 | (g0Var.i(kVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            kVar3 = kVar;
            rVar2 = rVar;
            kVar4 = kVar2;
            b(kVar3, rVar2, cVar, kVar4, g0Var, (i11 & 14) | 3120 | ((i11 << 6) & 57344));
        } else {
            kVar3 = kVar;
            rVar2 = rVar;
            kVar4 = kVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new m(kVar3, rVar2, kVar4, i10);
        }
    }

    public static final void b(u00.k kVar, b2.r rVar, u00.k kVar2, u00.k kVar3, l1.j jVar, int i10) {
        int i11;
        u00.k kVar4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-180024211);
        a30.x xVar = g0Var.f9842a;
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.i(kVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= g0Var.i(kVar3) ? 16384 : 8192;
        }
        if (g0Var.S(i12 & 1, (i12 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(g0Var.T);
            b2.r rVarC = b2.a.c(rVar.V(s.B).V(g2.z.B).V(x.B).V(v.B), g0Var);
            y3.c cVar = (y3.c) g0Var.k(o1.f2734h);
            y3.m mVar = (y3.m) g0Var.k(o1.f2738n);
            m1 m1VarM = g0Var.m();
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.f13126a);
            ia.g gVar = (ia.g) g0Var.k(ja.a.f8257a);
            g0Var.c0(1314774735);
            int i13 = i12 & 14;
            int iHashCode2 = Long.hashCode(g0Var.T);
            Context context = (Context) g0Var.k(o0.f2722b);
            e0 e0VarF = l1.q.F(g0Var);
            y1.f fVar = (y1.f) g0Var.k(y1.h.f16584a);
            View view = (View) g0Var.k(o0.f2726f);
            boolean zI = g0Var.i(context) | ((((i13 & 14) ^ 6) > 4 && g0Var.g(kVar)) || (i13 & 6) == 4) | g0Var.i(e0VarF) | g0Var.i(fVar) | g0Var.e(iHashCode2) | g0Var.i(view);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                p pVar = new p(context, kVar, e0VarF, fVar, iHashCode2, view);
                g0Var.n0(pVar);
                objN = pVar;
            }
            u00.a aVar = (u00.a) objN;
            if (!(xVar instanceof p2)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            b3.i.f2042c.getClass();
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(rVarC, g0Var, n.D);
            l1.q.I(cVar, g0Var, n.E);
            l1.q.I(wVar, g0Var, n.F);
            l1.q.I(gVar, g0Var, n.G);
            l1.q.I(mVar, g0Var, n.H);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.I(kVar3, g0Var, n.B);
            kVar4 = kVar2;
            l1.q.I(kVar4, g0Var, n.C);
            g0Var.r(true);
            g0Var.r(false);
        } else {
            kVar4 = kVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new o(kVar, rVar, kVar4, kVar3, i10);
        }
    }

    public static final View c(b2.q qVar) {
        z zVar = b3.m.y(qVar.A).P;
        View interopView = zVar != null ? zVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(z zVar, l0 l0Var) {
        long jD0 = ((b3.u) l0Var.f2059g0.D).d0(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jD0 >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jD0 & 4294967295L)));
        zVar.layout(iRound, iRound2, zVar.getMeasuredWidth() + iRound, zVar.getMeasuredHeight() + iRound2);
    }

    public static final z e(l0 l0Var) throws KotlinNothingValueException {
        z zVar = l0Var.P;
        if (zVar != null) {
            return zVar;
        }
        throw a1.b.u("Required value was null.");
    }
}
