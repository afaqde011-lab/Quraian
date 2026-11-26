package d40;

public final class r0 extends m00.c {
    public g A;
    public kotlin.jvm.internal.z B;
    public Object C;
    public final g D;
    public int E;

    public r0(g gVar, k00.c cVar) {
        super(cVar);
        this.D = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.emit(null, this);
    }
}
