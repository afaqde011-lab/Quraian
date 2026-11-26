package i7;

import android.util.Pair;
import java.io.IOException;

public final class y0 implements s7.g0, n7.i {
    public final a1 A;
    public final b1 B;

    public y0(b1 b1Var, a1 a1Var) {
        this.B = b1Var;
        this.A = a1Var;
    }

    @Override
    public final void B(int i10, s7.a0 a0Var, int i11) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new d.l(this, pairA, i11, 3));
        }
    }

    @Override
    public final void O(int i10, s7.a0 a0Var, gj.e eVar) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new ab.e(this, pairA, eVar, 9));
        }
    }

    public final Pair a(int i10, s7.a0 a0Var) {
        s7.a0 a0VarA;
        a1 a1Var = this.A;
        s7.a0 a0Var2 = null;
        if (a0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= a1Var.f7218c.size()) {
                    a0VarA = null;
                    break;
                }
                if (((s7.a0) a1Var.f7218c.get(i11)).f13647d == a0Var.f13647d) {
                    Object obj = a0Var.f13644a;
                    Object obj2 = a1Var.f7217b;
                    int i12 = h1.f7333j;
                    a0VarA = a0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (a0VarA == null) {
                return null;
            }
            a0Var2 = a0VarA;
        }
        return Pair.create(Integer.valueOf(i10 + a1Var.f7219d), a0Var2);
    }

    @Override
    public final void b(int i10, s7.a0 a0Var, s7.r rVar, s7.w wVar) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new t0(this, pairA, rVar, wVar, 1));
        }
    }

    @Override
    public final void c(int i10, s7.a0 a0Var, s7.r rVar, s7.w wVar, int i11) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new w0(this, pairA, rVar, wVar, i11, 0));
        }
    }

    @Override
    public final void d(int i10, s7.a0 a0Var) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new v0(this, pairA, 0));
        }
    }

    @Override
    public final void i(int i10, s7.a0 a0Var) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new v0(this, pairA, 1));
        }
    }

    @Override
    public final void j(int i10, s7.a0 a0Var, s7.r rVar, s7.w wVar) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new t0(this, pairA, rVar, wVar, 0));
        }
    }

    @Override
    public final void o(int i10, s7.a0 a0Var, s7.w wVar) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new u0(this, pairA, wVar, 1));
        }
    }

    @Override
    public final void q(int i10, s7.a0 a0Var, s7.w wVar) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new u0(this, pairA, wVar, 0));
        }
    }

    @Override
    public final void y(int i10, s7.a0 a0Var, final s7.r rVar, final s7.w wVar, final IOException iOException, final boolean z10) {
        final Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new Runnable() {
                @Override
                public final void run() {
                    j7.f fVar = (j7.f) this.A.B.f7231i;
                    Pair pair = pairA;
                    fVar.y(((Integer) pair.first).intValue(), (s7.a0) pair.second, rVar, wVar, iOException, z10);
                }
            });
        }
    }

    @Override
    public final void z(int i10, s7.a0 a0Var, Exception exc) {
        Pair pairA = a(i10, a0Var);
        if (pairA != null) {
            ((e7.d0) this.B.f7232j).d(new ab.e(this, pairA, exc, 10));
        }
    }
}
