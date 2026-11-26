package d00;

import java.util.ArrayList;
import java.util.Iterator;
import ri.t1;

public abstract class q0 {
    public static final ArrayList a = new ArrayList();
    public static final int b = 794;
    public static final int c = 18;

    public static final void a(n0 n0Var, c1 effect) {
        Object next;
        Object objS;
        kotlin.jvm.internal.m.e(effect, "effect");
        ArrayList arrayList = a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c1) ((g00.k) next).A) != effect);
        g00.k kVar = (g00.k) next;
        n0 n0Var2 = kVar != null ? (n0) kVar.B : null;
        if (n0Var2 != null && n0Var2 != n0Var) {
            throw new IllegalStateException("VisualEffect instances are single-owner and cannot be shared across multiple hazeEffect nodes.");
        }
        if (n0Var2 == n0Var) {
            return;
        }
        arrayList.add(new g00.k(effect, n0Var));
        try {
            effect.c(n0Var.C1());
            objS = g00.b0.a;
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (g00.n.a(objS) != null) {
            h00.v.x0(new p0(effect, n0Var, 0), arrayList);
        }
        t1.O(objS);
    }

    public static final void b(n0 n0Var, c1 effect) {
        ArrayList arrayList = a;
        kotlin.jvm.internal.m.e(effect, "effect");
        try {
            effect.h(n0Var.C1());
        } finally {
            h00.v.x0(new p0(effect, n0Var, 1), arrayList);
        }
    }
}
