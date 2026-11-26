package z4;

import android.view.View;
import android.view.ViewTreeObserver;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View A;
    public ViewTreeObserver B;
    public final Runnable C;

    public s(View view, Runnable runnable) {
        this.A = view;
        this.B = view.getViewTreeObserver();
        this.C = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        s sVar = new s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sVar);
        view.addOnAttachStateChangeListener(sVar);
    }

    @Override
    public final boolean onPreDraw() {
        boolean zIsAlive = this.B.isAlive();
        View view = this.A;
        if (zIsAlive) {
            this.B.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.C.run();
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.B = view.getViewTreeObserver();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.B.isAlive();
        View view2 = this.A;
        if (zIsAlive) {
            this.B.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
