package l4;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class e implements ViewTreeObserver.OnPreDrawListener {
    public final CoordinatorLayout A;

    public e(CoordinatorLayout coordinatorLayout) {
        this.A = coordinatorLayout;
    }

    @Override
    public final boolean onPreDraw() {
        this.A.p(0);
        return true;
    }
}
