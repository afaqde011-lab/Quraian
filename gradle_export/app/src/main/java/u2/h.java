package u2;

public final class h extends m00.c {
    public long A;
    public Object B;
    public final i C;
    public int D;

    public h(i iVar, m00.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.D(0L, this);
    }
}
