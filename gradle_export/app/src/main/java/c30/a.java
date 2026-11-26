package c30;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.a0;
import ri.t1;

public class a implements k10.h {
    public static final a10.w[] B = {a0.a.h(new kotlin.jvm.internal.s(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    public final d30.i A;

    public a(d30.o storageManager, u00.a aVar) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.A = new d30.i((d30.l) storageManager, aVar);
    }

    @Override
    public final boolean d(n20.c cVar) {
        return t1.B(this, cVar);
    }

    @Override
    public final k10.b f(n20.c cVar) {
        return t1.y(this, cVar);
    }

    @Override
    public boolean isEmpty() {
        return ((List) ze.d.A(this.A, B[0])).isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return ((List) ze.d.A(this.A, B[0])).iterator();
    }
}
