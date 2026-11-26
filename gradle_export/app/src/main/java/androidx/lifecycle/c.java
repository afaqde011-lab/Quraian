package androidx.lifecycle;

import java.lang.reflect.Method;

public final class c {

    public final int f980a;

    public final Method f981b;

    public c(Method method, int i10) {
        this.f980a = i10;
        this.f981b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f980a == cVar.f980a && this.f981b.getName().equals(cVar.f981b.getName());
    }

    public final int hashCode() {
        return this.f981b.getName().hashCode() + (this.f980a * 31);
    }
}
