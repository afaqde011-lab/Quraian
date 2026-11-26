package p10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class q extends b0 implements e20.d {
    public final Type a;
    public final s b;

    public q(Type reflectType) {
        s oVar;
        kotlin.jvm.internal.m.e(reflectType, "reflectType");
        this.a = reflectType;
        if (reflectType instanceof Class) {
            oVar = new o((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            oVar = new c0((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.m.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.b = oVar;
    }

    @Override
    public final e a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    @Override
    public final Type b() {
        return this.a;
    }

    public final ArrayList c() {
        e20.b iVar;
        e20.b zVar;
        List<Type> listC = d.c(this.a);
        ArrayList arrayList = new ArrayList(h00.r.q0(listC, 10));
        for (Type type : listC) {
            kotlin.jvm.internal.m.e(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    zVar = new z(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        iVar = new i(type);
                    } else {
                        iVar = type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    iVar = new i(type);
                } else {
                    iVar = new i(type);
                }
                zVar = iVar;
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        return h00.x.A;
    }
}
