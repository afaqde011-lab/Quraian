package androidx.media3.common;

import android.net.Uri;

public final class c0 {

    public static final String f1139b;

    public final Uri f1140a;

    static {
        String str = e7.i0.f5136a;
        f1139b = Integer.toString(0, 36);
    }

    public c0(a1 a1Var) {
        this.f1140a = (Uri) a1Var.f1066a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f1140a.equals(((c0) obj).f1140a);
    }

    public final int hashCode() {
        return this.f1140a.hashCode() * 31;
    }
}
