package wk;

import ab.a0;
import h0.n1;
import h0.t0;
import kotlin.jvm.internal.m;
import l1.p2;

public final class d implements n1 {
    public final t0 a;
    public final p2 b;

    public d(t0 t0Var, p2 fraction) {
        m.e(fraction, "fraction");
        this.a = t0Var;
        this.b = fraction;
    }

    public final float a() {
        return e() * this.a.a();
    }

    public final float b(y3.m layoutDirection) {
        m.e(layoutDirection, "layoutDirection");
        return e() * this.a.b(layoutDirection);
    }

    public final float c() {
        return e() * this.a.c();
    }

    public final float d(y3.m layoutDirection) {
        m.e(layoutDirection, "layoutDirection");
        return e() * this.a.d(layoutDirection);
    }

    public final float e() {
        return a0.x(((Number) this.b.getValue()).floatValue(), 0.0f, 1.0f);
    }
}
