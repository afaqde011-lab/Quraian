package rc;

import java.util.HashSet;

public final class b0 {

    public HashSet f13150a;

    public final boolean a(String str) {
        return !this.f13150a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.m.a(((b0) obj).f13150a, this.f13150a);
        }
        return false;
    }
}
