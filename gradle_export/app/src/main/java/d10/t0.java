package d10;

import java.lang.reflect.Method;

public final class t0 extends p30.f {
    public final Method b;

    public t0(Method method) {
        kotlin.jvm.internal.m.e(method, "method");
        this.b = method;
    }

    @Override
    public final String X() {
        return w00.a.g(this.b);
    }
}
