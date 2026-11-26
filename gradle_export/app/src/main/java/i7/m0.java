package i7;

import java.util.Objects;

public final class m0 {

    public final long f7421a;

    public final float f7422b;

    public final long f7423c;

    public m0(l0 l0Var) {
        this.f7421a = l0Var.f7412a;
        this.f7422b = l0Var.f7413b;
        this.f7423c = l0Var.f7414c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f7421a == m0Var.f7421a && this.f7422b == m0Var.f7422b && this.f7423c == m0Var.f7423c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f7421a), Float.valueOf(this.f7422b), Long.valueOf(this.f7423c));
    }
}
