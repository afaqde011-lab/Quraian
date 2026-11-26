package e10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class h extends w implements f {
    public final int e;
    public final Object f;

    public h(Constructor constructor, Object obj, int i) {
        this.e = i;
        switch (i) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                kotlin.jvm.internal.m.d(declaringClass, "getDeclaringClass(...)");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                kotlin.jvm.internal.m.d(declaringClass2, "getDeclaringClass(...)");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.m.d(genericParameterTypes2, "getGenericParameterTypes(...)");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : h00.n.x0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f = obj;
                break;
        }
    }

    @Override
    public final Object call(Object[] args) {
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                Constructor constructor = (Constructor) this.a;
                db.g gVar = new db.g(3);
                gVar.a(this.f);
                gVar.f(args);
                gVar.a((Object) null);
                ArrayList arrayList = gVar.B;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.m.e(args, "args");
                d(args);
                Constructor constructor2 = (Constructor) this.a;
                db.g gVar2 = new db.g(2);
                gVar2.a(this.f);
                gVar2.f(args);
                ArrayList arrayList2 = gVar2.B;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
