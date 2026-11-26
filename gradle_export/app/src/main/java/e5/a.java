package e5;

public final class a {

    public int f5088a;

    public int f5089b;

    public float f5090c;

    public float f5091d;

    public long f5092e;

    public long f5093f;

    public long f5094g;

    public float f5095h;

    public int f5096i;

    public final float a(long j9) {
        long j10 = this.f5092e;
        if (j9 < j10) {
            return 0.0f;
        }
        long j11 = this.f5094g;
        if (j11 < 0 || j9 < j11) {
            return c.b((j9 - j10) / this.f5088a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f5095h;
        return (c.b((j9 - j11) / this.f5096i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
