package oo;

import kotlin.Metadata;
import l1.r1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Loo/c0;", "Lqm/c;", "<init>", "()V", "Loo/z0;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends qm.c {
    public final boolean C;
    public final Object D;
    public final Object E;

    public c0() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new b0(this, 1), 29));
        this.E = rd.a.I(g00.i.A, new b0(this, 0));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(216967915);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r3 = this.D;
            l1.z0 z0VarQ = k00.f.q(((g1) r3.getValue()).c.d, g0Var, 0);
            boolean zI = g0Var.i(this);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zI || objN == cVar) {
                objN = new l6.d(this, (k00.c) null, 5);
                g0Var.n0(objN);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN);
            boolean zI2 = g0Var.i(this);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == cVar) {
                objN2 = new g1.l0(this, 24);
                g0Var.n0(objN2);
            }
            qd.s0.E(false, (u00.a) objN2, g0Var, 0, 1);
            z0 z0Var = (z0) z0VarQ.getValue();
            g1 g1Var = (g1) r3.getValue();
            boolean zG = g0Var.g(g1Var);
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar) {
                gz.e1 e1Var = new gz.e1(1, g1Var, g1.class, "action", "action(Lcom/mchutov/quranify/audiostories/presentation/screen/player/AudioStoryPlayerAction;)V", 0, 12);
                g0Var.n0(e1Var);
                objN3 = e1Var;
            }
            o0.d(z0Var, (u00.k) ((a10.g) objN3), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(this, i, 5);
        }
    }

    @Override
    public final boolean getC() {
        return this.C;
    }

    public final void onPause() {
        super/*androidx.fragment.app.j0*/.onPause();
        requireActivity().getWindow().clearFlags(128);
    }

    public final void onResume() {
        super/*androidx.fragment.app.j0*/.onResume();
        requireActivity().getWindow().addFlags(128);
    }
}
