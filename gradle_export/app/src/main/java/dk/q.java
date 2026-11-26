package dk;

import a1.u0;
import java.lang.reflect.Method;

public final class q extends t {

    public final Method f4925b;

    public final int f4926c;

    public q(Method method, int i10) {
        this.f4925b = method;
        this.f4926c = i10;
    }

    @Override
    public final Object a(Class cls) {
        String strU = u0.u(cls);
        if (strU != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strU));
        }
        return this.f4925b.invoke(null, cls, Integer.valueOf(this.f4926c));
    }
}
