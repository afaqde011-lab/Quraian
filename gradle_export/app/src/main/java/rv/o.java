package rv;

public final class o extends m00.c {
    public int A;
    public Object B;
    public final p C;
    public int D;

    public o(p pVar, m00.c cVar) {
        super(cVar);
        this.C = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.g(null, this);
    }
}
