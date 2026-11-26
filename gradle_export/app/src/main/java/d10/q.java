package d10;

import kotlin.reflect.full.IllegalCallableAccessException;

public final class q extends c0 implements u00.o {
    public final r K;

    public q(r rVar) {
        this.K = rVar;
    }

    @Override
    public final m0 A() {
        return this.K;
    }

    @Override
    public final a10.w g() {
        return this.K;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
        ((q) this.K.P.getValue()).call(obj, obj2, obj3);
        return g00.b0.a;
    }
}
