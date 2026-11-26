package mb;

import java.util.List;
import z2.w0;
import z2.x0;
import z2.y0;

public final class c implements w0 {

    public static final c f10800b = new c(0);

    public static final c f10801c = new c(1);

    public final int f10802a;

    public c(int i10) {
        this.f10802a = i10;
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        switch (this.f10802a) {
            case 0:
                return y0Var.o0(y3.a.j(j9), y3.a.i(j9), h00.y.A, b.B);
            default:
                return y0Var.o0(y3.a.j(j9), y3.a.i(j9), h00.y.A, b.D);
        }
    }
}
