package g1;

import kotlin.NoWhenBranchMatchedException;

public final class e0 {

    public final long f5763a;

    public final long f5764b;

    public final long f5765c;

    public final long f5766d;

    public final long f5767e;

    public final long f5768f;

    public final long f5769g;

    public final long f5770h;

    public final long f5771i;

    public final long f5772j;

    public final long f5773k;
    public final long l;

    public e0(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f5763a = j9;
        this.f5764b = j10;
        this.f5765c = j11;
        this.f5766d = j12;
        this.f5767e = j13;
        this.f5768f = j14;
        this.f5769g = j15;
        this.f5770h = j16;
        this.f5771i = j17;
        this.f5772j = j18;
        this.f5773k = j19;
        this.l = j20;
    }

    public static x.b1 a(l3.a aVar, l1.j jVar) throws NoWhenBranchMatchedException {
        if (aVar == l3.a.B) {
            l1.g0 g0Var = (l1.g0) jVar;
            g0Var.c0(1539262271);
            x.b1 b1VarP = x5.p(k1.q.D, jVar);
            g0Var.r(false);
            return b1VarP;
        }
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.c0(1539355581);
        x.b1 b1VarP2 = x5.p(k1.q.C, jVar);
        g0Var2.r(false);
        return b1VarP2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return i2.t.c(this.f5763a, e0Var.f5763a) && i2.t.c(this.f5764b, e0Var.f5764b) && i2.t.c(this.f5765c, e0Var.f5765c) && i2.t.c(this.f5766d, e0Var.f5766d) && i2.t.c(this.f5767e, e0Var.f5767e) && i2.t.c(this.f5768f, e0Var.f5768f) && i2.t.c(this.f5769g, e0Var.f5769g) && i2.t.c(this.f5770h, e0Var.f5770h) && i2.t.c(this.f5771i, e0Var.f5771i) && i2.t.c(this.f5772j, e0Var.f5772j) && i2.t.c(this.f5773k, e0Var.f5773k) && i2.t.c(this.l, e0Var.l);
    }

    public final int hashCode() {
        int i10 = i2.t.f7168h;
        return Long.hashCode(this.l) + w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(w.c.f(Long.hashCode(this.f5763a) * 31, this.f5764b, 31), this.f5765c, 31), this.f5766d, 31), this.f5767e, 31), this.f5768f, 31), this.f5769g, 31), this.f5770h, 31), this.f5771i, 31), this.f5772j, 31), this.f5773k, 31);
    }
}
