package qt;

import kotlin.jvm.internal.m;
import ot.o;

public final class e implements f {
    public final o a;

    public e(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && m.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectOption(option=" + this.a + ")";
    }
}
