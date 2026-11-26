package mb;

public final class e extends h {

    public final m2.b f10806a;

    public final wb.e f10807b;

    public e(m2.b bVar, wb.e eVar) {
        this.f10806a = bVar;
        this.f10807b = eVar;
    }

    @Override
    public final m2.b a() {
        return this.f10806a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f10806a, eVar.f10806a) && kotlin.jvm.internal.m.a(this.f10807b, eVar.f10807b);
    }

    public final int hashCode() {
        m2.b bVar = this.f10806a;
        return this.f10807b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f10806a + ", result=" + this.f10807b + ')';
    }
}
