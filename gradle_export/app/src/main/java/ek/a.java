package ek;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class a implements bk.b0 {
    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        boolean z10 = type instanceof GenericArrayType;
        if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new b(mVar, mVar.f(TypeToken.get(genericComponentType)), dk.h.h(genericComponentType));
    }
}
