package ea;

public final class j extends m00.c {
    public Object A;
    public int B;
    public d40.j C;
    public final k D;

    public j(k kVar, k00.c cVar) {
        super(cVar);
        this.D = kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.D.emit(null, this);
    }
}
