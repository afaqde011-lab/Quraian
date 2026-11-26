package jo;

public final class l extends m00.c {
    public boolean A;
    public Object B;
    public final m C;
    public int D;

    public l(m mVar, m00.c cVar) {
        super(cVar);
        this.C = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, false, this);
    }
}
