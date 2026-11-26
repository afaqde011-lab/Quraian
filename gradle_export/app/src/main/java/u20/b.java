package u20;

import kotlin.jvm.internal.m;
import u00.k;

public final class b implements k {
    public static final b B = new b(0);
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                j10.k it = (j10.k) obj;
                int i = d.a;
                m.e(it, "it");
                return it.l();
            default:
                j10.c cVar = (j10.c) obj;
                m.b(cVar);
                return d.l(cVar);
        }
    }
}
