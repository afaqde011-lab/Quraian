package d1;

public final class h {

    public final m3.h f4577a;

    public m3.h f4578b;

    public boolean f4579c = false;

    public d f4580d = null;

    public h(m3.h hVar, m3.h hVar2) {
        this.f4577a = hVar;
        this.f4578b = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f4577a, hVar.f4577a) && kotlin.jvm.internal.m.a(this.f4578b, hVar.f4578b) && this.f4579c == hVar.f4579c && kotlin.jvm.internal.m.a(this.f4580d, hVar.f4580d);
    }

    public final int hashCode() {
        int iE = w.c.e((this.f4578b.hashCode() + (this.f4577a.hashCode() * 31)) * 31, 31, this.f4579c);
        d dVar = this.f4580d;
        return iE + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f4577a) + ", substitution=" + ((Object) this.f4578b) + ", isShowingSubstitution=" + this.f4579c + ", layoutCache=" + this.f4580d + ')';
    }
}
