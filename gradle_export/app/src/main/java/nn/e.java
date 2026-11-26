package nn;

public final class e extends m00.c {
    public int A;
    public int B;
    public j C;
    public Object D;
    public bx.c E;
    public Object F;
    public final j G;
    public int H;

    public e(j jVar, m00.c cVar) {
        super(cVar);
        this.G = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return j.a(this.G, 0, this);
    }
}
