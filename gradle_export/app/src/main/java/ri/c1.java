package ri;

import com.google.android.gms.internal.measurement.x5;

public final class c1 extends f2 {

    public final String f13296a;

    public c1(String str) {
        this.f13296a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f13296a.equals(((c1) ((f2) obj)).f13296a);
    }

    public final int hashCode() {
        return this.f13296a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x5.n(new StringBuilder("Log{content="), this.f13296a, "}");
    }
}
