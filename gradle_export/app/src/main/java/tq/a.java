package tq;

public final class a extends m00.c {
    public int A;
    public Object B;
    public final k C;
    public int D;

    public a(k kVar, m00.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(0, this);
    }
}
