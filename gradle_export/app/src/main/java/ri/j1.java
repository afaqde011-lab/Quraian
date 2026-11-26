package ri;

import com.google.android.gms.internal.measurement.x5;

public final class j1 extends l2 {

    public final String f13405a;

    public j1(String str) {
        this.f13405a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        return this.f13405a.equals(((j1) ((l2) obj)).f13405a);
    }

    public final int hashCode() {
        return this.f13405a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x5.n(new StringBuilder("User{identifier="), this.f13405a, "}");
    }
}
