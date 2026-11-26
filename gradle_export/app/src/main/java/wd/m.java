package wd;

import java.util.ArrayList;

public final class m extends w {

    public final ArrayList f16042a;

    public m(ArrayList arrayList) {
        this.f16042a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f16042a.equals(((m) ((w) obj)).f16042a);
    }

    public final int hashCode() {
        return this.f16042a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f16042a + "}";
    }
}
