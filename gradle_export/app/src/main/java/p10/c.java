package p10;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public final class c implements u00.k {
    public static final c B = new c(0);
    public static final c C = new c(1);
    public static final c D = new c(2);
    public static final c E = new c(3);
    public final int A;

    public c(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                List list = d.a;
                kotlin.jvm.internal.m.e(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                List list2 = d.a;
                kotlin.jvm.internal.m.e(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                return h00.n.l0(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!n20.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return n20.e.e(simpleName);
                }
                return null;
        }
    }
}
