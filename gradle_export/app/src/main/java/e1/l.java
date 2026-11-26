package e1;

public final class l implements c4.b0 {
    public final b2.d A;
    public final n B;
    public long C = 0;

    public l(b2.d dVar, n nVar) {
        this.A = dVar;
        this.B = nVar;
    }

    @Override
    public final long f(y3.k kVar, long j9, y3.m mVar, long j10) {
        long jA = this.B.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.C;
        }
        this.C = jA;
        return y3.j.d(y3.j.d(kVar.c(), f50.k.C(jA)), this.A.a(j10, 0L, mVar));
    }
}
