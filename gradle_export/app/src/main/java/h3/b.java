package h3;

import android.content.res.Resources;
import kotlin.jvm.internal.m;
import oi.k;

public final class b {

    public final Resources.Theme f6561a;

    public final int f6562b;

    public b(Resources.Theme theme, int i10) {
        this.f6561a = theme;
        this.f6562b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f6561a, bVar.f6561a) && this.f6562b == bVar.f6562b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6562b) + (this.f6561a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f6561a);
        sb2.append(", id=");
        return k.l(sb2, this.f6562b, ')');
    }
}
