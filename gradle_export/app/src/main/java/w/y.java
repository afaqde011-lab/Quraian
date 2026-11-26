package w;

import java.util.Collection;
import java.util.Iterator;

public final class y extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;

    public y(Object obj, int i10) {
        super(0);
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                x.n1 n1Var = (x.n1) this.B;
                Object objJ0 = n1Var.f16323a.J0();
                l0 l0Var = l0.C;
                return Boolean.valueOf(objJ0 == l0Var && n1Var.f16326d.getValue() == l0Var);
            default:
                Collection collectionValues = ((u1) this.B).H.h().f17051c.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext() && !((j1) it.next()).d()) {
                    }
                }
                return g00.b0.a;
        }
    }
}
