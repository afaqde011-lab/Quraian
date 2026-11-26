package gx;

public final class b extends m00.c {
    public bx.d A;
    public String B;
    public Object C;
    public final c D;
    public int E;

    public b(c cVar, m00.c cVar2) {
        super(cVar2);
        this.D = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(null, this);
    }
}
