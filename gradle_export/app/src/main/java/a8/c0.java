package a8;

import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;

public final class c0 {

    public final e0 f236a;

    public final e0 f237b;

    public c0(e0 e0Var, e0 e0Var2) {
        this.f236a = e0Var;
        this.f237b = e0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (this.f236a.equals(c0Var.f236a) && this.f237b.equals(c0Var.f237b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f237b.hashCode() + (this.f236a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        e0 e0Var = this.f236a;
        sb2.append(e0Var);
        e0 e0Var2 = this.f237b;
        if (e0Var.equals(e0Var2)) {
            str = RuntimeVersion.SUFFIX;
        } else {
            str = ", " + e0Var2;
        }
        return x5.n(sb2, str, "]");
    }
}
