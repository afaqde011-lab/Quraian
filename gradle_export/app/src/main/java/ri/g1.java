package ri;

import java.util.List;

public final class g1 extends i2 {

    public final List f13349a;

    public g1(List list) {
        this.f13349a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f13349a.equals(((g1) ((i2) obj)).f13349a);
    }

    public final int hashCode() {
        return this.f13349a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f13349a + "}";
    }
}
