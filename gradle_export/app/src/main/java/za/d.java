package za;

import android.net.Uri;

public final class d {

    public final Uri f17353a;

    public final boolean f17354b;

    public d(boolean z10, Uri uri) {
        this.f17353a = uri;
        this.f17354b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f17353a, dVar.f17353a) && this.f17354b == dVar.f17354b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17354b) + (this.f17353a.hashCode() * 31);
    }
}
