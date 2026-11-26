package ba;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class d0 {

    public final RecyclerView f2262a;

    public void a(f1 f1Var, androidx.media3.common.w0 w0Var, androidx.media3.common.w0 w0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f2262a;
        recyclerView.getClass();
        f1Var.n(false);
        h hVar = (h) recyclerView.f1876o0;
        if (w0Var != null) {
            hVar.getClass();
            int i10 = w0Var.f1663a;
            int i11 = w0Var2.f1663a;
            if (i10 == i11 && w0Var.f1664b == w0Var2.f1664b) {
                hVar.l(f1Var);
                f1Var.f2275a.setAlpha(0.0f);
                hVar.f2300i.add(f1Var);
                zG = true;
            } else {
                zG = hVar.g(f1Var, i10, w0Var.f1664b, i11, w0Var2.f1664b);
            }
        } else {
            hVar.l(f1Var);
            f1Var.f2275a.setAlpha(0.0f);
            hVar.f2300i.add(f1Var);
            zG = true;
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void b(f1 f1Var, androidx.media3.common.w0 w0Var, androidx.media3.common.w0 w0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f2262a;
        recyclerView.C.p(f1Var);
        recyclerView.h(f1Var);
        f1Var.n(false);
        h hVar = (h) recyclerView.f1876o0;
        hVar.getClass();
        int i10 = w0Var.f1663a;
        int i11 = w0Var.f1664b;
        View view = f1Var.f2275a;
        int left = w0Var2 == null ? view.getLeft() : w0Var2.f1663a;
        int top = w0Var2 == null ? view.getTop() : w0Var2.f1664b;
        if (f1Var.h() || (i10 == left && i11 == top)) {
            hVar.l(f1Var);
            hVar.f2299h.add(f1Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = hVar.g(f1Var, i10, i11, left, top);
        }
        if (zG) {
            recyclerView.W();
        }
    }

    public void c(int i10) {
        RecyclerView recyclerView = this.f2262a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            f1 f1VarM = RecyclerView.M(childAt);
            g0 g0Var = recyclerView.M;
            if (g0Var != null && f1VarM != null) {
                g0Var.onViewDetachedFromWindow(f1VarM);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
