package z4;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

public final class b0 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap A = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
