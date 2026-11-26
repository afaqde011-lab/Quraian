package sv;

public final class o extends m00.c {
    public Object A;
    public final p10.a B;
    public int C;

    public o(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.B = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.D(this);
    }
}
