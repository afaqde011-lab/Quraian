package kotlin.jvm.internal;

import kotlin.reflect.full.IllegalCallableAccessException;

public class p extends q implements a10.l {
    public p(Class cls, String str, String str2, int i) {
        super(c.NO_RECEIVER, cls, str, str2, i);
    }

    @Override
    public final a10.s b() {
        return ((a10.l) getReflected()).b();
    }

    @Override
    public final a10.k c() {
        return ((a10.l) getReflected()).c();
    }

    @Override
    public final a10.c computeReflected() {
        return a0.a.f(this);
    }

    @Override
    public Object get(Object obj) {
        return ((d10.j) b()).call(obj);
    }

    @Override
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override
    public void p(Object obj, Object obj2) throws IllegalCallableAccessException {
        ((d10.j) c()).call(obj, obj2);
    }
}
