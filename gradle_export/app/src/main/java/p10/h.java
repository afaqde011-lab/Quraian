package p10;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class h extends f implements e20.a {
    public final Object[] b;

    public h(n20.e eVar, Object[] objArr) {
        super(eVar);
        this.b = objArr;
    }

    public final ArrayList a() {
        e20.a pVar;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.m.b(obj);
            Class<?> cls = obj.getClass();
            List list = d.a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                pVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                pVar = new h(null, (Object[]) obj);
            } else {
                pVar = obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }
}
