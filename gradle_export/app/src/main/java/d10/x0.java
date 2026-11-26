package d10;

import java.lang.reflect.Method;

public final class x0 extends qd.s0 {
    public final Method b;
    public final Method c;

    public x0(Method getterMethod, Method method) {
        kotlin.jvm.internal.m.e(getterMethod, "getterMethod");
        this.b = getterMethod;
        this.c = method;
    }

    public final String W() {
        return w00.a.g(this.b);
    }
}
