package w;

import android.view.ViewConfiguration;

public abstract class e2 {

    public static final float f15756a = ViewConfiguration.getScrollFriction();

    public static final x.t a(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        y3.c cVar = (y3.c) g0Var.k(c3.o1.f2734h);
        boolean zD = g0Var.d(cVar.c());
        Object objN = g0Var.N();
        if (zD || objN == l1.i.f9868a) {
            objN = new x.t(new o10.b(cVar));
            g0Var.n0(objN);
        }
        return (x.t) objN;
    }
}
