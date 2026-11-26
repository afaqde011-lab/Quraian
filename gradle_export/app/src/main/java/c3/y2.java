package c3;

import java.util.ArrayList;
import java.util.Iterator;

public final class y2 implements q30.j {

    public final int f2776a;

    public final Object f2777b;

    public y2() {
        this.f2776a = 0;
        this.f2777b = new ArrayList();
    }

    public y2(Object obj, int i10) {
        this.f2776a = i10;
        this.f2777b = obj;
    }

    public y2(u00.n nVar) {
        this.f2776a = 3;
        this.f2777b = (m00.h) nVar;
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f2777b).add(new x2(str, obj));
    }

    public final Iterator iterator() {
        switch (this.f2776a) {
            case 0:
                return ((ArrayList) this.f2777b).iterator();
            case 1:
                return kotlin.jvm.internal.m.i((Object[]) this.f2777b);
            case 2:
                return ((Iterable) this.f2777b).iterator();
            case 3:
                return ri.t1.F((m00.h) this.f2777b);
            case 4:
                return (Iterator) this.f2777b;
            case 5:
                return new n30.h(this.f2777b, 1);
            case 6:
                return new q30.h(this);
            case 7:
                return new r00.j(this);
            default:
                return new r30.e((CharSequence) this.f2777b);
        }
    }
}
