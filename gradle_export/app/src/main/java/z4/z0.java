package z4;

import android.view.WindowInsets;

public class z0 extends y0 {

    public q4.b f17246n;

    public z0(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f17246n = null;
    }

    public z0(j1 j1Var, z0 z0Var) {
        super(j1Var, z0Var);
        this.f17246n = null;
        this.f17246n = z0Var.f17246n;
    }

    @Override
    public j1 b() {
        return j1.g(null, this.f17232c.consumeStableInsets());
    }

    @Override
    public j1 c() {
        return j1.g(null, this.f17232c.consumeSystemWindowInsets());
    }

    @Override
    public final q4.b l() {
        if (this.f17246n == null) {
            WindowInsets windowInsets = this.f17232c;
            this.f17246n = q4.b.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f17246n;
    }

    @Override
    public boolean s() {
        return this.f17232c.isConsumed();
    }
}
