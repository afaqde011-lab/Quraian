package rv;

public final class f extends m00.c {
    public dw.a A;
    public Object B;
    public Object C;
    public final i D;
    public int E;

    public f(i iVar, m00.c cVar) {
        super(cVar);
        this.D = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.h(null, this);
    }
}
