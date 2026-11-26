package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.i1;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import z4.j0;

public final class m<S> extends v {
    public int B;
    public b C;
    public q D;
    public int E;
    public c F;
    public RecyclerView G;
    public RecyclerView H;
    public View I;
    public View J;
    public View K;
    public View L;
    public MaterialButton M;
    public AccessibilityManager N;

    public final void i(q qVar) {
        u uVar = (u) this.H.getAdapter();
        int iD = uVar.f4162a.A.d(qVar);
        AccessibilityManager accessibilityManager = this.N;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iD2 = iD - uVar.f4162a.A.d(this.D);
            boolean z10 = Math.abs(iD2) > 3;
            boolean z11 = iD2 > 0;
            this.D = qVar;
            if (z10 && z11) {
                this.H.g0(iD - 3);
                this.H.post(new com.google.android.gms.common.api.internal.y(this, iD, 1));
            } else if (z10) {
                this.H.g0(iD + 3);
                this.H.post(new com.google.android.gms.common.api.internal.y(this, iD, 1));
            } else {
                this.H.post(new com.google.android.gms.common.api.internal.y(this, iD, 1));
            }
        } else {
            this.D = qVar;
            this.H.g0(iD);
        }
        k(iD);
    }

    public final void j(int i10) {
        this.E = i10;
        if (i10 == 2) {
            this.G.getLayoutManager().q0(this.D.C - ((a0) this.G.getAdapter()).f4155a.C.A.C);
            this.K.setVisibility(0);
            this.L.setVisibility(8);
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.K.setVisibility(8);
            this.L.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            i(this.D);
        }
    }

    public final void k(int i10) {
        this.J.setEnabled(i10 + 1 < this.H.getAdapter().getItemCount());
        this.I.setEnabled(i10 - 1 >= 0);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.B = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.C = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.D = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ba.a0 a0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.B);
        this.F = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.N = (AccessibilityManager) requireContext().getSystemService("accessibility");
        q qVar = this.C.A;
        if (o.l(contextThemeWrapper, R.attr.windowFullscreen)) {
            i10 = 2131559118;
            i11 = 1;
        } else {
            i10 = 2131559113;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166161) + resources.getDimensionPixelOffset(2131166163) + resources.getDimensionPixelSize(2131166162);
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166146);
        int i12 = r.D;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(2131166160) * (i12 - 1)) + (resources.getDimensionPixelSize(2131166141) * i12) + resources.getDimensionPixelOffset(2131166138));
        GridView gridView = (GridView) viewInflate.findViewById(2131362873);
        j0.g(gridView, new g(0));
        int i13 = this.C.E;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new e(i13) : new e()));
        gridView.setNumColumns(qVar.D);
        gridView.setEnabled(false);
        this.H = (RecyclerView) viewInflate.findViewById(2131362876);
        getContext();
        this.H.setLayoutManager(new h(this, i11, i11));
        this.H.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.C, new me.i(this, 16));
        this.H.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(2131427392);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(2131362879);
        this.G = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.G.setLayoutManager(new GridLayoutManager(integer));
            this.G.setAdapter(new a0(this));
            RecyclerView recyclerView4 = this.G;
            i iVar = new i();
            y.c(null);
            y.c(null);
            recyclerView4.i(iVar);
        }
        View viewFindViewById = viewInflate.findViewById(2131362806);
        b bVar = uVar.f4162a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(2131362806);
            this.M = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            j0.g(this.M, new j(this, 0));
            View viewFindViewById2 = viewInflate.findViewById(2131362808);
            this.I = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(2131362807);
            this.J = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.K = viewInflate.findViewById(2131362879);
            this.L = viewInflate.findViewById(2131362872);
            j(1);
            this.M.setText(this.D.c());
            this.H.j(new k(this, uVar));
            this.M.setOnClickListener(new l(this, 0));
            this.J.setOnClickListener(new f(this, uVar, 1));
            this.I.setOnClickListener(new f(this, uVar, 0));
            k(bVar.A.d(this.D));
        }
        if (!o.l(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (a0Var = new ba.a0()).f2234a) != (recyclerView = this.H)) {
            i1 i1Var = a0Var.f2235b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.I0;
                if (arrayList != null) {
                    arrayList.remove(i1Var);
                }
                a0Var.f2234a.setOnFlingListener(null);
            }
            a0Var.f2234a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                a0Var.f2234a.j(i1Var);
                a0Var.f2234a.setOnFlingListener(a0Var);
                new Scroller(a0Var.f2234a.getContext(), new DecelerateInterpolator());
                a0Var.f();
            }
        }
        this.H.g0(bVar.A.d(this.D));
        j0.g(this.H, new g(1));
        return viewInflate;
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.B);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.C);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.D);
    }
}
