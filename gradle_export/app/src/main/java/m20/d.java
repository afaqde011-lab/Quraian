package m20;

import kotlin.jvm.internal.m;

public final class d extends w00.a {
    public final String b;
    public final String c;

    public d(String name, String desc) {
        super(15);
        m.e(name, "name");
        m.e(desc, "desc");
        this.b = name;
        this.c = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.b, dVar.b) && m.a(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override
    public final String i() {
        return this.b + ':' + this.c;
    }
}
