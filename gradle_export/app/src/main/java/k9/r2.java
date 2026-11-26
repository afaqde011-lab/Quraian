package k9;

import java.util.Objects;

public final class r2 implements z1 {
    public final l9.g0 A;

    public r2(l9.g0 g0Var) {
        this.A = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != r2.class) {
            return false;
        }
        return Objects.equals(this.A, ((r2) obj).A);
    }

    public final int hashCode() {
        return Objects.hash(this.A);
    }
}
