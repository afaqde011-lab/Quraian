package z4;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

public final class f1 extends e1 {
    public f1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
    }

    public f1(j1 j1Var, f1 f1Var) {
        super(j1Var, f1Var);
    }

    @Override
    public List<Rect> f(int i10) {
        return this.f17232c.getBoundingRects(i1.a(i10));
    }

    @Override
    public List<Rect> g(int i10) {
        return this.f17232c.getBoundingRectsIgnoringVisibility(i1.a(i10));
    }

    @Override
    public void q() {
    }
}
