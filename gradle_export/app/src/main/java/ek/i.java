package ek;

import com.google.gson.reflect.TypeToken;

public class i implements bk.b0 {
    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new j(rawType);
    }
}
