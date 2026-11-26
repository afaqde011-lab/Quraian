package rc;

import java.util.List;

public final class f {

    public final boolean f13167a;

    public final boolean f13168b;

    public final boolean f13169c;

    public final boolean f13170d;

    public final List f13171e;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, i00.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "interactions");
        this.f13167a = z10;
        this.f13168b = z11;
        this.f13169c = z12;
        this.f13170d = z13;
        this.f13171e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13167a == fVar.f13167a && this.f13168b == fVar.f13168b && this.f13169c == fVar.f13169c && this.f13170d == fVar.f13170d && kotlin.jvm.internal.m.a(this.f13171e, fVar.f13171e);
    }

    public final int hashCode() {
        return this.f13171e.hashCode() + w.c.e(w.c.e(w.c.e(Boolean.hashCode(this.f13167a) * 31, 31, this.f13168b), 31, this.f13169c), 31, this.f13170d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutocaptureState(sessions=");
        sb2.append(this.f13167a);
        sb2.append(", appLifecycles=");
        sb2.append(this.f13168b);
        sb2.append(", screenViews=");
        sb2.append(this.f13169c);
        sb2.append(", deepLinks=");
        sb2.append(this.f13170d);
        sb2.append(", interactions=");
        return oi.k.n(sb2, this.f13171e, ')');
    }
}
