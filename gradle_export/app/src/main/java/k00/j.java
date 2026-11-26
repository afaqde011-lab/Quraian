package k00;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import u00.n;

public final class j implements i, Serializable {
    public static final j A = new j();

    @Override
    public final Object fold(Object obj, n nVar) {
        return obj;
    }

    @Override
    public final g get(h key) {
        m.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final i minusKey(h key) {
        m.e(key, "key");
        return this;
    }

    @Override
    public final i plus(i context) {
        m.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
