package z4;

import android.view.View;
import android.view.WindowInsets;

public final class c0 implements View.OnApplyWindowInsetsListener {

    public final View f17178a;

    public final r f17179b;

    public c0(View view, r rVar) {
        this.f17178a = view;
        this.f17179b = rVar;
    }

    @Override
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.f17179b.B(view, j1.g(view, windowInsets)).f();
    }
}
