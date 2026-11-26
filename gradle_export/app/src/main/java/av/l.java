package av;

import a1.c0;
import a1.y1;
import a1.z;
import a40.g1;
import android.content.DialogInterface;
import bv.e3;
import bv.o1;
import kotlin.Metadata;
import l1.g0;
import l1.r1;
import l1.z0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/l;", "Lqm/c;", "<init>", "()V", "Lbv/o1;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends qm.c {
    public final boolean C;
    public final Object D;
    public boolean E;

    public l() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new z(this, 8), 5));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        l1.j jVar2;
        l lVar = this;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1921266084);
        int i2 = (jVar3.i(lVar) ? 4 : 2) | i;
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r0 = lVar.D;
            z0 z0VarQ = k00.f.q(((e3) r0.getValue()).c.d, jVar3, 0);
            Boolean boolValueOf = Boolean.valueOf(((o1) z0VarQ.getValue()).R);
            boolean zG = jVar3.g(z0VarQ) | jVar3.i(lVar);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = new c0(lVar, z0VarQ, (k00.c) null, 4);
                jVar3.n0(objN);
            }
            l1.q.i(boolValueOf, jVar3, (u00.n) objN);
            o1 o1Var = (o1) z0VarQ.getValue();
            e3 e3Var = (e3) r0.getValue();
            boolean zG2 = jVar3.g(e3Var);
            Object objN2 = jVar3.N();
            if (zG2 || objN2 == cVar) {
                g1 g1Var = new g1(1, e3Var, e3.class, "action", "action(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/FullScreenAction;)V", 0, 4);
                jVar3.n0(g1Var);
                objN2 = g1Var;
            }
            u00.k kVar = (u00.k) ((a10.g) objN2);
            boolean zI = jVar3.i(lVar);
            Object objN3 = jVar3.N();
            if (zI || objN3 == cVar) {
                k kVar2 = new k(0, lVar, l.class, "hideWithAnimation", "hideWithAnimation()V", 0, 0);
                jVar3.n0(kVar2);
                objN3 = kVar2;
            }
            jVar2 = jVar3;
            gv.p.p(o1Var, kVar, (u00.a) ((a10.g) objN3), false, jVar2, 0, 8);
        } else {
            lVar = lVar;
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(lVar, i, 2);
        }
    }

    @Override
    public final boolean getC() {
        return this.C;
    }

    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.e(dialog, "dialog");
        if (!this.E) {
            ((e3) this.D.getValue()).o(bv.n.a);
        }
        super/*androidx.fragment.app.x*/.onDismiss(dialog);
    }
}
