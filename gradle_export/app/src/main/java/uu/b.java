package uu;

public final class b extends m00.c {
    public Object A;
    public final w B;
    public int C;

    public b(w wVar, k00.c cVar) {
        super(cVar);
        this.B = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(false, this);
    }
}
