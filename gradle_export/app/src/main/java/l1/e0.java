package l1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class e0 extends n {

    public final long f9832a;

    public final boolean f9833b;

    public final boolean f9834c;

    public HashSet f9835d;

    public final u.j0 f9836e;

    public final i1 f9837f;

    public final g0 f9838g;

    public e0(g0 g0Var, long j9, boolean z10, boolean z11, gi.c cVar) {
        this.f9838g = g0Var;
        this.f9832a = j9;
        this.f9833b = z10;
        this.f9834c = z11;
        u.j0 j0Var = u.r0.f14890a;
        this.f9836e = new u.j0();
        this.f9837f = new i1(v1.h.D, c.E);
    }

    @Override
    public final void a(p pVar, u00.n nVar) {
        this.f9838g.f9843b.a(pVar, nVar);
    }

    @Override
    public final u.j0 b(p pVar, d2 d2Var, u00.n nVar) {
        return this.f9838g.f9843b.b(pVar, d2Var, nVar);
    }

    @Override
    public final void c(t0 t0Var) {
        this.f9838g.f9843b.c(t0Var);
    }

    @Override
    public final void d() {
        this.f9838g.A--;
    }

    @Override
    public final boolean e() {
        return this.f9838g.f9843b.e();
    }

    @Override
    public final boolean f() {
        return this.f9833b;
    }

    @Override
    public final boolean g() {
        return this.f9834c;
    }

    @Override
    public final long h() {
        return this.f9832a;
    }

    @Override
    public final m i() {
        return this.f9838g.f9849h;
    }

    @Override
    public final m1 j() {
        return (m1) this.f9837f.getValue();
    }

    @Override
    public final k00.i k() {
        return this.f9838g.f9843b.k();
    }

    @Override
    public final boolean l() {
        return this.f9838g.f9843b.l();
    }

    @Override
    public final void m(t0 t0Var) {
        this.f9838g.f9843b.m(t0Var);
    }

    @Override
    public final void n(p pVar) {
        g0 g0Var = this.f9838g;
        g0Var.f9843b.n(g0Var.f9849h);
        g0Var.f9843b.n(pVar);
    }

    @Override
    public final void o(t0 t0Var, s0 s0Var, a aVar) {
        this.f9838g.f9843b.o(t0Var, s0Var, aVar);
    }

    @Override
    public final s0 p(t0 t0Var) {
        return this.f9838g.f9843b.p(t0Var);
    }

    @Override
    public final u.j0 q(p pVar, d2 d2Var, u.j0 j0Var) {
        return this.f9838g.f9843b.q(pVar, d2Var, j0Var);
    }

    @Override
    public final void r(Set set) {
        HashSet hashSet = this.f9835d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f9835d = hashSet;
        }
        hashSet.add(set);
    }

    @Override
    public final void s(g0 g0Var) {
        this.f9836e.a(g0Var);
    }

    @Override
    public final void t(r1 r1Var) {
        this.f9838g.f9843b.t(r1Var);
    }

    @Override
    public final void u(p pVar) {
        this.f9838g.f9843b.u(pVar);
    }

    @Override
    public final d v(b3.j0 j0Var) {
        return this.f9838g.f9843b.v(j0Var);
    }

    @Override
    public final void w() {
        this.f9838g.A++;
    }

    @Override
    public final void x(g0 g0Var) {
        HashSet<Set> hashSet = this.f9835d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.m.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.GapComposer");
                set.remove(g0Var.y());
            }
        }
        if (g0Var != null) {
            this.f9836e.l(g0Var);
        }
    }

    @Override
    public final void y(p pVar) {
        this.f9838g.f9843b.y(pVar);
    }

    public final void z() {
        u.j0 j0Var = this.f9836e;
        if (j0Var.h()) {
            HashSet hashSet = this.f9835d;
            if (hashSet != null) {
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j9 = jArr[i10];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i10 != length) {
                                break;
                                break;
                            }
                            i10++;
                        } else {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j9) < 128) {
                                    g0 g0Var = (g0) objArr[(i10 << 3) + i12];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(g0Var.y());
                                    }
                                }
                                j9 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            } else if (i10 != length) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
            j0Var.b();
        }
    }
}
