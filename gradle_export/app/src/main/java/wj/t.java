package wj;

public final class t extends m00.c {
    public Object A;
    public Object B;
    public final p C;
    public int D;

    public t(p pVar, m00.c cVar) {
        super(cVar);
        this.C = pVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
