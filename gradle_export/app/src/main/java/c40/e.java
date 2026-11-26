package c40;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class e extends kotlin.jvm.internal.j implements u00.o {
    public static final e A = new e(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.B;
        hVar.getClass();
        if (obj3 == j.l) {
            obj3 = new m(hVar.r());
        }
        return new o(obj3);
    }
}
