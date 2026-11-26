package q9;

import java.util.List;
import kotlin.jvm.internal.m;
import oi.k;

public final class h implements c {

    public final Object f12793a;

    public final p9.e f12794b;

    public final List f12795c;

    public final List f12796d;

    public final v1.c f12797e = new v1.c(new m3.a(this, 12), -322904035, true);

    public h(Object obj, p9.e eVar, List list) {
        this.f12793a = obj;
        this.f12794b = eVar;
        this.f12795c = list;
        this.f12796d = va.a.R(eVar);
    }

    @Override
    public final List a() {
        return this.f12795c;
    }

    @Override
    public final v1.c b() {
        return this.f12797e;
    }

    @Override
    public final List d() {
        return this.f12796d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (m.a(this.f12793a, hVar.f12793a) && m.a(this.f12794b, hVar.f12794b) && m.a(this.f12795c, hVar.f12795c) && m.a(this.f12796d, hVar.f12796d)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f12793a;
    }

    public final int hashCode() {
        return (this.f12796d.hashCode() * 31) + (this.f12795c.hashCode() * 31) + (this.f12794b.hashCode() * 31) + (this.f12793a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SinglePaneScene(key=");
        sb2.append(this.f12793a);
        sb2.append(", entry=");
        sb2.append(this.f12794b);
        sb2.append(", previousEntries=");
        sb2.append(this.f12795c);
        sb2.append(", entries=");
        return k.n(sb2, this.f12796d, ')');
    }
}
