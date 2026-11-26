package d40;

import java.util.concurrent.atomic.AtomicReference;

public final class q1 extends e40.c {
    public final AtomicReference a = new AtomicReference(null);

    @Override
    public final boolean a(e40.a aVar) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(o.d);
        return true;
    }

    @Override
    public final k00.c[] b(e40.a aVar) {
        this.a.set(null);
        return e40.b.a;
    }
}
