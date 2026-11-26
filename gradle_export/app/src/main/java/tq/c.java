package tq;

public final class c extends m00.c {
    public Object A;
    public final k B;
    public int C;

    public c(k kVar, m00.c cVar) {
        super(cVar);
        this.B = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(this);
    }
}
