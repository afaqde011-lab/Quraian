package br;

public final class d extends m00.c {
    public String A;
    public long B;
    public int C;
    public Object D;
    public final i E;
    public int F;

    public d(i iVar, m00.c cVar) {
        super(cVar);
        this.E = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return i.a(this.E, this);
    }
}
