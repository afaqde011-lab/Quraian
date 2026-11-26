package is;

import java.time.LocalDate;
import java.time.ZoneId;

public final class l1 extends m00.c {
    public int A;
    public int B;
    public LocalDate C;
    public String D;
    public ZoneId E;
    public Object F;
    public long G;
    public Object H;
    public final m1 I;
    public int J;

    public l1(m1 m1Var, m00.c cVar) {
        super(cVar);
        this.I = m1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.i(0, null, this);
    }
}
