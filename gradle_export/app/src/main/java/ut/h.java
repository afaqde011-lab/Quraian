package ut;

public final class h extends m00.c {
    public Object A;
    public int B;
    public final i C;

    public h(i iVar, k00.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
