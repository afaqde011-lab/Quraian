package v0;

import c4.b0;

public final class k implements b0 {
    public final qj.c A;
    public y3.l B;
    public y3.m C;
    public y3.l D;
    public y3.j E;

    public k(qj.c cVar) {
        this.A = cVar;
    }

    @Override
    public final long f(y3.k kVar, long j9, y3.m mVar, long j10) {
        y3.j jVar = this.E;
        if (jVar != null) {
            y3.l lVar = this.B;
            if ((lVar == null ? false : y3.l.b(lVar.f16596a, j9)) && this.C == mVar) {
                y3.l lVar2 = this.D;
                if (lVar2 != null ? y3.l.b(lVar2.f16596a, j10) : false) {
                    return jVar.f16590a;
                }
            }
        }
        long jF = this.A.f(kVar, j9, mVar, j10);
        this.B = new y3.l(j9);
        this.C = mVar;
        this.D = new y3.l(j10);
        this.E = new y3.j(jF);
        return jF;
    }
}
