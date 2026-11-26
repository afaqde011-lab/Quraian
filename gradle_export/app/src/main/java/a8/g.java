package a8;

public final class g {

    public final long f268a;

    public final long f269b;

    public final long f270c;

    public long f271d = 0;

    public long f272e;

    public long f273f;

    public long f274g;

    public long f275h;

    public g(long j9, long j10, long j11, long j12, long j13, long j14) {
        this.f268a = j9;
        this.f269b = j10;
        this.f272e = j11;
        this.f273f = j12;
        this.f274g = j13;
        this.f270c = j14;
        this.f275h = a(j10, 0L, j11, j12, j13, j14);
    }

    public static long a(long j9, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || j10 + 1 >= j11) {
            return j12;
        }
        long j15 = (long) ((j9 - j10) * ((j13 - j12) / (j11 - j10)));
        return e7.i0.i(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
    }
}
