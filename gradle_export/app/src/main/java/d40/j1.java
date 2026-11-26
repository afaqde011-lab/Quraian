package d40;

public final class j1 extends m00.c {
    public Object A;
    public final b1.g B;
    public int C;

    public j1(b1.g gVar, k00.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(0, this);
    }
}
