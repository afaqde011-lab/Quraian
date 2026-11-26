package is;

import bt.y1;
import java.time.LocalDate;
import java.time.ZoneId;

public final class k1 implements d40.i {
    public final y1 A;
    public final ZoneId B;
    public final LocalDate C;
    public final LocalDate D;

    public k1(y1 y1Var, ZoneId zoneId, LocalDate localDate, LocalDate localDate2) {
        this.A = y1Var;
        this.B = zoneId;
        this.C = localDate;
        this.D = localDate2;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) throws Throwable {
        Object objCollect = this.A.collect(new ca.e0(jVar, this.B, this.C, this.D), cVar);
        return objCollect == l00.a.A ? objCollect : g00.b0.a;
    }
}
