package sm;

public final class q implements u00.k {
    public final int A;
    public final long B;
    public final long C;

    public q(int i11, long j9, long j11) {
        this.A = i11;
        this.B = j9;
        this.C = j11;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                k2.d drawBackdrop = (k2.d) obj;
                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                long j9 = this.B;
                if (j9 != 16) {
                    k2.d.R(drawBackdrop, j9, 0L, 0L, 0.0f, null, 25, 62);
                    k2.d.R(drawBackdrop, i2.t.b(0.75f, j9), 0L, 0L, 0.0f, null, 0, 126);
                }
                long j11 = this.C;
                if (j11 != 16) {
                    k2.d.R(drawBackdrop, j11, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
            default:
                k2.d drawBackdrop2 = (k2.d) obj;
                kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                long j12 = this.B;
                if (j12 != 16) {
                    k2.d.R(drawBackdrop2, j12, 0L, 0L, 0.0f, null, 25, 62);
                    k2.d.R(drawBackdrop2, i2.t.b(0.75f, j12), 0L, 0L, 0.0f, null, 0, 126);
                }
                long j13 = this.C;
                if (j13 != 16) {
                    k2.d.R(drawBackdrop2, j13, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
        }
        return g00.b0.f7770a;
    }
}
