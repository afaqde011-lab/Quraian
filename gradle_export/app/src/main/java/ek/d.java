package ek;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class d implements bk.b0 {
    public final int A;
    public final a1.u0 B;

    public d(a1.u0 u0Var, int i10) {
        this.A = i10;
        this.B = u0Var;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        int i10 = this.A;
        a1.u0 u0Var = this.B;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                dk.h.b(Collection.class.isAssignableFrom(rawType));
                Type typeJ = dk.h.j(type2, rawType, dk.h.g(type2, rawType, Collection.class), new HashMap());
                type = typeJ instanceof ParameterizedType ? ((ParameterizedType) typeJ).getActualTypeArguments()[0] : Object.class;
                return new c(new n(mVar, mVar.f(TypeToken.get(type)), type), u0Var.C(typeToken, false));
            default:
                Type type3 = typeToken.getType();
                Class rawType2 = typeToken.getRawType();
                if (!Map.class.isAssignableFrom(rawType2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(rawType2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    dk.h.b(Map.class.isAssignableFrom(rawType2));
                    Type typeJ2 = dk.h.j(type3, rawType2, dk.h.g(type3, rawType2, Map.class), new HashMap());
                    actualTypeArguments = typeJ2 instanceof ParameterizedType ? ((ParameterizedType) typeJ2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                return new n(this, new n(mVar, (type4 == Boolean.TYPE || type4 == Boolean.class) ? d1.f5405c : mVar.f(TypeToken.get(type4)), type4), new n(mVar, mVar.f(TypeToken.get(type5)), type5), u0Var.C(typeToken, false));
        }
    }
}
