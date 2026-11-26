package z4;

import android.view.View;
import android.view.WindowInsets;

public class c1 extends b1 {

    public static final j1 f17180r = j1.g(null, WindowInsets.CONSUMED);

    public c1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    public c1(j1 j1Var, c1 c1Var) {
        super(j1Var, c1Var);
    }

    @Override
    public final void d(View view) {
    }

    @Override
    public q4.b i(int i10) {
        return q4.b.d(this.f17232c.getInsets(h1.a(i10)));
    }

    @Override
    public q4.b j(int i10) {
        return q4.b.d(this.f17232c.getInsetsIgnoringVisibility(h1.a(i10)));
    }

    @Override
    public boolean u(int i10) {
        return this.f17232c.isVisible(h1.a(i10));
    }
}
