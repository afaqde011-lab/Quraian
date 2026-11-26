package z4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

public class a1 extends z0 {
    public a1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    public a1(j1 j1Var, a1 a1Var) {
        super(j1Var, a1Var);
    }

    @Override
    public j1 a() {
        return j1.g(null, this.f17232c.consumeDisplayCutout());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Objects.equals(this.f17232c, a1Var.f17232c) && Objects.equals(this.f17236g, a1Var.f17236g) && y0.K(this.f17237h, a1Var.f17237h);
    }

    @Override
    public f h() {
        DisplayCutout displayCutout = this.f17232c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new f(displayCutout);
    }

    @Override
    public int hashCode() {
        return this.f17232c.hashCode();
    }
}
