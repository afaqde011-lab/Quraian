package d6;

import java.util.Set;

public final class d2 implements f2 {

    public final Set f4623a;

    public d2(Set set) {
        this.f4623a = set;
        if (set.isEmpty()) {
            throw new IllegalArgumentException("The set of sizes cannot be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.glance.appwidget.SizeMode.Responsive");
        return kotlin.jvm.internal.m.a(this.f4623a, ((d2) obj).f4623a);
    }

    public final int hashCode() {
        return this.f4623a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.f4623a + ')';
    }
}
