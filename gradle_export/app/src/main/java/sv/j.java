package sv;

public final class j extends m00.c {
    public int A;
    public Object B;
    public final th.o C;
    public int D;

    public j(th.o oVar, m00.c cVar) {
        super(cVar);
        this.C = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.L((String) null, this);
    }
}
