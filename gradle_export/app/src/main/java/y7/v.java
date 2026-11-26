package y7;

import android.util.Range;

public final class v {

    public long f16737a;

    public long f16738b;

    public double f16739c;

    public Range f16740d;

    public final void a(long j9, long j10) {
        double dDoubleValue;
        ta.c0.s(j9 != -9223372036854775807L);
        ta.c0.s(j10 != -9223372036854775807L);
        long j11 = this.f16737a;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f16738b;
            if (j12 == -9223372036854775807L || j9 == j11) {
                dDoubleValue = ((Double) this.f16740d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j10 - j12) / (j9 - j11);
            }
        } else {
            dDoubleValue = ((Double) this.f16740d.getUpper()).doubleValue();
        }
        this.f16739c = (((Double) this.f16740d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.f16739c * 0.800000011920929d);
        this.f16737a = j9;
        this.f16738b = j10;
    }

    public final void b() {
        this.f16739c = ((Double) this.f16740d.getUpper()).doubleValue();
        this.f16737a = -9223372036854775807L;
        this.f16738b = -9223372036854775807L;
    }

    public final void c(float f3) {
        ta.c0.s(f3 > 0.0f);
        this.f16740d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f3)));
        b();
    }
}
