package ba;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class a0 extends r0 {

    public RecyclerView f2234a;

    public final i1 f2235b = new i1(this);

    public x f2236c;

    public x f2237d;

    public static int b(View view, y yVar) {
        return ((yVar.e(view) / 2) + yVar.g(view)) - ((yVar.n() / 2) + yVar.m());
    }

    public static View c(p0 p0Var, y yVar) {
        int iV = p0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (yVar.n() / 2) + yVar.m();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = p0Var.u(i11);
            int iAbs = Math.abs(((yVar.e(viewU) / 2) + yVar.g(viewU)) - iN);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(p0 p0Var, View view) {
        int[] iArr = new int[2];
        if (p0Var.d()) {
            iArr[0] = b(view, d(p0Var));
        } else {
            iArr[0] = 0;
        }
        if (p0Var.e()) {
            iArr[1] = b(view, e(p0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final y d(p0 p0Var) {
        x xVar = this.f2237d;
        if (xVar == null || ((p0) xVar.f2462b) != p0Var) {
            this.f2237d = new x(p0Var, 0);
        }
        return this.f2237d;
    }

    public final y e(p0 p0Var) {
        x xVar = this.f2236c;
        if (xVar == null || ((p0) xVar.f2462b) != p0Var) {
            this.f2236c = new x(p0Var, 1);
        }
        return this.f2236c;
    }

    public final void f() {
        p0 layoutManager;
        View viewC;
        RecyclerView recyclerView = this.f2234a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager.e()) {
            viewC = c(layoutManager, e(layoutManager));
        } else {
            viewC = layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        }
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i10 = iArrA[0];
        if (i10 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f2234a.i0(i10, iArrA[1], false);
    }
}
