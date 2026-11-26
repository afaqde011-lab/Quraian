package nb;

import android.graphics.drawable.BitmapDrawable;

public final class f {

    public final BitmapDrawable f11204a;

    public final boolean f11205b;

    public f(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f11204a = bitmapDrawable;
        this.f11205b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11204a.equals(fVar.f11204a) && this.f11205b == fVar.f11205b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11205b) + (this.f11204a.hashCode() * 31);
    }
}
