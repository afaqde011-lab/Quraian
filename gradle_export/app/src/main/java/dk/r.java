package dk;

import a1.u0;
import java.lang.reflect.Method;

public final class r extends t {

    public final Method f4927b;

    public r(Method method) {
        this.f4927b = method;
    }

    @Override
    public final Object a(Class cls) {
        String strU = u0.u(cls);
        if (strU != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strU));
        }
        return this.f4927b.invoke(null, cls, Object.class);
    }
}
