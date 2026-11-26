package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public final class j implements o.x {
    public final Context A;
    public Context B;
    public o.l C;
    public final LayoutInflater D;
    public o.w E;
    public o.z H;
    public i I;
    public Drawable J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public f S;
    public f T;
    public h U;
    public g V;
    public final int F = 2131558403;
    public final int G = 2131558402;
    public final SparseBooleanArray R = new SparseBooleanArray();
    public final o9.q W = new o9.q(this, 4);

    public j(Context context) {
        this.A = context;
        this.D = LayoutInflater.from(context);
    }

    public final View a(o.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            o.y yVar = view instanceof o.y ? (o.y) view : (o.y) this.D.inflate(this.G, viewGroup, false);
            yVar.a(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.H);
            if (this.V == null) {
                this.V = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.V);
            actionView = (View) yVar;
        }
        actionView.setVisibility(nVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override
    public final void b(Context context, o.l lVar) {
        this.B = context;
        LayoutInflater.from(context);
        this.C = lVar;
        Resources resources = context.getResources();
        if (!this.M) {
            this.L = true;
        }
        int i10 = 2;
        this.N = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.P = i10;
        int measuredWidth = this.N;
        if (this.L) {
            if (this.I == null) {
                i iVar = new i(this, this.A);
                this.I = iVar;
                if (this.K) {
                    iVar.setImageDrawable(this.J);
                    this.J = null;
                    this.K = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.I.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.I.getMeasuredWidth();
        } else {
            this.I = null;
        }
        this.O = measuredWidth;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override
    public final void c(o.l lVar, boolean z10) {
        h();
        f fVar = this.T;
        if (fVar != null && fVar.b()) {
            fVar.f11464i.dismiss();
        }
        o.w wVar = this.E;
        if (wVar != null) {
            wVar.c(lVar, z10);
        }
    }

    @Override
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i10;
        boolean z10;
        j jVar = this;
        o.l lVar = jVar.C;
        if (lVar != null) {
            arrayListL = lVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i11 = jVar.P;
        int i12 = jVar.O;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.H;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            o.n nVar = (o.n) arrayListL.get(i13);
            int i16 = nVar.f11446y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (jVar.Q && nVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (jVar.L && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = jVar.R;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            o.n nVar2 = (o.n) arrayListL.get(i18);
            int i20 = nVar2.f11446y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = nVar2.f11425b;
            if (z12) {
                View viewA = jVar.a(nVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                nVar2.f(z10);
            } else {
                if ((i20 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i21);
                    boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                    if (z14) {
                        View viewA2 = jVar.a(nVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z14 &= i12 + i19 > 0;
                    }
                    if (z14 && i21 != 0) {
                        sparseBooleanArray.put(i21, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i21, false);
                        for (int i22 = 0; i22 < i18; i22++) {
                            o.n nVar3 = (o.n) arrayListL.get(i22);
                            if (nVar3.f11425b == i21) {
                                if ((nVar3.f11445x & 32) == 32) {
                                    i17++;
                                }
                                nVar3.f(false);
                            }
                        }
                    }
                    if (z14) {
                        i17--;
                    }
                    nVar2.f(z14);
                } else {
                    nVar2.f(false);
                }
                i18++;
                i10 = 2;
                jVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            jVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override
    public final boolean e(o.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            o.d0 d0Var2 = d0Var;
            while (true) {
                o.l lVar = d0Var2.f11397z;
                if (lVar == this.C) {
                    break;
                }
                d0Var2 = (o.d0) lVar;
            }
            o.n nVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.H;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof o.y) && ((o.y) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f11407f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = d0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                f fVar = new f(this, this.B, d0Var, view);
                this.T = fVar;
                fVar.f11462g = z10;
                o.t tVar = fVar.f11464i;
                if (tVar != null) {
                    tVar.n(z10);
                }
                f fVar2 = this.T;
                if (!fVar2.b()) {
                    if (fVar2.f11460e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                o.w wVar = this.E;
                if (wVar != null) {
                    wVar.x(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.H;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            o.l lVar = this.C;
            if (lVar != null) {
                lVar.i();
                ArrayList arrayListL = this.C.l();
                int size = arrayListL.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    o.n nVar = (o.n) arrayListL.get(i11);
                    if ((nVar.f11445x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        o.n itemData = childAt instanceof o.y ? ((o.y) childAt).getItemData() : null;
                        View viewA = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.H).addView(viewA, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.I) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.H).requestLayout();
        o.l lVar2 = this.C;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f11410i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                z4.c cVar = ((o.n) arrayList2.get(i12)).A;
            }
        }
        o.l lVar3 = this.C;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f11411j;
        }
        if (this.L && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((o.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.I == null) {
                this.I = new i(this, this.A);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.I.getParent();
            if (viewGroup3 != this.H) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.I);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.H;
                i iVar = this.I;
                actionMenuView.getClass();
                l lVarJ = ActionMenuView.j();
                lVarJ.f12181a = true;
                actionMenuView.addView(iVar, lVarJ);
            }
        } else {
            i iVar2 = this.I;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.H;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.I);
                }
            }
        }
        ((ActionMenuView) this.H).setOverflowReserved(this.L);
    }

    @Override
    public final boolean g(o.n nVar) {
        return false;
    }

    public final boolean h() {
        Object obj;
        h hVar = this.U;
        if (hVar != null && (obj = this.H) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.U = null;
            return true;
        }
        f fVar = this.S;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f11464i.dismiss();
        }
        return true;
    }

    @Override
    public final void i(o.w wVar) {
        throw null;
    }

    @Override
    public final boolean j(o.n nVar) {
        return false;
    }

    public final boolean k() {
        f fVar = this.S;
        return fVar != null && fVar.b();
    }

    public final boolean l() {
        o.l lVar;
        if (!this.L || k() || (lVar = this.C) == null || this.H == null || this.U != null) {
            return false;
        }
        lVar.i();
        if (lVar.f11411j.isEmpty()) {
            return false;
        }
        h hVar = new h(this, new f(this, this.B, this.C, this.I));
        this.U = hVar;
        ((View) this.H).post(hVar);
        return true;
    }
}
