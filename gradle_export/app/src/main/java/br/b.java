package br;

public final class b extends m00.c {
    public Object A;
    public final i B;
    public int C;

    public b(i iVar, m00.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.d(this);
    }
}
