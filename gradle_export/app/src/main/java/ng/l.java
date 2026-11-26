package ng;

import android.view.View;

public final class l implements View.OnAttachStateChangeListener {
    @Override
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.requestApplyInsets();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
