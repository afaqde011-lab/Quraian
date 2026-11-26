package lm;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import oi.k;

public final class b {
    public final String a;
    public final String b;
    public final String c;

    public b(String appBaseUrl, String apiHost, String mediaHost) {
        a aVar = a.A;
        m.e(appBaseUrl, "appBaseUrl");
        m.e(apiHost, "apiHost");
        m.e(mediaHost, "mediaHost");
        this.a = appBaseUrl;
        this.b = apiHost;
        this.c = mediaHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        a aVar = a.A;
        return m.a(this.a, bVar.a) && m.a(this.b, bVar.b) && m.a(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(x5.e(a.A.hashCode() * 31, this.a, 31), this.b, 31);
    }

    public final String toString() {
        a aVar = a.A;
        StringBuilder sb = new StringBuilder("Environment(type=");
        sb.append(aVar);
        sb.append(", appBaseUrl=");
        sb.append(this.a);
        sb.append(", apiHost=");
        return k.m(sb, this.b, ", mediaHost=", this.c, ")");
    }
}
