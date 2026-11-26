package c6;

import java.util.LinkedHashMap;

public final class f {

    public final LinkedHashMap f2891a;

    public f(LinkedHashMap linkedHashMap) {
        this.f2891a = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f2891a.equals(((f) obj).f2891a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2891a.hashCode();
    }

    public final String toString() {
        return this.f2891a.toString();
    }
}
