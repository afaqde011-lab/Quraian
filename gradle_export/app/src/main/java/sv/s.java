package sv;

public final class s extends m00.c {
    public Object A;
    public final p10.a B;
    public int C;

    public s(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.B = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.B(this);
    }
}
