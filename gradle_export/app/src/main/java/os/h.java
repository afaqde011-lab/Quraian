package os;

public final class h extends m00.c {
    public ss.v A;
    public Object B;
    public final x C;
    public int D;

    public h(x xVar, m00.c cVar) {
        super(cVar);
        this.C = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(null, this);
    }
}
