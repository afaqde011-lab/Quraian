package zj;

public final class i extends m00.c {
    public j A;
    public Object B;
    public final j C;
    public int D;

    public i(j jVar, m00.c cVar) {
        super(cVar);
        this.C = jVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(this);
    }
}
