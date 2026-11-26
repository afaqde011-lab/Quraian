package i40;

public final class d extends m00.c {
    public e A;
    public Object B;
    public final e C;
    public int D;

    public d(e eVar, m00.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(this);
    }
}
