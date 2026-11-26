package av;

import a1.z;
import a40.g1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.w;
import bv.e3;
import bv.o1;
import bv.q0;
import c3.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;
import g00.b0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.r1;
import l1.z0;
import qd.s0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lav/i;", "Lqm/c;", "<init>", "()V", "Lbv/o1;", "uiState", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends qm.c {
    public final boolean C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public hf.c H;
    public final boolean I;
    public final h J;

    public i() {
        super(0);
        this.C = true;
        this.D = rd.a.I(g00.i.C, new a20.a(this, new g(this, 3), 4));
        g00.i iVar = g00.i.A;
        this.E = rd.a.I(iVar, new g(this, 0));
        this.F = rd.a.I(iVar, new g(this, 1));
        this.G = rd.a.I(iVar, new g(this, 2));
        this.I = true;
        this.J = new h(this, 0);
    }

    public static final java.lang.Object m(av.i r24, k00.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: av.i.m(av.i, k00.c):java.lang.Object");
    }

    @Override
    public final int getTheme() {
        return 2131951916;
    }

    @Override
    public final void j(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(212362304);
        int i2 = (g0Var.i(this) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            z0 z0VarQ = k00.f.q(n().c.d, g0Var, 0);
            boolean zI = g0Var.i(this);
            Object objN = g0Var.N();
            k00.c cVar = null;
            Object obj = l1.i.a;
            if (zI || objN == obj) {
                objN = new c(this, cVar, 0);
                g0Var.n0(objN);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            boolean z = ((o1) z0VarQ.getValue()).Q && ((o1) z0VarQ.getValue()).x;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI2 = g0Var.i(this) | g0Var.h(z);
            Object objN2 = g0Var.N();
            if (zI2 || objN2 == obj) {
                objN2 = new ab.o(this, z, (k00.c) null, 1);
                g0Var.n0(objN2);
            }
            l1.q.i(boolValueOf, g0Var, (u00.n) objN2);
            sg.f fVar = cm.a.A;
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            fVar.getClass();
            boolean z2 = sg.f.J(configuration) == cm.a.C;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Boolean boolValueOf3 = Boolean.valueOf(((o1) z0VarQ.getValue()).R);
            boolean zI3 = g0Var.i(this) | g0Var.h(z2) | g0Var.g(z0VarQ);
            Object objN3 = g0Var.N();
            if (zI3 || objN3 == obj) {
                objN3 = new d(this, z2, z0VarQ, (k00.c) null);
                g0Var.n0(objN3);
            }
            l1.q.h(boolValueOf2, boolValueOf3, (u00.n) objN3, g0Var);
            boolean z3 = ((o1) z0VarQ.getValue()).Z != null;
            Boolean boolValueOf4 = Boolean.valueOf(z2);
            Boolean boolValueOf5 = Boolean.valueOf(z3);
            boolean zI4 = g0Var.i(this) | g0Var.h(z2) | g0Var.h(z3);
            Object objN4 = g0Var.N();
            if (zI4 || objN4 == obj) {
                objN4 = new e(this, z2, z3, null);
                g0Var.n0(objN4);
            }
            l1.q.h(boolValueOf4, boolValueOf5, (u00.n) objN4, g0Var);
            w wVar = (w) g0Var.k(r6.d.a);
            boolean zI5 = g0Var.i(wVar) | g0Var.i(this);
            Object objN5 = g0Var.N();
            if (zI5 || objN5 == obj) {
                objN5 = new a1.d(wVar, this, (k00.c) null, 9);
                g0Var.n0(objN5);
            }
            l1.q.i(wVar, g0Var, (u00.n) objN5);
            boolean zI6 = g0Var.i(this);
            Object objN6 = g0Var.N();
            if (zI6 || objN6 == obj) {
                objN6 = new z(this, 7);
                g0Var.n0(objN6);
            }
            s0.E(false, (u00.a) objN6, g0Var, 0, 1);
            o1 o1Var = (o1) z0VarQ.getValue();
            e3 e3VarN = n();
            boolean zG = g0Var.g(e3VarN);
            Object objN7 = g0Var.N();
            if (zG || objN7 == obj) {
                g1 g1Var = new g1(1, e3VarN, e3.class, "action", "action(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/FullScreenAction;)V", 0, 3);
                g0Var.n0(g1Var);
                objN7 = g1Var;
            }
            bv.a.a(o1Var, (u00.k) ((a10.g) objN7), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a(this, i);
        }
    }

    @Override
    public final boolean getB() {
        return this.I;
    }

    @Override
    public final boolean getC() {
        return this.C;
    }

    public final e3 n() {
        return (e3) this.D.getValue();
    }

    public final void o() {
        Window window;
        Window window2;
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            a.a.d0(window2, false);
        }
        androidx.fragment.app.o0 activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        a.a.d0(window, false);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        float f;
        yu.g gVar;
        Bundle arguments;
        FullScreenLauncher fullScreenLauncher;
        super/*androidx.fragment.app.x*/.onCreate(bundle);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        gm.a aVar = getResources().getConfiguration().screenWidthDp > 600 ? gm.a.B : gm.a.A;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int iOrdinal = ((cm.a) this.F.getValue()).ordinal();
        if (iOrdinal == 0) {
            i = 290;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 315;
        }
        float f3 = i * f2;
        int iOrdinal2 = aVar.ordinal();
        if (iOrdinal2 == 0) {
            f = i2;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f = (j.b + j.c + j.d) * f2;
        }
        float f4 = i2 - f;
        if (i3 - f3 >= f4) {
            gVar = aVar == gm.a.A ? yu.g.A : yu.g.B;
        } else {
            gVar = f4 / ((float) 2) > j.a * f2 ? yu.g.C : yu.g.D;
        }
        n().o(new bv.d(gVar));
        if (bundle != null || (arguments = getArguments()) == null || (fullScreenLauncher = (FullScreenLauncher) arguments.getParcelable("launcher", FullScreenLauncher.class)) == null) {
            return;
        }
        n().o(new bv.e(fullScreenLauncher));
    }

    @Override
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.e(inflater, "inflater");
        ComposeView composeViewInflate = LayoutInflater.from(requireContext()).inflate(2131558428, (ViewGroup) null, false);
        if (composeViewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = composeViewInflate;
        this.H = new hf.c(composeView, 5);
        composeView.setContent(new v1.c(new a(this, 0, (byte) 0), -2103613152, true));
        hf.c cVar = this.H;
        if (cVar != null) {
            return (ComposeView) cVar.B;
        }
        kotlin.jvm.internal.m.k("binding");
        throw null;
    }

    public final void onDestroyView() {
        o();
        super/*androidx.fragment.app.x*/.onDestroyView();
    }

    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.m.e(dialog, "dialog");
        o();
        if (getLifecycle().b().compareTo(androidx.lifecycle.p.C) >= 0) {
            n().o(new q0());
        }
        super/*androidx.fragment.app.x*/.onDismiss(dialog);
    }

    public final void onPause() {
        super/*androidx.fragment.app.j0*/.onPause();
        requireActivity().getWindow().clearFlags(128);
    }

    public final void onResume() {
        super/*androidx.fragment.app.j0*/.onResume();
        requireActivity().getWindow().addFlags(128);
    }

    public final void onStart() {
        BottomSheetBehavior bottomSheetBehaviorF;
        super/*androidx.fragment.app.x*/.onStart();
        eg.f dialog = getDialog();
        eg.f fVar = dialog instanceof eg.f ? dialog : null;
        if (fVar == null || (bottomSheetBehaviorF = fVar.f()) == null) {
            return;
        }
        ArrayList arrayList = bottomSheetBehaviorF.Y;
        h hVar = this.J;
        if (arrayList.contains(hVar)) {
            return;
        }
        arrayList.add(hVar);
    }

    public final void onStop() {
        BottomSheetBehavior bottomSheetBehaviorF;
        eg.f dialog = getDialog();
        eg.f fVar = dialog instanceof eg.f ? dialog : null;
        if (fVar != null && (bottomSheetBehaviorF = fVar.f()) != null) {
            bottomSheetBehaviorF.Y.remove(this.J);
        }
        super/*androidx.fragment.app.x*/.onStop();
    }
}
