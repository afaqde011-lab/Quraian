package z1;

import sd.p1;
import z.y0;

public abstract class f {

    public j f17019a;

    public long f17020b;

    public boolean f17021c;

    public int f17022d;

    public f(long j9, j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f17019a = jVar;
        this.f17020b = j9;
        y0 y0Var = l.f17036a;
        if (j9 != 0) {
            j jVarD = d();
            long j10 = jVarD.C;
            long[] jArr = jVarD.D;
            if (jArr != null) {
                j9 = jArr[0];
            } else {
                long j11 = jVarD.B;
                if (j11 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                } else {
                    long j12 = jVarD.A;
                    if (j12 != 0) {
                        j10 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j9 = ((long) iNumberOfTrailingZeros) + j10;
            }
            synchronized (l.f17038c) {
                iA = l.f17041f.a(j9);
            }
        } else {
            iA = -1;
        }
        this.f17022d = iA;
    }

    public static void q(f fVar) {
        l.f17037b.F(fVar);
    }

    public final void a() {
        synchronized (l.f17038c) {
            b();
            p();
        }
    }

    public void b() {
        l.f17039d = l.f17039d.c(g());
    }

    public abstract void c();

    public j d() {
        return this.f17019a;
    }

    public abstract u00.k e();

    public abstract boolean f();

    public long g() {
        return this.f17020b;
    }

    public int h() {
        return 0;
    }

    public abstract u00.k i();

    public final f j() {
        p1 p1Var = l.f17037b;
        f fVar = (f) p1Var.get();
        p1Var.F(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(z zVar);

    public final void o() {
        int i10 = this.f17022d;
        if (i10 >= 0) {
            l.u(i10);
            this.f17022d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f17019a = jVar;
    }

    public void s(long j9) {
        this.f17020b = j9;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(u00.k kVar);
}
