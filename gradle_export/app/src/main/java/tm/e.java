package tm;

import a1.g2;
import a40.z;
import ab.a0;
import b2.r;
import d0.x1;
import g00.b0;
import kotlin.jvm.internal.m;
import o9.q;
import ta.c0;
import u00.k;
import u00.n;
import u00.o;
import v2.f0;
import x.b1;
import z.e1;

public final class e {
    public final z a;
    public final z00.b b;
    public final float c;
    public final n d;
    public final k e;
    public final o f;
    public final k g;
    public final b1 h;
    public final b1 i;
    public final b1 j;
    public final b1 k;
    public final b1 l;
    public final x.b m;
    public final x.b n;
    public final x.b o;
    public final x.b p;
    public final x.b q;
    public final e1 r;
    public final q s;
    public final r t;

    public e(z zVar, float f, z00.b bVar, float f2, float f3, n nVar, k kVar, o oVar) {
        Float fValueOf = Float.valueOf(0.001f);
        this(zVar, f, bVar, f2, f3, nVar, kVar, oVar, new rx.c(4, kVar), new b1(1.0f, 1000.0f, Float.valueOf(f2)), new b1(0.6f, 250.0f, fValueOf), new b1(0.7f, 250.0f, fValueOf));
    }

    public e(z animationScope, float f, z00.b bVar, float f2, float f3, n nVar, k kVar, o oVar, k kVar2, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        m.e(animationScope, "animationScope");
        this.a = animationScope;
        this.b = bVar;
        this.c = f3;
        this.d = nVar;
        this.e = kVar;
        this.f = oVar;
        this.g = kVar2;
        this.h = b1Var;
        this.i = b1Var2;
        this.j = b1Var3;
        this.k = new b1(0.5f, 300.0f, Float.valueOf(10.0f * f2));
        this.l = new b1(1.0f, 1000.0f, Float.valueOf(0.001f));
        this.m = x.c.a(f, f2);
        this.n = x.c.a(0.0f, 5.0f);
        this.o = x.c.a(0.0f, 0.001f);
        this.p = x.c.a(1.0f, 0.001f);
        this.q = x.c.a(1.0f, 0.001f);
        this.r = new e1();
        this.s = new q(28);
        this.t = f0.b(b2.o.A, b0.a, new g2(this, 5));
    }

    public final void a(float f) {
        c0.M(this.a, (k00.i) null, (n) null, (k) null, new f1.g(this, f, (k00.c) null), 31);
    }

    public final float b() {
        return ((Number) this.o.d()).floatValue();
    }

    public final float c() {
        float fE = e();
        z00.b bVar = this.b;
        return (fE - ((Number) bVar.a()).floatValue()) / (((Number) bVar.c()).floatValue() - ((Number) bVar.a()).floatValue());
    }

    public final float d() {
        return ((Number) this.m.e.getValue()).floatValue();
    }

    public final float e() {
        return ((Number) this.m.d()).floatValue();
    }

    public final void f() {
        c0.M(this.a, (k00.i) null, (n) null, (k) null, new rm.c(this, null, 9), 31);
    }

    public final void g(float f) {
        c0.M(this.a, (k00.i) null, (n) null, (k) null, new x1(this, ((Number) a0.E(Float.valueOf(f), this.b)).floatValue(), (k00.c) null, 1), 31);
    }
}
