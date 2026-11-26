package qb;

import android.graphics.drawable.Drawable;

public final class d extends e {

    public final Drawable f12810a;

    public final boolean f12811b;

    public final nb.e f12812c;

    public d(Drawable drawable, boolean z10, nb.e eVar) {
        this.f12810a = drawable;
        this.f12811b = z10;
        this.f12812c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f12810a, dVar.f12810a) && this.f12811b == dVar.f12811b && this.f12812c == dVar.f12812c;
    }

    public final int hashCode() {
        return this.f12812c.hashCode() + w.c.e(this.f12810a.hashCode() * 31, 31, this.f12811b);
    }
}
