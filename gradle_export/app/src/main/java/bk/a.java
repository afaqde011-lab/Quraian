package bk;

import java.lang.reflect.Field;

public final enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override
    public final String b(Field field) {
        return field.getName();
    }
}
