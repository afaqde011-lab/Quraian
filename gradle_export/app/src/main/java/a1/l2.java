package a1;

import java.util.List;

public final class l2 extends z1.b0 {

    public CharSequence f86c;

    public List f87d;

    public m3.q0 f88e;

    public m3.r0 f89f;

    public boolean f90g;

    public boolean f91h;

    public float f92i;

    public float f93j;

    public y3.m f94k;
    public q3.h l;
    public long m;

    public m3.n0 f95n;

    public l2() {
        super(z1.l.j().g());
        this.f92i = Float.NaN;
        this.f93j = Float.NaN;
        this.m = y3.b.b(0, 0, 0, 0, 15);
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        l2 l2Var = (l2) b0Var;
        this.f86c = l2Var.f86c;
        this.f87d = l2Var.f87d;
        this.f88e = l2Var.f88e;
        this.f89f = l2Var.f89f;
        this.f90g = l2Var.f90g;
        this.f91h = l2Var.f91h;
        this.f92i = l2Var.f92i;
        this.f93j = l2Var.f93j;
        this.f94k = l2Var.f94k;
        this.l = l2Var.l;
        this.m = l2Var.m;
        this.f95n = l2Var.f95n;
    }

    @Override
    public final z1.b0 b() {
        return new l2();
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.f86c) + ", annotations=" + this.f87d + ", composition=" + this.f88e + ", textStyle=" + this.f89f + ", singleLine=" + this.f90g + ", softWrap=" + this.f91h + ", densityValue=" + this.f92i + ", fontScale=" + this.f93j + ", layoutDirection=" + this.f94k + ", fontFamilyResolver=" + this.l + ", constraints=" + ((Object) y3.a.k(this.m)) + ", layoutResult=" + this.f95n + ')';
    }
}
