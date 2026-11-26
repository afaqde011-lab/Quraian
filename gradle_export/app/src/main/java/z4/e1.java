package z4;

import android.view.View;
import android.view.WindowInsets;

public class e1 extends d1 {

    public static final j1 f17189s = j1.g(null, WindowInsets.CONSUMED);

    public e1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    public e1(j1 j1Var, e1 e1Var) {
        super(j1Var, e1Var);
    }

    @Override
    public q4.b i(int i10) {
        return q4.b.d(this.f17232c.getInsets(i1.a(i10)));
    }

    @Override
    public q4.b j(int i10) {
        return q4.b.d(this.f17232c.getInsetsIgnoringVisibility(i1.a(i10)));
    }

    @Override
    public void p(View view) {
    }

    @Override
    public boolean u(int i10) {
        return this.f17232c.isVisible(i1.a(i10));
    }
}
