package ht;

public final class j extends m00.c {
    public et.b A;
    public Object B;
    public final k C;
    public int D;

    public j(k kVar, m00.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(this);
    }
}
