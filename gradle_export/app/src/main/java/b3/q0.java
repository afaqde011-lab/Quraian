package b3;

public final class q0 {

    public final l0 f2109a;

    public boolean f2110b;

    public boolean f2111c;

    public boolean f2113e;

    public boolean f2114f;

    public boolean f2115g;

    public int f2116h;

    public int f2117i;

    public boolean f2118j;

    public boolean f2119k;
    public int l;
    public boolean m;

    public boolean f2120n;

    public int f2121o;

    public y0 f2123q;

    public f0 f2112d = f0.E;

    public final c1 f2122p = new c1(this);

    public q0(l0 l0Var) {
        this.f2109a = l0Var;
    }

    public final p1 a() {
        return (p1) this.f2109a.f2059g0.E;
    }

    public final void b() {
        f0 f0Var = this.f2109a.f2060h0.f2112d;
        if (f0Var == f0.C || f0Var == f0.D) {
            if (this.f2122p.f2011a0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (f0Var == f0.D) {
            y0 y0Var = this.f2123q;
            if (y0Var == null || !y0Var.U) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j9) {
        y0 y0Var = this.f2123q;
        if (y0Var != null) {
            f0 f0Var = f0.B;
            q0 q0Var = y0Var.F;
            q0Var.f2112d = f0Var;
            c1 c1Var = q0Var.f2122p;
            l0 l0Var = q0Var.f2109a;
            q0Var.f2113e = false;
            y0Var.Y = j9;
            b2 snapshotObserver = ((c3.z) p0.a(l0Var)).getSnapshotObserver();
            x0 x0Var = y0Var.Z;
            snapshotObserver.f2003a.d(l0Var, snapshotObserver.f2004b, x0Var);
            q0Var.f2114f = true;
            q0Var.f2115g = true;
            if (m.s(l0Var)) {
                c1Var.V = true;
                c1Var.W = true;
            } else {
                c1Var.U = true;
            }
            q0Var.f2112d = f0.E;
        }
    }

    public final void d(int i10) {
        int i11 = this.l;
        this.l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            l0 l0VarX = this.f2109a.x();
            q0 q0Var = l0VarX != null ? l0VarX.f2060h0 : null;
            if (q0Var != null) {
                if (i10 == 0) {
                    q0Var.d(q0Var.l - 1);
                } else {
                    q0Var.d(q0Var.l + 1);
                }
            }
        }
    }

    public final void e(int i10) {
        int i11 = this.f2121o;
        this.f2121o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            l0 l0VarX = this.f2109a.x();
            q0 q0Var = l0VarX != null ? l0VarX.f2060h0 : null;
            if (q0Var != null) {
                if (i10 == 0) {
                    q0Var.e(q0Var.f2121o - 1);
                } else {
                    q0Var.e(q0Var.f2121o + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f2119k != z10) {
            this.f2119k = z10;
            if (z10 && !this.f2118j) {
                d(this.l + 1);
            } else {
                if (z10 || this.f2118j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f2118j != z10) {
            this.f2118j = z10;
            if (z10 && !this.f2119k) {
                d(this.l + 1);
            } else {
                if (z10 || this.f2119k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f2120n != z10) {
            this.f2120n = z10;
            if (z10 && !this.m) {
                e(this.f2121o + 1);
            } else {
                if (z10 || this.m) {
                    return;
                }
                e(this.f2121o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.m != z10) {
            this.m = z10;
            if (z10 && !this.f2120n) {
                e(this.f2121o + 1);
            } else {
                if (z10 || this.f2120n) {
                    return;
                }
                e(this.f2121o - 1);
            }
        }
    }

    public final void j() {
        c1 c1Var = this.f2122p;
        q0 q0Var = c1Var.F;
        Object obj = c1Var.R;
        l0 l0Var = this.f2109a;
        if ((obj != null || q0Var.a().U() != null) && c1Var.Q) {
            c1Var.Q = false;
            c1Var.R = q0Var.a().U();
            l0 l0VarX = l0Var.x();
            if (l0VarX != null) {
                l0.X(l0VarX, false, 7);
            }
        }
        y0 y0Var = this.f2123q;
        if (y0Var != null) {
            q0 q0Var2 = y0Var.F;
            if (y0Var.X == null) {
                v0 v0VarX1 = q0Var2.a().x1();
                kotlin.jvm.internal.m.b(v0VarX1);
                if (v0VarX1.O.U() == null) {
                    return;
                }
            }
            if (y0Var.W) {
                y0Var.W = false;
                v0 v0VarX2 = q0Var2.a().x1();
                kotlin.jvm.internal.m.b(v0VarX2);
                y0Var.X = v0VarX2.O.U();
                if (m.s(l0Var)) {
                    l0 l0VarX2 = l0Var.x();
                    if (l0VarX2 != null) {
                        l0.X(l0VarX2, false, 7);
                        return;
                    }
                    return;
                }
                l0 l0VarX3 = l0Var.x();
                if (l0VarX3 != null) {
                    l0.V(l0VarX3, false, 7);
                }
            }
        }
    }
}
