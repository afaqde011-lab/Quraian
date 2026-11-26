package fh;

import java.util.Map;

public final class k0 extends c50.h {
    public final c50.h A(Iterable iterable) {
        super.A(iterable);
        return this;
    }

    public final c50.h B(Map map) {
        A(((w0) map).entrySet());
        return this;
    }

    public final c2 e() {
        if (((c50.h) this).B == 0) {
            return c2.I;
        }
        return new c2(((c50.h) this).B, (Object[]) ((c50.h) this).C);
    }

    public final void L(androidx.media3.common.l2 l2Var, String str) {
        super.z(l2Var, str);
    }

    public final w0 d() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    public final c50.h z(Object obj, Object obj2) {
        super.z(obj, obj2);
        return this;
    }
}
