package ht;

public final class d extends m00.c {
    public long A;
    public et.a B;
    public Object C;
    public final e D;
    public int E;

    public d(e eVar, m00.c cVar) {
        super(cVar);
        this.D = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(0L, this);
    }
}
