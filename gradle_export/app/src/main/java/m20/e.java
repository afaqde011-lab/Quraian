package m20;

import kotlin.jvm.internal.m;

public final class e extends w00.a {
    public final String b;
    public final String c;

    public e(String name, String desc) {
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.b, eVar.b) && m.a(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override
    public final String i() {
        return this.b + this.c;
    }
}
