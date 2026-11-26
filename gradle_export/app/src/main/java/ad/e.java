package ad;

public final class e extends m00.c {
    public f A;
    public gd.a B;
    public Object C;
    public final f D;
    public int E;

    public e(f fVar, m00.c cVar) {
        super(cVar);
        this.D = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.g(null, this);
    }
}
