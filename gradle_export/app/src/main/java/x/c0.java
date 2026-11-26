package x;

public final class c0 implements z {

    public final int f16265a;

    public final v f16266b;

    public final long f16267c;

    public final long f16268d;

    public c0(int i10, int i11, v vVar) {
        this.f16265a = i10;
        this.f16266b = vVar;
        this.f16267c = ((long) i10) * 1000000;
        this.f16268d = ((long) i11) * 1000000;
    }

    @Override
    public final long b(float f3, float f10, float f11) {
        return this.f16268d + this.f16267c;
    }

    @Override
    public final float c(float f3, float f10, float f11, long j9) {
        long j10 = j9 - this.f16268d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f16267c;
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return f11;
        }
        return (e(f3, f10, f11, j12) - e(f3, f10, f11, j12 - 1000000)) * 1000.0f;
    }

    @Override
    public final float e(float f3, float f10, float f11, long j9) {
        long j10 = j9 - this.f16268d;
        if (j10 < 0) {
            j10 = 0;
        }
        long j11 = this.f16267c;
        if (j10 > j11) {
            j10 = j11;
        }
        float fB = this.f16266b.b(this.f16265a == 0 ? 1.0f : j10 / j11);
        return (f10 * fB) + ((1 - fB) * f3);
    }
}
