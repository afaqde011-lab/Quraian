package ba;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class h1 extends z4.b {
    public final RecyclerView D;
    public final g1 E;

    public h1(RecyclerView recyclerView) {
        this.D = recyclerView;
        g1 g1Var = this.E;
        if (g1Var != null) {
            this.E = g1Var;
        } else {
            this.E = new g1(this);
        }
    }

    @Override
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.D.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override
    public final void d(View view, a5.g gVar) {
        this.A.onInitializeAccessibilityNodeInfo(view, gVar.f187a);
        RecyclerView recyclerView = this.D;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        p0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2378b;
        layoutManager.V(recyclerView2.C, recyclerView2.G0, gVar);
    }

    @Override
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.D;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i10, bundle);
    }
}
