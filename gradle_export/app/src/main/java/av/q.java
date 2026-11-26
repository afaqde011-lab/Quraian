package av;

import a1.a0;
import a1.y1;
import a40.g1;
import android.content.DialogInterface;
import android.os.Bundle;
import c00.x;
import g00.b0;
import i7.z;
import kotlin.Metadata;
import l1.g0;
import l1.r1;
import l1.z0;
import qd.s0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/q;", "Lqm/c;", "<init>", "()V", "Lc00/t;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends qm.c {
    public final boolean C;
    public final Object D;
    public z E;

    public q() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new a30.l(this, 2), 8));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-104241160);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r3 = this.D;
            z0 z0VarQ = k00.f.q(((x) r3.getValue()).c.d, g0Var, 0);
            boolean zI = g0Var.i(this);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zI || objN == cVar) {
                objN = new a0(this, (k00.c) null, 3);
                g0Var.n0(objN);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            boolean zI2 = g0Var.i(this);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == cVar) {
                objN2 = new a1.z(this, 10);
                g0Var.n0(objN2);
            }
            s0.E(false, (u00.a) objN2, g0Var, 0, 1);
            c00.t tVar = (c00.t) z0VarQ.getValue();
            x xVar = (x) r3.getValue();
            boolean zG = g0Var.g(xVar);
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar) {
                g1 g1Var = new g1(1, xVar, x.class, "action", "action(Lcom/mchutov/quranify/soundeffect/presentation/screen/picker/SoundEffectPickerAction;)V", 0, 7);
                g0Var.n0(g1Var);
                objN3 = g1Var;
            }
            c00.a.h(tVar, (u00.k) ((a10.g) objN3), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(this, i, 5);
        }
    }

    @Override
    public final boolean getC() {
        return this.C;
    }

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.x*/.onCreate(bundle);
        ((x) this.D.getValue()).k(c00.d.a);
    }

    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.e(dialog, "dialog");
        z zVar = this.E;
        if (zVar != null) {
            zVar.release();
        }
        this.E = null;
        super/*androidx.fragment.app.x*/.onDismiss(dialog);
    }
}
