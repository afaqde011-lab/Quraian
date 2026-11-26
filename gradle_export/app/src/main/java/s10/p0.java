package s10;

import com.google.android.gms.internal.measurement.z3;

public final class p0 extends z3 {
    public final String d;

    public p0(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.d = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && kotlin.jvm.internal.m.a(this.d, ((p0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("TypeAlias(name="), this.d, ')');
    }
}
