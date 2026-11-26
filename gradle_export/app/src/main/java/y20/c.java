package y20;

import e30.a0;
import e30.w;
import kotlin.jvm.internal.m;

public final class c implements d {
    public final j10.e A;

    public c(j10.e eVar) {
        this.A = eVar;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return m.a(this.A, cVar != null ? cVar.A : null);
    }

    @Override
    public final w getType() {
        a0 a0VarN = this.A.n();
        m.d(a0VarN, "getDefaultType(...)");
        return a0VarN;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        a0 a0VarN = this.A.n();
        m.d(a0VarN, "getDefaultType(...)");
        sb.append(a0VarN);
        sb.append('}');
        return sb.toString();
    }
}
