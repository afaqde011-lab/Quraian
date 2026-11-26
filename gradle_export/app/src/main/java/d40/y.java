package d40;

public final class y extends m00.c {
    public Object A;
    public final b1.g B;
    public int C;

    public y(b1.g gVar, k00.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.emit((Object) null, this);
    }
}
