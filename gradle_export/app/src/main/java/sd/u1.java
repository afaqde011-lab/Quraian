package sd;

import android.graphics.Canvas;

public class u1 extends p30.f {

    public float f14090b;

    public float f14091c;

    public final y1 f14092d;

    public u1(y1 y1Var, float f3, float f10) {
        this.f14092d = y1Var;
        this.f14090b = f3;
        this.f14091c = f10;
    }

    public void l0(String str) {
        y1 y1Var = this.f14092d;
        if (y1Var.g0()) {
            w1 w1Var = (w1) y1Var.f14134c;
            if (w1Var.f14109b) {
                ((Canvas) y1Var.f14132a).drawText(str, this.f14090b, this.f14091c, w1Var.f14111d);
            }
            w1 w1Var2 = (w1) y1Var.f14134c;
            if (w1Var2.f14110c) {
                ((Canvas) y1Var.f14132a).drawText(str, this.f14090b, this.f14091c, w1Var2.f14112e);
            }
        }
        this.f14090b = ((w1) y1Var.f14134c).f14111d.measureText(str) + this.f14090b;
    }
}
