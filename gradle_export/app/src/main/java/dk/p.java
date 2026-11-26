package dk;

import a1.u0;
import java.lang.reflect.Method;

public final class p extends t {

    public final Method f4923b;

    public final Object f4924c;

    public p(Method method, Object obj) {
        this.f4923b = method;
        this.f4924c = obj;
    }

    @Override
    public final Object a(Class cls) {
        String strU = u0.u(cls);
        if (strU != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strU));
        }
        return this.f4923b.invoke(this.f4924c, cls);
    }
}
