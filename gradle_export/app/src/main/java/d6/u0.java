package d6;

import java.util.Map;

public final class u0 {

    public final Map f4700a;

    public final Map f4701b;

    public u0(Map map, Map map2) {
        this.f4700a = map;
        this.f4701b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.m.a(this.f4700a, u0Var.f4700a) && kotlin.jvm.internal.m.a(this.f4701b, u0Var.f4701b);
    }

    public final int hashCode() {
        return this.f4701b.hashCode() + (this.f4700a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State(receiverToProviderName=");
        sb2.append(this.f4700a);
        sb2.append(", providerNameToReceivers=");
        return w.c.m(sb2, this.f4701b, ')');
    }
}
