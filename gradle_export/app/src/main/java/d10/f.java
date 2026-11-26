package d10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public final class f implements u00.a {
    public final int A;
    public final int B;
    public final Object C;

    public f(Object obj, int i, int i2) {
        this.A = i2;
        this.C = obj;
        this.B = i;
    }

    @Override
    public final Object invoke() {
        Type type;
        switch (this.A) {
            case 0:
                p30.a aVar = (p30.a) ((u00.a) this.C).invoke();
                g00.h hVarI = rd.a.I(g00.i.B, new a30.l(aVar, 16));
                x1 x1Var = aVar.A;
                Type type2 = x1Var != null ? (Type) x1Var.invoke() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.m.b(componentType);
                    return componentType;
                }
                boolean z = type2 instanceof GenericArrayType;
                int i = this.B;
                if (z) {
                    if (i == 0) {
                        Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                        kotlin.jvm.internal.m.b(genericComponentType);
                        return genericComponentType;
                    }
                    throw new a40.b0("Array type has been queried for a non-0th argument: " + aVar);
                }
                if (!(type2 instanceof ParameterizedType)) {
                    throw new a40.b0("Non-generic type has been queried for arguments: " + aVar);
                }
                Type type3 = (Type) ((List) hVarI.getValue()).get(i);
                if (!(type3 instanceof WildcardType)) {
                    return type3;
                }
                WildcardType wildcardType = (WildcardType) type3;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                kotlin.jvm.internal.m.d(lowerBounds, "getLowerBounds(...)");
                Type type4 = (Type) h00.n.E0(lowerBounds);
                if (type4 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
                    type = (Type) h00.n.D0(upperBounds);
                } else {
                    type = type4;
                }
                kotlin.jvm.internal.m.b(type);
                return type;
            case 1:
                Object obj = ((j10.c) this.C).O().get(this.B);
                kotlin.jvm.internal.m.d(obj, "get(...)");
                return (j10.j0) obj;
            default:
                return (j10.j0) this.C.get(this.B);
        }
    }
}
