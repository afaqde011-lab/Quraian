package z2;

public final class p0 implements t1 {

    public final u.x f17152a;

    public final q0 f17153b;

    public final Object f17154c;

    public p0(q0 q0Var, Object obj) {
        this.f17153b = q0Var;
        this.f17154c = obj;
        int[] iArr = u.n.f14878a;
        this.f17152a = new u.x();
    }

    @Override
    public final int a() {
        b3.l0 l0Var = (b3.l0) this.f17153b.J.g(this.f17154c);
        if (l0Var != null) {
            return ((m1.e) ((m1.b) l0Var.o()).B).C;
        }
        return 0;
    }

    @Override
    public final long b(int i10) {
        b3.l0 l0Var = (b3.l0) this.f17153b.J.g(this.f17154c);
        if (l0Var == null || !l0Var.J()) {
            return 0L;
        }
        int i11 = ((m1.e) ((m1.b) l0Var.o()).B).C;
        if (i10 < 0 || i10 >= i11) {
            y2.a.e("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (!this.f17152a.c(i10)) {
            return 0L;
        }
        int i12 = ((b3.l0) ((m1.b) l0Var.o()).get(i10)).f2060h0.f2122p.A;
        return (((long) ((b3.l0) ((m1.b) l0Var.o()).get(i10)).f2060h0.f2122p.B) & 4294967295L) | (((long) i12) << 32);
    }

    @Override
    public final void c(l0.h1 h1Var) {
        a1.n nVar;
        b3.l0 l0Var = (b3.l0) this.f17153b.J.g(this.f17154c);
        b2.q qVar = (l0Var == null || (nVar = l0Var.f2059g0) == null) ? null : (b2.q) nVar.G;
        if (qVar == null || !qVar.N) {
            return;
        }
        b3.m.D(qVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", h1Var);
    }

    @Override
    public final void d(int i10, long j9) {
        q0 q0Var = this.f17153b;
        b3.l0 l0Var = (b3.l0) q0Var.J.g(this.f17154c);
        if (l0Var == null || !l0Var.J()) {
            return;
        }
        int i11 = ((m1.e) ((m1.b) l0Var.o()).B).C;
        if (i10 < 0 || i10 >= i11) {
            y2.a.e("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (l0Var.K()) {
            y2.a.a("Pre-measure called on node that is not placed");
        }
        b3.l0 l0Var2 = q0Var.A;
        l0Var2.R = true;
        ((c3.z) b3.p0.a(l0Var)).u((b3.l0) ((m1.b) l0Var.o()).get(i10), j9);
        l0Var2.R = false;
        this.f17152a.a(i10);
    }

    @Override
    public final void dispose() {
        q0.c(this.f17153b, this.f17154c);
    }
}
