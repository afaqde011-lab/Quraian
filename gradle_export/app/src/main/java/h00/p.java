package h00;

import java.util.Iterator;

public final class p implements Iterable, v00.a {
    public final int A;
    public final Object B;

    public p(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return kotlin.jvm.internal.m.i((Object[]) this.B);
            case 1:
                return new b0((Iterator) ((u00.a) this.B).invoke());
            case 2:
                return new g00.s((p40.u) this.B);
            default:
                return ((q30.j) this.B).iterator();
        }
    }
}
