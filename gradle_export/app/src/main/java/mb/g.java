package mb;

public final class g extends h {

    public final m2.b f10809a;

    public final wb.p f10810b;

    public g(m2.b bVar, wb.p pVar) {
        this.f10809a = bVar;
        this.f10810b = pVar;
    }

    @Override
    public final m2.b a() {
        return this.f10809a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f10809a, gVar.f10809a) && kotlin.jvm.internal.m.a(this.f10810b, gVar.f10810b);
    }

    public final int hashCode() {
        return this.f10810b.hashCode() + (this.f10809a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f10809a + ", result=" + this.f10810b + ')';
    }
}
