package g1;

import com.google.protobuf.RuntimeVersion;

public final class a8 {

    public final int f5727a;

    public final boolean equals(Object obj) {
        if (obj instanceof a8) {
            return this.f5727a == ((a8) obj).f5727a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5727a);
    }

    public final String toString() {
        int i10 = this.f5727a;
        if (i10 == 0) {
            return "Hour";
        }
        return i10 == 1 ? "Minute" : RuntimeVersion.SUFFIX;
    }
}
