package s10;

import com.google.android.gms.internal.measurement.z3;

public final class o0 extends z3 {
    public final String d;

    public o0(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.d = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && kotlin.jvm.internal.m.a(this.d, ((o0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("Class(name="), this.d, ')');
    }
}
