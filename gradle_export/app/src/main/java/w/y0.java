package w;

import java.util.LinkedHashMap;

public final class y0 {

    public static final y0 f15822b = new y0(new g2((z0) null, (d2) null, (i0) null, (d1) null, (LinkedHashMap) null, 127));

    public static final y0 f15823c = new y0(new g2((z0) null, (d2) null, (i0) null, (d1) null, (LinkedHashMap) null, 95));

    public final g2 f15824a;

    public y0(g2 g2Var) {
        this.f15824a = g2Var;
    }

    public final y0 a(y0 y0Var) {
        g2 g2Var = y0Var.f15824a;
        z0 z0Var = g2Var.f15765a;
        g2 g2Var2 = this.f15824a;
        if (z0Var == null) {
            z0Var = g2Var2.f15765a;
        }
        d2 d2Var = g2Var.f15766b;
        if (d2Var == null) {
            d2Var = g2Var2.f15766b;
        }
        i0 i0Var = g2Var.f15767c;
        if (i0Var == null) {
            i0Var = g2Var2.f15767c;
        }
        d1 d1Var = g2Var.f15768d;
        if (d1Var == null) {
            d1Var = g2Var2.f15768d;
        }
        return new y0(new g2(z0Var, d2Var, i0Var, d1Var, g2Var.f15769e || g2Var2.f15769e, h00.d0.U(g2Var2.f15770f, g2Var.f15770f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && kotlin.jvm.internal.m.a(((y0) obj).f15824a, this.f15824a);
    }

    public final int hashCode() {
        return this.f15824a.hashCode();
    }

    public final String toString() {
        if (equals(f15822b)) {
            return "ExitTransition.None";
        }
        if (equals(f15823c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        g2 g2Var = this.f15824a;
        z0 z0Var = g2Var.f15765a;
        sb2.append(z0Var != null ? z0Var.toString() : null);
        sb2.append(",\nSlide - ");
        d2 d2Var = g2Var.f15766b;
        sb2.append(d2Var != null ? d2Var.toString() : null);
        sb2.append(",\nShrink - ");
        i0 i0Var = g2Var.f15767c;
        sb2.append(i0Var != null ? i0Var.toString() : null);
        sb2.append(",\nScale - ");
        d1 d1Var = g2Var.f15768d;
        sb2.append(d1Var != null ? d1Var.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(g2Var.f15769e);
        return sb2.toString();
    }
}
