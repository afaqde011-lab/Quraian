package d10;

import kotlin.reflect.full.IllegalCallableAccessException;

public final class m extends c0 implements a10.i {
    public final n K;

    public m(n nVar) {
        this.K = nVar;
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
    public final Object invoke(Object obj) throws IllegalCallableAccessException {
        ((m) this.K.P.getValue()).call(obj);
        return g00.b0.a;
    }
}
