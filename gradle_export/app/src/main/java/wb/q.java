package wb;

import h00.y;
import java.util.Map;

public final class q {

    public static final q f15982b = new q(y.A);

    public final Map f15983a;

    public q(Map map) {
        this.f15983a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return kotlin.jvm.internal.m.a(this.f15983a, ((q) obj).f15983a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15983a.hashCode();
    }

    public final String toString() {
        return w.c.m(new StringBuilder("Tags(tags="), this.f15983a, ')');
    }
}
