package av;

import a1.c0;
import a1.y1;
import a40.g1;
import android.content.DialogInterface;
import bv.e3;
import bv.o1;
import kotlin.Metadata;
import l1.g0;
import l1.r1;
import l1.z0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/n;", "Lqm/c;", "<init>", "()V", "Lbv/o1;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends qm.c {
    public final boolean C;
    public final Object D;
    public boolean E;

    public n() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new m(this, 0), 6));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-740374662);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r2 = this.D;
            z0 z0VarQ = k00.f.q(((e3) r2.getValue()).c.d, g0Var, 0);
            yu.a aVar = ((o1) z0VarQ.getValue()).Z;
            Boolean boolValueOf = Boolean.valueOf(aVar == null);
            boolean zG = g0Var.g(aVar) | g0Var.i(this);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = new c0(aVar, this, (k00.c) null, 5);
                g0Var.n0(objN);
            }
            l1.q.i(boolValueOf, g0Var, (u00.n) objN);
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = new m(this, 1);
                g0Var.n0(objN2);
            }
            u00.a aVar2 = (u00.a) objN2;
            if (aVar == null) {
                g0Var.c0(-1844083341);
                g0Var.r(false);
            } else {
                g0Var.c0(-1844083340);
                boolean zB = ((o1) z0VarQ.getValue()).b();
                e3 e3Var = (e3) r2.getValue();
                boolean zG2 = g0Var.g(e3Var);
                Object objN3 = g0Var.N();
                if (zG2 || objN3 == obj) {
                    g1 g1Var = new g1(1, e3Var, e3.class, "action", "action(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/FullScreenAction;)V", 0, 5);
                    g0Var.n0(g1Var);
                    objN3 = g1Var;
                }
                iv.n.b(aVar, zB, (u00.k) ((a10.g) objN3), aVar2, g0Var, 3072);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(this, i, 3);
        }
    }

    @Override
    public final boolean getC() {
        return this.C;
    }

    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.e(dialog, "dialog");
        if (!this.E) {
            ((e3) this.D.getValue()).o(bv.o.a);
        }
        super/*androidx.fragment.app.x*/.onDismiss(dialog);
    }
}
