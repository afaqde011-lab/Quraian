package e10;

import java.lang.reflect.Field;

public final class j extends m implements f {
    public final Object e;

    public j(Field field, Object obj) {
        super(field, false);
        kotlin.jvm.internal.m.e(field, "field");
        this.e = obj;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return ((Field) this.a).get(this.e);
    }
}
