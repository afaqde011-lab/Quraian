package d40;

public final class f0 extends m00.c {
    public b1.g A;
    public Object B;
    public int C;
    public final b1.g D;
    public Object E;

    public f0(b1.g gVar, k00.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.C |= Integer.MIN_VALUE;
        return this.D.emit((Object) null, this);
    }
}
