package q9;

import kotlin.jvm.internal.m;

public final class d extends s9.g {

    public final c f12787a;

    public d(c cVar) {
        this.f12787a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return m.a(this.f12787a, ((d) obj).f12787a);
    }

    public final int hashCode() {
        return this.f12787a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.f12787a + ')';
    }
}
