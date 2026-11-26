package er;

public final class e extends m00.c {
    public j40.c A;
    public Object B;
    public final j C;
    public int D;

    public e(j jVar, m00.c cVar) {
        super(cVar);
        this.C = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
