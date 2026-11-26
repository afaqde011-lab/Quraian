package nn;

public final class f extends m00.c {
    public String A;
    public Object B;
    public final j C;
    public int D;

    public f(j jVar, m00.c cVar) {
        super(cVar);
        this.C = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, null, this);
    }
}
