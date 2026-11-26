package g1;

import kotlin.NoWhenBranchMatchedException;

public abstract class f0 {

    public static final float f5785a = 2;

    public static e0 a(long j9, long j10, long j11, l1.j jVar) throws NoWhenBranchMatchedException {
        long j12 = i2.t.f7167g;
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        e0 e0Var = q0Var.Z;
        if (e0Var == null) {
            long jD = r0.d(q0Var, k1.c.f8573c);
            long j13 = i2.t.f7166f;
            k1.g gVar = k1.c.f8571a;
            long jD2 = r0.d(q0Var, gVar);
            k1.g gVar2 = k1.c.f8572b;
            e0 e0Var2 = new e0(jD, j13, jD2, j13, i2.t.b(0.38f, r0.d(q0Var, gVar2)), j13, i2.t.b(0.38f, r0.d(q0Var, gVar2)), r0.d(q0Var, gVar), r0.d(q0Var, k1.c.f8576f), i2.t.b(0.38f, r0.d(q0Var, gVar2)), i2.t.b(0.38f, r0.d(q0Var, k1.c.f8575e)), i2.t.b(0.38f, r0.d(q0Var, gVar2)));
            q0Var.Z = e0Var2;
            e0Var = e0Var2;
        }
        long j14 = i2.t.f7166f;
        long j15 = j11 != 16 ? j11 : e0Var.f5763a;
        long j16 = j14 != 16 ? j14 : e0Var.f5764b;
        long j17 = j9 != 16 ? j9 : e0Var.f5765c;
        long j18 = j14 != 16 ? j14 : e0Var.f5766d;
        long j19 = j12 != 16 ? j12 : e0Var.f5767e;
        if (j14 == 16) {
            j14 = e0Var.f5768f;
        }
        return new e0(j15, j16, j17, j18, j19, j14, j12 != 16 ? j12 : e0Var.f5769g, j9 != 16 ? j9 : e0Var.f5770h, j10 != 16 ? j10 : e0Var.f5771i, j12 != 16 ? j12 : e0Var.f5772j, j12 != 16 ? j12 : e0Var.f5773k, j12 != 16 ? j12 : e0Var.l);
    }
}
