package z4;

import android.view.WindowInsets;

public class b1 extends a1 {

    public q4.b f17175o;

    public q4.b f17176p;

    public q4.b f17177q;

    public b1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f17175o = null;
        this.f17176p = null;
        this.f17177q = null;
    }

    public b1(j1 j1Var, b1 b1Var) {
        super(j1Var, b1Var);
        this.f17175o = null;
        this.f17176p = null;
        this.f17177q = null;
    }

    @Override
    public q4.b k() {
        if (this.f17176p == null) {
            this.f17176p = q4.b.d(this.f17232c.getMandatorySystemGestureInsets());
        }
        return this.f17176p;
    }

    @Override
    public q4.b m() {
        if (this.f17175o == null) {
            this.f17175o = q4.b.d(this.f17232c.getSystemGestureInsets());
        }
        return this.f17175o;
    }

    @Override
    public q4.b o() {
        if (this.f17177q == null) {
            this.f17177q = q4.b.d(this.f17232c.getTappableElementInsets());
        }
        return this.f17177q;
    }

    @Override
    public j1 r(int i10, int i11, int i12, int i13) {
        return j1.g(null, this.f17232c.inset(i10, i11, i12, i13));
    }
}
