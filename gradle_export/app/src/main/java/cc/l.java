package cc;

import java.util.Arrays;

public final class l {

    public final Object f3135a;

    public final Throwable f3136b;

    public l(Object obj) {
        this.f3135a = obj;
        this.f3136b = null;
    }

    public l(Throwable th2) {
        this.f3136b = th2;
        this.f3135a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        Object obj2 = this.f3135a;
        if (obj2 != null && obj2.equals(lVar.f3135a)) {
            return true;
        }
        Throwable th2 = this.f3136b;
        if (th2 == null || lVar.f3136b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3135a, this.f3136b});
    }
}
