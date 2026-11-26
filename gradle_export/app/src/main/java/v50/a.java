package v50;

import a10.d;
import h00.q;
import h00.x;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m;
import r9.e;
import u00.n;

public final class a {
    public final b60.a a;
    public final d b;
    public final b60.a c;
    public final n d;
    public final c e;
    public List f;

    public a(b60.a scopeQualifier, d primaryType, b60.a aVar, n nVar, c cVar) {
        m.e(scopeQualifier, "scopeQualifier");
        m.e(primaryType, "primaryType");
        this.a = scopeQualifier;
        this.b = primaryType;
        this.c = aVar;
        this.d = nVar;
        this.e = cVar;
        this.f = x.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m.c(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        a aVar = (a) obj;
        return m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && m.a(this.a, aVar.a);
    }

    public final int hashCode() {
        b60.a aVar = this.c;
        int iHashCode = aVar != null ? aVar.hashCode() : 0;
        return this.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sb.append(g60.a.a(this.b));
        sb.append('\'');
        b60.a aVar = this.c;
        if (aVar != null) {
            sb.append(",qualifier:");
            sb.append(aVar);
        }
        b60.b bVar = c60.a.e;
        b60.a aVar2 = this.a;
        if (!m.a(aVar2, bVar)) {
            sb.append(",scope:");
            sb.append(aVar2);
        }
        if (!this.f.isEmpty()) {
            sb.append(",binds:");
            q.Q0(this.f, sb, ",", null, null, new e(17), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
