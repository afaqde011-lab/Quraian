package o9;

import java.util.List;
import java.util.Objects;

public final class v0 {

    public final List f11881a;

    public final boolean f11882b;

    public v0(b20.z zVar) {
        this.f11881a = zVar.b;
        this.f11882b = zVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f11881a.equals(v0Var.f11881a) && this.f11882b == v0Var.f11882b;
    }

    public final int hashCode() {
        return Objects.hash(this.f11881a, Boolean.valueOf(this.f11882b), null);
    }
}
