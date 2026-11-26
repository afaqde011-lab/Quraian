package nd;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class a {

    public final String f11216a;

    public final Map f11217b;

    public final Map f11218c;

    public final Map f11219d;

    public final Map f11220e;

    public a(String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4) {
        m.e(str, "eventType");
        this.f11216a = str;
        this.f11217b = linkedHashMap;
        this.f11218c = linkedHashMap2;
        this.f11219d = linkedHashMap3;
        this.f11220e = linkedHashMap4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f11216a, aVar.f11216a) && m.a(this.f11217b, aVar.f11217b) && m.a(this.f11218c, aVar.f11218c) && m.a(this.f11219d, aVar.f11219d) && m.a(this.f11220e, aVar.f11220e);
    }

    public final int hashCode() {
        int iHashCode = this.f11216a.hashCode() * 31;
        Map map = this.f11217b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f11218c;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f11219d;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f11220e;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(eventType=");
        sb2.append(this.f11216a);
        sb2.append(", eventProperties=");
        sb2.append(this.f11217b);
        sb2.append(", userProperties=");
        sb2.append(this.f11218c);
        sb2.append(", groups=");
        sb2.append(this.f11219d);
        sb2.append(", groupProperties=");
        return w.c.m(sb2, this.f11220e, ')');
    }
}
