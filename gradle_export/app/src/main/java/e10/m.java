package e10;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public abstract class m extends w {
    public m(Field field, boolean z) {
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.m.d(genericType, "getGenericType(...)");
        super(field, genericType, z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override
    public Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return ((Field) this.a).get(this.c != null ? h00.n.D0(args) : null);
    }
}
