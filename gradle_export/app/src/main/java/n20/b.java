package n20;

import kh.o;
import kotlin.jvm.internal.m;
import r30.k;
import r30.r;

public final class b {
    public final c a;
    public final c b;
    public final boolean c;

    public b(c packageFqName, c relativeClassName, boolean z) {
        m.e(packageFqName, "packageFqName");
        m.e(relativeClassName, "relativeClassName");
        this.a = packageFqName;
        this.b = relativeClassName;
        this.c = z;
        relativeClassName.a.c();
    }

    public b(c packageFqName, e topLevelName) {
        this(packageFqName, o.R(topLevelName), false);
        m.e(packageFqName, "packageFqName");
        m.e(topLevelName, "topLevelName");
        c cVar = c.c;
    }

    public static final String c(c cVar) {
        String str = cVar.a.a;
        return k.B0(str, '/') ? oi.k.g('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.a;
        boolean zC = cVar.a.c();
        c cVar2 = this.b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.a.a + '.' + cVar2.a.a);
    }

    public final String b() {
        c cVar = this.a;
        boolean zC = cVar.a.c();
        c cVar2 = this.b;
        if (zC) {
            return c(cVar2);
        }
        return r.u0(cVar.a.a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e name) {
        m.e(name, "name");
        return new b(this.a, this.b.a(name), this.c);
    }

    public final b e() {
        c cVarB = this.b.b();
        if (cVarB.a.c()) {
            return null;
        }
        return new b(this.a, cVarB, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.a, bVar.a) && m.a(this.b, bVar.b) && this.c == bVar.c;
    }

    public final e f() {
        return this.b.a.g();
    }

    public final boolean g() {
        return !this.b.b().a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.a.a.c()) {
            return b();
        }
        return "/" + b();
    }
}
