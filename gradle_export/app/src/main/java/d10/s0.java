package d10;

import java.lang.reflect.Constructor;

public final class s0 extends p30.f {
    public final Constructor b;

    public s0(Constructor constructor) {
        kotlin.jvm.internal.m.e(constructor, "constructor");
        this.b = constructor;
    }

    @Override
    public final String X() {
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
        return h00.n.M0(parameterTypes, "", "<init>(", ")V", b.O, 24);
    }
}
