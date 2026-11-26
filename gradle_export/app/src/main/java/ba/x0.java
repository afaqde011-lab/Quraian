package ba;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class x0 extends i0 {

    public final RecyclerView f2460a;

    public x0(RecyclerView recyclerView) {
        this.f2460a = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f2460a;
        if (!recyclerView.T || !recyclerView.S) {
            recyclerView.f1865d0 = true;
            recyclerView.requestLayout();
        } else {
            b0 b0Var = recyclerView.I;
            WeakHashMap weakHashMap = z4.j0.f17198a;
            recyclerView.postOnAnimation(b0Var);
        }
    }
}
