package g1;

public abstract class s {

    public static final h0.p1 f5954a;

    public static final h0.p1 f5955b;

    public static final float f5956c;

    public static final float f5957d;

    public static final float f5958e;

    static {
        float f3 = k1.a.f8563a;
        float f10 = k1.a.f8564b;
        float f11 = 16;
        float f12 = k1.b.f8566a;
        float f13 = 8;
        f5954a = new h0.p1(f3, f13, f10, f13);
        h0.c.f(f11, f13, f10, f13);
        float f14 = 12;
        f5955b = new h0.p1(f14, f13, f14, f13);
        h0.c.f(f14, f13, f11, f13);
        f5956c = 58;
        f5957d = k1.b.f8566a;
        f5958e = k1.b.f8568c;
    }

    public static r a(long j9, long j10, long j11, long j12, l1.j jVar, int i10) {
        r rVar;
        long j13 = (i10 & 4) != 0 ? i2.t.f7167g : j11;
        long j14 = (i10 & 8) != 0 ? i2.t.f7167g : j12;
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        r rVar2 = q0Var.W;
        if (rVar2 == null) {
            r rVar3 = new r(r0.d(q0Var, k1.l.f8786a), r0.d(q0Var, k1.l.f8795j), i2.t.b(k1.l.f8790e, r0.d(q0Var, k1.l.f8788c)), i2.t.b(k1.l.f8792g, r0.d(q0Var, k1.l.f8791f)));
            q0Var.W = rVar3;
            rVar = rVar3;
        } else {
            rVar = rVar2;
        }
        return rVar.a(j9, j10, j13, j14);
    }

    public static r b(long j9, long j10, long j11, l1.j jVar, int i10) {
        r rVar;
        long j12 = (i10 & 1) != 0 ? i2.t.f7167g : j9;
        long j13 = (i10 & 4) != 0 ? i2.t.f7167g : j11;
        long j14 = i2.t.f7167g;
        q0 q0Var = (q0) ((l1.g0) jVar).k(r0.f5948a);
        r rVar2 = q0Var.X;
        if (rVar2 == null) {
            long j15 = i2.t.f7166f;
            r rVar3 = new r(j15, r0.d(q0Var, k1.g.L), j15, i2.t.b(k1.b0.f8570b, r0.d(q0Var, k1.b0.f8569a)));
            q0Var.X = rVar3;
            rVar = rVar3;
        } else {
            rVar = rVar2;
        }
        return rVar.a(j12, j10, j13, j14);
    }
}
