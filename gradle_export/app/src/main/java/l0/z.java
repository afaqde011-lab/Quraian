package l0;

import bv.d3;

public final class z {

    public static final long f9806s;

    public static final int f9807t = 0;

    public final a40.z f9808a;

    public final i2.y f9809b;

    public final g1.l0 f9810c;

    public x.y f9811d;

    public x.y f9812e;

    public x.y f9813f;

    public boolean f9814g;

    public final l1.i1 f9815h;

    public final l1.i1 f9816i;

    public final l1.i1 f9817j;

    public final l1.i1 f9818k;
    public long l;
    public long m;

    public l2.b f9819n;

    public final x.b f9820o;

    public final x.b f9821p;

    public final l1.i1 f9822q;

    public long f9823r;

    static {
        long j9 = Integer.MAX_VALUE;
        f9806s = (j9 & 4294967295L) | (j9 << 32);
    }

    public z(a40.z zVar, i2.y yVar, g1.l0 l0Var) {
        this.f9808a = zVar;
        this.f9809b = yVar;
        this.f9810c = l0Var;
        Boolean bool = Boolean.FALSE;
        this.f9815h = l1.q.z(bool);
        this.f9816i = l1.q.z(bool);
        this.f9817j = l1.q.z(bool);
        this.f9818k = l1.q.z(bool);
        long j9 = f9806s;
        this.l = j9;
        this.m = 0L;
        this.f9819n = yVar != null ? yVar.c() : null;
        this.f9820o = new x.b(new y3.j(0L), x.c.f16262q, null, 12);
        this.f9821p = new x.b(Float.valueOf(1.0f), x.c.f16258k, null, 12);
        this.f9822q = l1.q.z(new y3.j(0L));
        this.f9823r = j9;
    }

    public final void a() {
        l2.b bVar = this.f9819n;
        x.y yVar = this.f9811d;
        boolean zBooleanValue = ((Boolean) this.f9816i.getValue()).booleanValue();
        a40.z zVar = this.f9808a;
        k00.c cVar = null;
        if (zBooleanValue || yVar == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.f(1.0f);
                }
                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new x(this, cVar, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z10 = !zB;
        if (!zB) {
            bVar.f(0.0f);
        }
        a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d3(z10, this, yVar, bVar, (k00.c) null, 1), 3);
    }

    public final boolean b() {
        return ((Boolean) this.f9817j.getValue()).booleanValue();
    }

    public final void c() {
        i2.y yVar;
        boolean zBooleanValue = ((Boolean) this.f9815h.getValue()).booleanValue();
        a40.z zVar = this.f9808a;
        k00.c cVar = null;
        if (zBooleanValue) {
            f(false);
            a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new x(this, cVar, 2), 3);
        }
        if (((Boolean) this.f9816i.getValue()).booleanValue()) {
            d(false);
            a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new x(this, cVar, 3), 3);
        }
        if (b()) {
            e(false);
            a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new x(this, cVar, 4), 3);
        }
        this.f9814g = false;
        g(0L);
        this.l = f9806s;
        l2.b bVar = this.f9819n;
        if (bVar != null && (yVar = this.f9809b) != null) {
            yVar.a(bVar);
        }
        this.f9819n = null;
        this.f9811d = null;
        this.f9813f = null;
        this.f9812e = null;
    }

    public final void d(boolean z10) {
        this.f9816i.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.f9817j.setValue(Boolean.valueOf(z10));
    }

    public final void f(boolean z10) {
        this.f9815h.setValue(Boolean.valueOf(z10));
    }

    public final void g(long j9) {
        this.f9822q.setValue(new y3.j(j9));
    }
}
