package d10;

import java.lang.reflect.Method;
import java.util.List;

public final class r0 extends p30.f {
    public final List b;

    public r0(Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        Method[] declaredMethods = jClass.getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        this.b = h00.n.S0(declaredMethods, new i(1));
    }

    @Override
    public final String X() {
        return h00.q.R0(this.b, "", "<init>(", ")V", b.N, 24);
    }
}
