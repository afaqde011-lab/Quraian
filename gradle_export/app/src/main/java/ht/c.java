package ht;

public final class c extends m00.c {
    public Object A;
    public final e B;
    public int C;

    public c(e eVar, m00.c cVar) {
        super(cVar);
        this.B = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(0L, this);
    }
}
