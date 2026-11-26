package gl;

import i2.t;
import l1.g0;
import l1.j;
import u00.n;

public final class c implements n {
    public static final c B = new c(0);
    public static final c C = new c(1);
    public final int A;

    public c(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                g0 g0Var = (j) obj;
                g0Var.c0(1916385683);
                long j = dl.a.i;
                g0Var.r(false);
                return new t(j);
            default:
                ((Number) obj2).intValue();
                g0 g0Var2 = (j) obj;
                g0Var2.c0(-1163696927);
                long j2 = dl.a.L;
                g0Var2.r(false);
                return new t(j2);
        }
    }
}
