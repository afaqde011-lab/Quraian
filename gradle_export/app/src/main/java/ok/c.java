package ok;

import i2.l0;
import kotlin.jvm.internal.m;

public final class c extends d {

    public final b f12134f;

    public c(b bVar) {
        m.e(bVar, "continuity");
        p0.d dVar = e.f12136a;
        super(dVar, dVar, dVar, dVar, bVar);
        this.f12134f = bVar;
    }

    @Override
    public final l0 d(long j9, float f3, float f10, float f11, float f12, y3.m mVar) {
        m.e(mVar, "layoutDirection");
        return ((pk.a) this.f12134f).a(j9);
    }

    @Override
    public final b e() {
        return this.f12134f;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m.a(this.f12134f, ((c) obj).f12134f);
    }

    @Override
    public final int hashCode() {
        return this.f12134f.hashCode();
    }

    @Override
    public final String toString() {
        return "ContinuousCapsule(continuity=" + this.f12134f + ")";
    }
}
