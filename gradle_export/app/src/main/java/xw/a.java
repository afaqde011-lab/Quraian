package xw;

public final class a extends m00.c {
    public int A;
    public Object B;
    public final d C;
    public int D;

    public a(d dVar, m00.c cVar) {
        super(cVar);
        this.C = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(0, this);
    }
}
