package g00;

import java.io.Serializable;

public final class n implements Serializable {
    public final Object A;

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).A;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.m.a(this.A, ((n) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.A;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.A;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
