package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import z2.b1;

public final class a extends n implements u00.a {
    public final int A;
    public final List B;

    public a(int i10, List list) {
        super(0);
        this.A = i10;
        this.B = list;
    }

    public final Object invoke() {
        Object next;
        switch (this.A) {
            case 0:
                Iterator it = this.B.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((b1) next).f17089b.A()) {
                        return (b1) next;
                    }
                }
                next = null;
                return (b1) next;
            default:
                return this.B;
        }
    }
}
