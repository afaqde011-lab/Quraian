package ek;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

public final class j extends bk.a0 {

    public static final i f5431d = new i();

    public final HashMap f5432a = new HashMap();

    public final HashMap f5433b = new HashMap();

    public final HashMap f5434c = new HashMap();

    public j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                ck.b bVar = (ck.b) field2.getAnnotation(ck.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f5432a.put(str, r4);
                    }
                }
                this.f5432a.put(strName, r4);
                this.f5433b.put(string, r4);
                this.f5434c.put(r4, strName);
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (aVar.t0() == 9) {
            aVar.p0();
            return null;
        }
        String strR0 = aVar.r0();
        Enum r4 = (Enum) this.f5432a.get(strR0);
        return r4 == null ? (Enum) this.f5433b.get(strR0) : r4;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        Enum r4 = (Enum) obj;
        bVar.o0(r4 == null ? null : (String) this.f5434c.get(r4));
    }
}
