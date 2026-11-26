package qc;

import h00.y;
import java.util.Map;
import kotlin.jvm.internal.m;
import w.c;

public final class b {

    public final String f12831a;

    public final String f12832b;

    public final Map f12833c;

    public b(String str, String str2, int i10) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (Map) y.A);
    }

    public b(String str, String str2, Map map) {
        m.e(map, "userProperties");
        this.f12831a = str;
        this.f12832b = str2;
        this.f12833c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f12831a, bVar.f12831a) && m.a(this.f12832b, bVar.f12832b) && m.a(this.f12833c, bVar.f12833c);
    }

    public final int hashCode() {
        String str = this.f12831a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12832b;
        return this.f12833c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Identity(userId=");
        sb2.append((Object) this.f12831a);
        sb2.append(", deviceId=");
        sb2.append((Object) this.f12832b);
        sb2.append(", userProperties=");
        return c.m(sb2, this.f12833c, ')');
    }
}
