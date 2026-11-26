package e10;

import java.lang.reflect.Method;

public final class v extends q {
    public final int g;

    public v(int i, int i2, Method method, boolean z) {
        super(method, z, i);
        this.g = i2;
    }

    public v(Method method) {
        super(method, false, 6);
        this.g = 0;
        kotlin.jvm.internal.m.e(method, "method");
    }

    @Override
    public final Object call(Object[] args) {
        switch (this.g) {
            case 0:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                return f(args[0], args.length <= 1 ? new Object[0] : h00.n.x0(args, 1, args.length));
            case 1:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                e(h00.n.E0(args));
                return f(null, args.length <= 1 ? new Object[0] : h00.n.x0(args, 1, args.length));
            default:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                return f(null, args);
        }
    }
}
