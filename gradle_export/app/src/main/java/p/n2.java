package p;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public final class n2 implements o.x {
    public o.l A;
    public o.n B;
    public final Toolbar C;

    public n2(Toolbar toolbar) {
        this.C = toolbar;
    }

    @Override
    public final void b(Context context, o.l lVar) {
        o.n nVar;
        o.l lVar2 = this.A;
        if (lVar2 != null && (nVar = this.B) != null) {
            lVar2.d(nVar);
        }
        this.A = lVar;
    }

    @Override
    public final void c(o.l lVar, boolean z10) {
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean e(o.d0 d0Var) {
        return false;
    }

    @Override
    public final void f() {
        if (this.B != null) {
            o.l lVar = this.A;
            if (lVar != null) {
                int size = lVar.f11407f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.A.getItem(i10) == this.B) {
                        return;
                    }
                }
            }
            j(this.B);
        }
    }

    @Override
    public final boolean g(o.n nVar) {
        Toolbar toolbar = this.C;
        toolbar.c();
        ViewParent parent = toolbar.H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.H);
            }
            toolbar.addView(toolbar.H);
        }
        View actionView = nVar.getActionView();
        toolbar.I = actionView;
        this.B = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.I);
            }
            o2 o2VarH = Toolbar.h();
            o2VarH.f12191a = (toolbar.N & 112) | 8388611;
            o2VarH.f12192b = 2;
            toolbar.I.setLayoutParams(o2VarH);
            toolbar.addView(toolbar.I);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((o2) childAt.getLayoutParams()).f12192b != 2 && childAt != toolbar.A) {
                toolbar.removeViewAt(childCount);
                toolbar.f544h0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.C = true;
        nVar.f11435n.p(false);
        KeyEvent.Callback callback = toolbar.I;
        if (callback instanceof n.c) {
            ((o.p) ((n.c) callback)).A.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override
    public final boolean j(o.n nVar) {
        Toolbar toolbar = this.C;
        KeyEvent.Callback callback = toolbar.I;
        if (callback instanceof n.c) {
            ((o.p) ((n.c) callback)).A.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.I);
        toolbar.removeView(toolbar.H);
        toolbar.I = null;
        ArrayList arrayList = toolbar.f544h0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.B = null;
        toolbar.requestLayout();
        nVar.C = false;
        nVar.f11435n.p(false);
        toolbar.v();
        return true;
    }
}
