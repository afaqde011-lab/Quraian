package av;

import a1.a0;
import a1.y1;
import a1.z;
import a40.g1;
import ev.c0;
import g00.b0;
import kotlin.Metadata;
import l1.g0;
import l1.r1;
import l1.z0;
import qd.s0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/p;", "Lqm/c;", "<init>", "()V", "Lev/t;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends qm.c {
    public final boolean C;
    public final Object D;

    public p() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new a30.l(this, 1), 7));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(775189368);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r2 = this.D;
            z0 z0VarQ = k00.f.q(((c0) r2.getValue()).c.d, g0Var, 0);
            boolean zI = g0Var.i(this);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zI || objN == cVar) {
                objN = new a0(this, (k00.c) null, 2);
                g0Var.n0(objN);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            boolean zI2 = g0Var.i(this);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == cVar) {
                objN2 = new z(this, 9);
                g0Var.n0(objN2);
            }
            s0.E(false, (u00.a) objN2, g0Var, 0, 1);
            ev.t tVar = (ev.t) z0VarQ.getValue();
            c0 c0Var = (c0) r2.getValue();
            boolean zG = g0Var.g(c0Var);
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar) {
                g1 g1Var = new g1(1, c0Var, c0.class, "action", "action(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/reciterpicker/ReciterPickerAction;)V", 0, 6);
                g0Var.n0(g1Var);
                objN3 = g1Var;
            }
            ev.s.e(tVar, (u00.k) ((a10.g) objN3), false, g0Var, 0, 4);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(this, i, 4);
        }
    }

    @Override
    public final boolean getC() {
        return this.C;
    }
}
