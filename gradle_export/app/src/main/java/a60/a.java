package a60;

import a10.d;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import org.koin.core.error.NoParameterFoundException;

public class a {
    public final List a;
    public int b;

    public a(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object a(int i, d clazz) throws NoParameterFoundException {
        m.e(clazz, "clazz");
        List list = this.a;
        if (i < list.size()) {
            return list.get(i);
        }
        String msg = "Can't get injected parameter #" + i + " from " + this + " for type '" + g60.a.a(clazz) + '\'';
        m.e(msg, "msg");
        throw new NoParameterFoundException(msg);
    }

    public Object b(d clazz) {
        m.e(clazz, "clazz");
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        int i = this.b;
        List list2 = this.a;
        Object obj = list2.get(i);
        if (!clazz.u(obj)) {
            obj = null;
        }
        Object obj2 = obj != null ? obj : null;
        if (obj2 != null && this.b < va.a.M(list2)) {
            this.b++;
        }
        if (obj2 != null) {
            return obj2;
        }
        for (Object obj3 : list) {
            if (clazz.u(obj3)) {
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            }
        }
        obj3 = null;
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.a, ((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + q.n1(this.a);
    }
}
