package d6;

public final class o extends m00.c {
    public r A;
    public Object B;
    public final r C;
    public int D;

    public o(r rVar, m00.c cVar) {
        super(cVar);
        this.C = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return r.c(this.C, null, null, this);
    }
}
