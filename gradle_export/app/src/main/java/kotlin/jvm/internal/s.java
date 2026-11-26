package kotlin.jvm.internal;

public class s extends u implements a10.t {
    public s(Class cls, String str, String str2, int i) {
        super(c.NO_RECEIVER, cls, str, str2, i);
    }

    @Override
    public final a10.s b() {
        return ((a10.t) getReflected()).b();
    }

    @Override
    public final a10.c computeReflected() {
        return a0.a.h(this);
    }

    public Object get(Object obj) {
        return ((d10.j) b()).call(obj);
    }

    @Override
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
