package bi;

import a40.c0;
import ii.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import sd.y1;

public final class h implements ii.e {
    public static final h B = new h(0);
    public static final h C = new h(1);
    public static final h D = new h(2);
    public static final h E = new h(3);
    public final int A;

    public h(int i10) {
        this.A = i10;
    }

    @Override
    public final Object m(y1 y1Var) {
        switch (this.A) {
            case 0:
                Object objG = y1Var.g(new p(hi.a.class, Executor.class));
                m.d(objG, "get(...)");
                return c0.o((Executor) objG);
            case 1:
                Object objG2 = y1Var.g(new p(hi.c.class, Executor.class));
                m.d(objG2, "get(...)");
                return c0.o((Executor) objG2);
            case 2:
                Object objG3 = y1Var.g(new p(hi.b.class, Executor.class));
                m.d(objG3, "get(...)");
                return c0.o((Executor) objG3);
            default:
                Object objG4 = y1Var.g(new p(hi.d.class, Executor.class));
                m.d(objG4, "get(...)");
                return c0.o((Executor) objG4);
        }
    }
}
