package oq;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class a {
    public final String a;
    public final String b;
    public final String c;

    public a(String title, String message, String str) {
        m.e(title, "title");
        m.e(message, "message");
        this.a = title;
        this.b = message;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && m.a(this.c, aVar.c);
    }

    public final int hashCode() {
        int iE = x5.e(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return x5.n(a1.b.s("ShareContent(title=", this.a, ", message=", this.b, ", artworkUrl="), this.c, ")");
    }
}
