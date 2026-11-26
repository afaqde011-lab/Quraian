package e10;

import java.lang.reflect.Field;

public final class n extends q implements f {
    public final Object g;

    public n(Field field, boolean z, Object obj) {
        super(field, z, false);
        kotlin.jvm.internal.m.e(field, "field");
        this.g = obj;
    }

    @Override
    public final Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((Field) this.a).set(this.g, h00.n.D0(args));
        return g00.b0.a;
    }
}
