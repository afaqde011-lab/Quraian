package w;

import java.util.LinkedHashMap;
import java.util.Map;

public final class g2 {

    public final z0 f15765a;

    public final d2 f15766b;

    public final i0 f15767c;

    public final d1 f15768d;

    public final boolean f15769e;

    public final Map f15770f;

    public g2(z0 z0Var, d2 d2Var, i0 i0Var, d1 d1Var, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : z0Var, (i10 & 2) != 0 ? null : d2Var, (i10 & 4) != 0 ? null : i0Var, (i10 & 8) != 0 ? null : d1Var, (i10 & 32) == 0, (i10 & 64) != 0 ? h00.y.A : linkedHashMap);
    }

    public g2(z0 z0Var, d2 d2Var, i0 i0Var, d1 d1Var, boolean z10, Map map) {
        this.f15765a = z0Var;
        this.f15766b = d2Var;
        this.f15767c = i0Var;
        this.f15768d = d1Var;
        this.f15769e = z10;
        this.f15770f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return kotlin.jvm.internal.m.a(this.f15765a, g2Var.f15765a) && kotlin.jvm.internal.m.a(this.f15766b, g2Var.f15766b) && kotlin.jvm.internal.m.a(this.f15767c, g2Var.f15767c) && kotlin.jvm.internal.m.a(this.f15768d, g2Var.f15768d) && this.f15769e == g2Var.f15769e && kotlin.jvm.internal.m.a(this.f15770f, g2Var.f15770f);
    }

    public final int hashCode() {
        z0 z0Var = this.f15765a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        d2 d2Var = this.f15766b;
        int iHashCode2 = (iHashCode + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        i0 i0Var = this.f15767c;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        d1 d1Var = this.f15768d;
        return this.f15770f.hashCode() + c.e((iHashCode3 + (d1Var != null ? d1Var.hashCode() : 0)) * 961, 31, this.f15769e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionData(fade=");
        sb2.append(this.f15765a);
        sb2.append(", slide=");
        sb2.append(this.f15766b);
        sb2.append(", changeSize=");
        sb2.append(this.f15767c);
        sb2.append(", scale=");
        sb2.append(this.f15768d);
        sb2.append(", veil=null, hold=");
        sb2.append(this.f15769e);
        sb2.append(", effectsMap=");
        return c.m(sb2, this.f15770f, ')');
    }
}
