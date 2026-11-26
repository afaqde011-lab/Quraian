package js;

public final class e extends m00.c {
    public int A;
    public int B;
    public Object C;
    public final f D;
    public int E;

    public e(f fVar, m00.c cVar) {
        super(cVar);
        this.D = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.b(0, 0, this);
    }
}
