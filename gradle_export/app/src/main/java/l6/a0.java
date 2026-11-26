package l6;

public final class a0 extends m00.c {
    public Object A;
    public final w B;
    public int C;

    public a0(w wVar, m00.c cVar) {
        super(cVar);
        this.B = wVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
