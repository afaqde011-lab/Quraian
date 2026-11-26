package ss;

import java.util.Set;

public final class p {
    public final Set a;
    public final boolean b;
    public final boolean c;

    public p(Set periods, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(periods, "periods");
        this.a = periods;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.a, pVar.a) && this.b == pVar.b && this.c == pVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w.c.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListeningLoadingState(periods=");
        sb.append(this.a);
        sb.append(", isImporting=");
        sb.append(this.b);
        sb.append(", isYearRequestRunning=");
        return g4.c.l(sb, this.c, ")");
    }
}
