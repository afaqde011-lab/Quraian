package rv;

public final class h extends m00.c {
    public int A;
    public int B;
    public Object C;
    public final i D;
    public int E;

    public h(i iVar, m00.c cVar) {
        super(cVar);
        this.D = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.j(null, this);
    }
}
