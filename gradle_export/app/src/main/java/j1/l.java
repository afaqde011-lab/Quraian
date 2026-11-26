package j1;

public final class l extends m00.c {
    public Object A;
    public final q B;
    public int C;

    public l(q qVar, m00.c cVar) {
        super(cVar);
        this.B = qVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.F1(this);
    }
}
