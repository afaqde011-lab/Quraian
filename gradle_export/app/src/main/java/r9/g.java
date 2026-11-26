package r9;

public final class g extends m00.c {
    public Object A;
    public int B;
    public final no.b C;

    public g(no.b bVar, k00.c cVar) {
        super(cVar);
        this.C = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit((Object) null, this);
    }
}
