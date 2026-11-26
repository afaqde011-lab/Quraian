package o9;

import android.text.TextUtils;
import java.util.Objects;

public final class u0 {

    public final String f11879a;

    public final int f11880b;

    public u0(a2.n nVar) {
        this.f11879a = nVar.f166a;
        this.f11880b = nVar.f167b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f11879a.equals(u0Var.f11879a) && this.f11880b == u0Var.f11880b && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        return Objects.hash(this.f11879a, Integer.valueOf(this.f11880b), 0, 0, null);
    }
}
