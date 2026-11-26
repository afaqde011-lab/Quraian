package rv;

public final class e extends m00.c {
    public int A;
    public Object B;
    public final i C;
    public int D;

    public e(i iVar, m00.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.g(0, this);
    }
}
