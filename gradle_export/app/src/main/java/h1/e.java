package h1;

public final class e extends m00.c {
    public Object A;
    public Object B;
    public final d40.g C;
    public int D;

    public e(d40.g gVar, k00.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.emit((Object) null, this);
    }
}
