package n20;

import kotlin.jvm.internal.m;

public final class c {
    public static final c c = new c("");
    public final d a;
    public transient c b;

    public c(String fqName) {
        m.e(fqName, "fqName");
        this.a = new d(fqName, this);
    }

    public c(d dVar) {
        this.a = dVar;
    }

    public c(d dVar, c cVar) {
        this.a = dVar;
        this.b = cVar;
    }

    public final c a(e name) {
        m.e(name, "name");
        return new c(this.a.a(name), this);
    }

    public final c b() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar;
        }
        d dVar = this.a;
        if (dVar.c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(dVar.e());
        this.b = cVar2;
        return cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m.a(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
