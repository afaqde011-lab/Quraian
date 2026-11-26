package g00;

import java.io.Serializable;

public final class m implements Serializable {
    public final Throwable A;

    public m(Throwable exception) {
        kotlin.jvm.internal.m.e(exception, "exception");
        this.A = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.m.a(this.A, ((m) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.A + ')';
    }
}
