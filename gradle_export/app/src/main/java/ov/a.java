package ov;

public final class a extends m00.c {
    public Object A;
    public final g B;
    public int C;

    public a(g gVar, m00.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
