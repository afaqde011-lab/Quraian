package j10;

import java.util.List;

public final class c0 {
    public final n20.b a;
    public final List b;

    public c0(n20.b classId, List list) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.a = classId;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.a, c0Var.a) && kotlin.jvm.internal.m.a(this.b, c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.a);
        sb.append(", typeParametersCount=");
        return oi.k.n(sb, this.b, ')');
    }
}
