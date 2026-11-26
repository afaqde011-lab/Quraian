package kotlin.jvm.internal;

public final class t extends u implements a10.v {
    public t(Class cls, String str, String str2) {
        super(c.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override
    public final a10.u b() {
        return ((a10.v) getReflected()).b();
    }

    @Override
    public final a10.c computeReflected() {
        return a0.a.i(this);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((d10.j) b()).call(obj, obj2);
    }
}
