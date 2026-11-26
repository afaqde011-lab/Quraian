package c40;

public final class o {
    public static final n b = new n();
    public final Object a;

    public static final Object a(Object obj) {
        if (obj instanceof n) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.a(this.a, ((o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
