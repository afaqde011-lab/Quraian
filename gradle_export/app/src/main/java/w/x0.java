package w;

import java.util.LinkedHashMap;

public final class x0 {

    public static final x0 f15819b = new x0(new g2((z0) null, (d2) null, (i0) null, (d1) null, (LinkedHashMap) null, 127));

    public final g2 f15820a;

    public x0(g2 g2Var) {
        this.f15820a = g2Var;
    }

    public final x0 a(x0 x0Var) {
        g2 g2Var = x0Var.f15820a;
        z0 z0Var = g2Var.f15765a;
        g2 g2Var2 = this.f15820a;
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
        return new x0(new g2(z0Var, d2Var, i0Var, d1Var, h00.d0.U(g2Var2.f15770f, g2Var.f15770f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && kotlin.jvm.internal.m.a(((x0) obj).f15820a, this.f15820a);
    }

    public final int hashCode() {
        return this.f15820a.hashCode();
    }

    public final String toString() {
        if (equals(f15819b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        g2 g2Var = this.f15820a;
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
        return sb2.toString();
    }
}
