package androidx.fragment.app;

import android.view.View;
import java.util.WeakHashMap;

public final class p1 implements View.OnAttachStateChangeListener {
    public final View A;

    public p1(View view) {
        this.A = view;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.A;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = z4.j0.f17198a;
        view2.requestApplyInsets();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
