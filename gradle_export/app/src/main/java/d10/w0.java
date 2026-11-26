package d10;

import java.lang.reflect.Field;

public final class w0 extends qd.s0 {
    public final Field b;

    public w0(Field field) {
        kotlin.jvm.internal.m.e(field, "field");
        this.b = field;
    }

    public final String W() {
        StringBuilder sb = new StringBuilder();
        Field field = this.b;
        String name = field.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        sb.append(x10.u.a(name));
        sb.append("()");
        Class<?> type = field.getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        sb.append(p10.d.b(type));
        return sb.toString();
    }
}
