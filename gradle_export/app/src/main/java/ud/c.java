package ud;

import com.google.android.gms.internal.measurement.x5;

public final class c {

    public final String f15250a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f15250a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f15250a.equals(((c) obj).f15250a);
    }

    public final int hashCode() {
        return this.f15250a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return x5.n(new StringBuilder("Encoding{name=\""), this.f15250a, "\"}");
    }
}
