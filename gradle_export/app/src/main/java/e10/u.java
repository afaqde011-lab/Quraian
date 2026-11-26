package e10;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public final class u extends q implements f {
    public final Object[] g;

    public u(Method method, Object[] boundReceiverComponents) {
        Collection collectionV0;
        kotlin.jvm.internal.m.e(method, "method");
        kotlin.jvm.internal.m.e(boundReceiverComponents, "boundReceiverComponents");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        int length = boundReceiverComponents.length;
        kotlin.jvm.internal.m.e(genericParameterTypes, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", length, " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", length2, " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionV0 = h00.x.A;
        } else {
            int length3 = genericParameterTypes.length;
            collectionV0 = length2 >= length3 ? h00.n.V0(genericParameterTypes) : length2 == 1 ? va.a.R(genericParameterTypes[length3 - 1]) : h00.n.k0(h00.n.x0(genericParameterTypes, length3 - length2, length3));
        }
        super(method, false, (Type[]) collectionV0.toArray(new Type[0]));
        this.g = boundReceiverComponents;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        db.g gVar = new db.g(2);
        gVar.f(this.g);
        gVar.f(args);
        ArrayList arrayList = gVar.B;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
