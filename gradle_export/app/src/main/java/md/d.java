package md;

import com.google.android.gms.internal.measurement.x5;
import g00.k;
import h00.d0;
import h00.y;
import java.util.Map;

public final class d {

    public static final Object f10869d = d0.R(new k[]{new k("Content-Type", "application/json; charset=utf-8"), new k("Accept", "application/json")});

    public final String f10870a;

    public final Map f10871b;

    public final String f10872c;

    public d(String str, String str2) {
        c cVar = c.A;
        this.f10870a = str;
        this.f10871b = y.A;
        this.f10872c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f10870a.equals(dVar.f10870a)) {
            return false;
        }
        c cVar = c.A;
        return this.f10871b.equals(dVar.f10871b) && this.f10872c.equals(dVar.f10872c);
    }

    public final int hashCode() {
        return Integer.hashCode(20000) + w.c.d(15000, x5.e((this.f10871b.hashCode() + ((c.A.hashCode() + (this.f10870a.hashCode() * 31)) * 31)) * 31, this.f10872c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request(url=");
        sb2.append(this.f10870a);
        sb2.append(", method=");
        sb2.append(c.A);
        sb2.append(", headers=");
        sb2.append(this.f10871b);
        sb2.append(", body=");
        return x5.n(sb2, this.f10872c, ", connectTimeoutMs=15000, readTimeoutMs=20000)");
    }
}
