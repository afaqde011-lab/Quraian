package p10;

import java.lang.reflect.Type;
import java.util.Iterator;

public abstract class b0 implements e20.d {
    @Override
    public e a(n20.c fqName) {
        Object next;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m.a(d.a(k00.f.D(k00.f.z(((e) next).a))).a(), fqName)) {
                return (e) next;
            }
        }
        next = null;
        return (e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && kotlin.jvm.internal.m.a(b(), ((b0) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
