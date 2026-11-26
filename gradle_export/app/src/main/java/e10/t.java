package e10;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class t extends q implements f {
    public final boolean g;
    public final Object h;

    public t(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : h00.n.x0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.g = z;
        this.h = obj;
    }

    @Override
    public final Object call(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        db.g gVar = new db.g(2);
        gVar.a(this.h);
        gVar.f(args);
        ArrayList arrayList = gVar.B;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
