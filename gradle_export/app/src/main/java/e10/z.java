package e10;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

public abstract class z implements g {
    public final Method a;
    public final List b;
    public final Class c;

    public z(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
        this.c = returnType;
    }

    @Override
    public final List a() {
        return this.b;
    }

    @Override
    public final Member b() {
        return null;
    }

    @Override
    public final boolean c() {
        return false;
    }

    public final void d(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        if (k00.f.A(this) == args.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(k00.f.A(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(g4.c.g(args.length, " were provided.", sb));
    }

    @Override
    public final Type getReturnType() {
        return this.c;
    }
}
