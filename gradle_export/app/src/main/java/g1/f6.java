package g1;

public final class f6 {

    public final p0.a f5791a;

    public final p0.a f5792b;

    public final p0.a f5793c;

    public final p0.a f5794d;

    public final p0.a f5795e;

    public final p0.a f5796f;

    public final p0.a f5797g;

    public final p0.a f5798h;

    public f6() {
        p0.e eVar = e6.f5775a;
        p0.e eVar2 = e6.f5776b;
        p0.e eVar3 = e6.f5777c;
        p0.e eVar4 = e6.f5778d;
        p0.e eVar5 = e6.f5780f;
        p0.e eVar6 = e6.f5779e;
        p0.e eVar7 = e6.f5781g;
        p0.e eVar8 = e6.f5782h;
        this.f5791a = eVar;
        this.f5792b = eVar2;
        this.f5793c = eVar3;
        this.f5794d = eVar4;
        this.f5795e = eVar5;
        this.f5796f = eVar6;
        this.f5797g = eVar7;
        this.f5798h = eVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return kotlin.jvm.internal.m.a(this.f5791a, f6Var.f5791a) && kotlin.jvm.internal.m.a(this.f5792b, f6Var.f5792b) && kotlin.jvm.internal.m.a(this.f5793c, f6Var.f5793c) && kotlin.jvm.internal.m.a(this.f5794d, f6Var.f5794d) && kotlin.jvm.internal.m.a(this.f5795e, f6Var.f5795e) && kotlin.jvm.internal.m.a(this.f5796f, f6Var.f5796f) && kotlin.jvm.internal.m.a(this.f5797g, f6Var.f5797g) && kotlin.jvm.internal.m.a(this.f5798h, f6Var.f5798h);
    }

    public final int hashCode() {
        return this.f5798h.hashCode() + ((this.f5797g.hashCode() + ((this.f5796f.hashCode() + ((this.f5795e.hashCode() + ((this.f5794d.hashCode() + ((this.f5793c.hashCode() + ((this.f5792b.hashCode() + (this.f5791a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f5791a + ", small=" + this.f5792b + ", medium=" + this.f5793c + ", large=" + this.f5794d + ", largeIncreased=" + this.f5796f + ", extraLarge=" + this.f5795e + ", extralargeIncreased=" + this.f5797g + ", extraExtraLarge=" + this.f5798h + ')';
    }
}
