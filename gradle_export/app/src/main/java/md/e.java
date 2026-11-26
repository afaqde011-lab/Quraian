package md;

import java.util.Map;
import kotlin.jvm.internal.m;

public final class e {

    public final int f10873a;

    public final String f10874b;

    public final Object f10875c;

    public final String f10876d;

    public e(int i10, String str, Map map, String str2) {
        this.f10873a = i10;
        this.f10874b = str;
        this.f10875c = map;
        this.f10876d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10873a == eVar.f10873a && m.a(this.f10874b, eVar.f10874b) && this.f10875c.equals(eVar.f10875c) && m.a(this.f10876d, eVar.f10876d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f10873a) * 31;
        String str = this.f10874b;
        int iHashCode2 = (this.f10875c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f10876d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Response(statusCode=");
        sb2.append(this.f10873a);
        sb2.append(", body=");
        sb2.append(this.f10874b);
        sb2.append(", headers=");
        sb2.append(this.f10875c);
        sb2.append(", statusMessage=");
        return g4.c.k(sb2, this.f10876d, ')');
    }
}
