package vj;

import java.util.HashSet;

public final class d {

    public final HashSet f15731a;

    public d(HashSet hashSet) {
        this.f15731a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return this.f15731a.equals(((d) obj).f15731a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15731a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15731a + "}";
    }
}
