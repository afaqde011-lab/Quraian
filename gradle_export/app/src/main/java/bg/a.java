package bg;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import z4.j0;

public abstract class a extends l4.a {

    public b f2499a;

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i10) {
        v(coordinatorLayout, view, i10);
        if (this.f2499a == null) {
            this.f2499a = new b(view);
        }
        b bVar = this.f2499a;
        View view2 = (View) bVar.C;
        bVar.A = view2.getTop();
        bVar.B = view2.getLeft();
        b bVar2 = this.f2499a;
        View view3 = (View) bVar2.C;
        int top = 0 - (view3.getTop() - bVar2.A);
        WeakHashMap weakHashMap = j0.f17198a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.B));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.q(view, i10);
    }
}
