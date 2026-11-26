package xu;

public final class a extends m00.c {
    public su.c A;
    public su.d B;
    public tv.b C;
    public Object D;
    public final f E;
    public int F;

    public a(f fVar, m00.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.a(null, null, this);
    }
}
