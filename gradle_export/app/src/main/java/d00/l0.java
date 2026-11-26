package d00;

public final class l0 implements u00.k {
    public final int A = 0;
    public final w0 B;

    public l0(n0 n0Var, w0 w0Var) {
        this.B = w0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                c area = (c) obj;
                kotlin.jvm.internal.m.e(area, "area");
                return Boolean.valueOf(this.B == null || area.c.h() < 0.0f);
            default:
                ((Long) obj).getClass();
                z1.c0 it = this.B.O.e.iterator();
                while (true) {
                    z1.c0 c0Var = it;
                    if (!c0Var.hasNext()) {
                        return g00.b0.a;
                    }
                    n0 n0Var = ((i0) c0Var.next()).a;
                    if (!n0Var.R) {
                        n0Var.R = true;
                        b3.m.m(n0Var);
                    }
                }
                break;
        }
    }
}
