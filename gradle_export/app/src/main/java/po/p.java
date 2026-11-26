package po;

import d0.o2;

public final class p implements u2.a {
    public final float A;
    public final o2 B;
    public boolean C;
    public boolean D;
    public float E;

    public p(float f, o2 o2Var) {
        this.A = f;
        this.B = o2Var;
    }

    public final long c0(int i, long j) {
        if (!this.C || this.D) {
            return 0L;
        }
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        float f = -Float.intBitsToFloat(i2);
        if ((f > 0.0f) != (this.E >= 0.0f)) {
            this.E = 0.0f;
        }
        float f2 = this.E + f;
        this.E = f2;
        if (Math.abs(f2) < this.A) {
            return 0L;
        }
        this.D = true;
        this.B.invoke(Boolean.valueOf(this.E > 0.0f));
        return 0L;
    }
}
