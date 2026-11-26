package e10;

import java.lang.reflect.Method;

public final class r extends q implements f {
    public final Object g;

    public r(Method method, Object obj) {
        super(method, false, 4);
        kotlin.jvm.internal.m.e(method, "method");
        this.g = obj;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return f(this.g, args);
    }
}
