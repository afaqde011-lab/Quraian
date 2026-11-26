package ut;

public final class c extends m00.c {
    public int A;
    public int B;
    public Object C;
    public final p D;
    public int E;

    public c(p pVar, m00.c cVar) {
        super(cVar);
        this.D = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(0, this);
    }
}
