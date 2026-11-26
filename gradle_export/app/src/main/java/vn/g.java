package vn;

public final class g extends m00.c {
    public int A;
    public Object B;
    public final o C;
    public int D;

    public g(o oVar, m00.c cVar) {
        super(cVar);
        this.C = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(0, this);
    }
}
