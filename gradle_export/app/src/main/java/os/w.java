package os;

public final class w extends m00.c {
    public int A;
    public Object B;
    public final x C;
    public int D;

    public w(x xVar, m00.c cVar) {
        super(cVar);
        this.C = xVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.w(0, this);
    }
}
