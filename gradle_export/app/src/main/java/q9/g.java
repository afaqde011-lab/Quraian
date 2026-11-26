package q9;

import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class g {

    public final ArrayList f12789a;

    public final ArrayList f12790b;

    public final c f12791c;

    public final ArrayList f12792d;

    public g(ArrayList arrayList, ArrayList arrayList2, c cVar, ArrayList arrayList3) {
        this.f12789a = arrayList;
        this.f12790b = arrayList2;
        this.f12791c = cVar;
        this.f12792d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12789a.equals(gVar.f12789a) && this.f12790b.equals(gVar.f12790b) && m.a(this.f12791c, gVar.f12791c) && this.f12792d.equals(gVar.f12792d);
    }

    public final int hashCode() {
        return (this.f12792d.hashCode() * 31) + (this.f12791c.hashCode() * 31) + (this.f12790b.hashCode() * 31) + (this.f12789a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.f12789a + ", overlayScenes=" + this.f12790b + ", currentScene=" + this.f12791c + ", previousScenes=" + this.f12792d + ')';
    }
}
