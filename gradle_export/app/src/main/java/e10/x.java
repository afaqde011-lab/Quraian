package e10;

import java.lang.reflect.Method;
import java.util.Arrays;

public final class x extends z implements f {
    public final Object d;

    public x(Method method, Object obj) {
        super(method, h00.x.A);
        this.d = obj;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return this.a.invoke(this.d, Arrays.copyOf(args, args.length));
    }
}
