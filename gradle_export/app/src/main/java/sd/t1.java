package sd;

import android.graphics.Canvas;
import android.graphics.Path;

public final class t1 extends u1 {

    public final Path f14088e;

    public final y1 f14089f;

    public t1(y1 y1Var, Path path, float f3) {
        super(y1Var, f3, 0.0f);
        this.f14089f = y1Var;
        this.f14088e = path;
    }

    @Override
    public final void l0(String str) {
        y1 y1Var = this.f14089f;
        if (y1Var.g0()) {
            w1 w1Var = (w1) y1Var.f14134c;
            if (w1Var.f14109b) {
                ((Canvas) y1Var.f14132a).drawTextOnPath(str, this.f14088e, this.f14090b, this.f14091c, w1Var.f14111d);
            }
            w1 w1Var2 = (w1) y1Var.f14134c;
            if (w1Var2.f14110c) {
                ((Canvas) y1Var.f14132a).drawTextOnPath(str, this.f14088e, this.f14090b, this.f14091c, w1Var2.f14112e);
            }
        }
        this.f14090b = ((w1) y1Var.f14134c).f14111d.measureText(str) + this.f14090b;
    }
}
