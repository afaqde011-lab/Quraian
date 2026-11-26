package ba;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class g1 extends z4.b {
    public final h1 D;
    public final WeakHashMap E = new WeakHashMap();

    public g1(h1 h1Var) {
        this.D = h1Var;
    }

    @Override
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.E.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.A.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final qj.c b(View view) {
        z4.b bVar = (z4.b) this.E.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        h1 h1Var = this.D;
        RecyclerView recyclerView = h1Var.D;
        RecyclerView recyclerView2 = h1Var.D;
        boolean zO = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.A;
        if (zO || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().W(view, gVar);
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            bVar.d(view, gVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.E.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.A.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean g(View view, int i10, Bundle bundle) {
        h1 h1Var = this.D;
        RecyclerView recyclerView = h1Var.D;
        RecyclerView recyclerView2 = h1Var.D;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i10, bundle);
        }
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            if (bVar.g(view, i10, bundle)) {
                return true;
            }
        } else if (super.g(view, i10, bundle)) {
            return true;
        }
        v0 v0Var = recyclerView2.getLayoutManager().f2378b.C;
        return false;
    }

    @Override
    public final void h(View view, int i10) {
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            bVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.E.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
