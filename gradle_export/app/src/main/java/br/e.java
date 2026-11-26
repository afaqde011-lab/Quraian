package br;

public final class e extends m00.c {
    public String A;
    public long B;
    public Object C;
    public final i D;
    public int E;

    public e(i iVar, m00.c cVar) {
        super(cVar);
        this.D = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return i.b(this.D, null, 0L, this);
    }
}
