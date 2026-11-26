package av;

import a1.a0;
import a1.y1;
import a40.g1;
import android.os.Bundle;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.TafsirPickerLauncher;
import g00.b0;
import h0.z1;
import kotlin.Metadata;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import qd.s0;
import z2.w0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/t;", "Lqm/c;", "<init>", "()V", "Lqt/j;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends qm.c {
    public final Object C;

    public t() {
        super(0);
        r rVar = new r(this, 0);
        this.C = rd.a.I(g00.i.C, new s(this, new a30.l(this, 3), rVar, 0));
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(801506032);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            ?? r3 = this.C;
            z0 z0VarQ = k00.f.q(((qt.k) r3.getValue()).c.d, g0Var, 0);
            boolean zI = g0Var.i(this);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zI || objN == obj) {
                objN = new a0(this, (k00.c) null, 4);
                g0Var.n0(objN);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            boolean zI2 = g0Var.i(this);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == obj) {
                objN2 = new r(this, 1);
                g0Var.n0(objN2);
            }
            s0.E(false, (u00.a) objN2, g0Var, 0, 1);
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            Bundle arguments = getArguments();
            TafsirPickerLauncher tafsirPickerLauncher = arguments != null ? (TafsirPickerLauncher) arguments.getParcelable("launcher", TafsirPickerLauncher.class) : null;
            b2.r rVarC = z1.c(rVarD, (tafsirPickerLauncher != null ? tafsirPickerLauncher.getLayoutMode() : null) == yu.g.A ? 0.5f : 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            qt.j jVar2 = (qt.j) z0VarQ.getValue();
            qt.k kVar = (qt.k) r3.getValue();
            boolean zG = g0Var.g(kVar);
            Object objN3 = g0Var.N();
            if (zG || objN3 == obj) {
                g1 g1Var = new g1(1, kVar, qt.k.class, "action", "action(Lcom/mchutov/quranify/lyrics/presentation/screen/tafsirpicker/TafsirPickerAction;)V", 0, 8);
                g0Var.n0(g1Var);
                objN3 = g1Var;
            }
            qt.a.e(jVar2, (u00.k) ((a10.g) objN3), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(this, i, 6);
        }
    }

    @Override
    public final boolean getC() {
        Bundle arguments = getArguments();
        TafsirPickerLauncher tafsirPickerLauncher = arguments != null ? (TafsirPickerLauncher) arguments.getParcelable("launcher", TafsirPickerLauncher.class) : null;
        if (tafsirPickerLauncher != null) {
            return tafsirPickerLauncher.getIsFullScreen();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.x*/.onCreate(bundle);
        ((qt.k) this.C.getValue()).k(qt.c.a);
    }
}
