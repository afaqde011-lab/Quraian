package z;

public final class k0 implements i2.t0 {

    public static final k0 f16941b = new k0(0);

    public static final k0 f16942c = new k0(1);

    public final int f16943a;

    public k0(int i10) {
        this.f16943a = i10;
    }

    @Override
    public final i2.l0 a(long j9, y3.m mVar, y3.c cVar) {
        switch (this.f16943a) {
            case 0:
                float fR0 = cVar.R0(x.f16972a);
                return new i2.j0(new h2.c(0.0f, -fR0, Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)) + fR0));
            default:
                float fR1 = cVar.R0(x.f16972a);
                return new i2.j0(new h2.c(-fR1, 0.0f, Float.intBitsToFloat((int) (j9 >> 32)) + fR1, Float.intBitsToFloat((int) (j9 & 4294967295L))));
        }
    }
}
