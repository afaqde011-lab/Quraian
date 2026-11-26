package is;

public final class e1 extends m00.c {
    public Object A;
    public int B;
    public final b1.g C;

    public e1(b1.g gVar, k00.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit((Object) null, this);
    }
}
