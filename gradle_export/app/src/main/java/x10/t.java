package x10;

import java.util.Map;

public final class t {
    public final z a;
    public final z b;
    public final Map c = h00.y.A;
    public final boolean d;

    public t(z zVar, z zVar2) {
        this.a = zVar;
        this.b = zVar2;
        rd.a.J(new eo.p(this, 20));
        z zVar3 = z.IGNORE;
        this.d = zVar == zVar3 && zVar2 == zVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && kotlin.jvm.internal.m.a(this.c, tVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        z zVar = this.b;
        return this.c.hashCode() + ((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Jsr305Settings(globalLevel=");
        sb.append(this.a);
        sb.append(", migrationLevel=");
        sb.append(this.b);
        sb.append(", userDefinedLevelForSpecificAnnotation=");
        return w.c.m(sb, this.c, ')');
    }
}
