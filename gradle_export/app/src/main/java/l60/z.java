package l60;

import java.lang.reflect.Array;
import java.util.Iterator;

public final class z extends w0 {
    public final int d;
    public final w0 e;

    public z(w0 w0Var, int i) {
        this.d = i;
        this.e = w0Var;
    }

    @Override
    public final void a(m0 m0Var, Object obj) {
        switch (this.d) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.e.a(m0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.e.a(m0Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
