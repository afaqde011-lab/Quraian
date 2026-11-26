package c00;

public final class w extends m00.c {
    public zz.a A;
    public String B;
    public Object C;
    public final x D;
    public int E;

    public w(x xVar, m00.c cVar) {
        super(cVar);
        this.D = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return x.j(this.D, null, this);
    }
}
