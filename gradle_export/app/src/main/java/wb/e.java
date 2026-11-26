package wb;

import android.graphics.drawable.Drawable;

public final class e extends j {

    public final Drawable f15911a;

    public final i f15912b;

    public final Throwable f15913c;

    public e(Drawable drawable, i iVar, Throwable th2) {
        this.f15911a = drawable;
        this.f15912b = iVar;
        this.f15913c = th2;
    }

    @Override
    public final Drawable a() {
        return this.f15911a;
    }

    @Override
    public final i b() {
        return this.f15912b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f15911a, eVar.f15911a) && kotlin.jvm.internal.m.a(this.f15912b, eVar.f15912b) && kotlin.jvm.internal.m.a(this.f15913c, eVar.f15913c);
    }

    public final int hashCode() {
        Drawable drawable = this.f15911a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.f15913c.hashCode() + ((this.f15912b.hashCode() + (iHashCode * 31)) * 31);
    }
}
