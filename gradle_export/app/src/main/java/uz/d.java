package uz;

public final class d extends m00.c {
    public zz.b A;
    public Object B;
    public final f C;
    public int D;

    public d(f fVar, m00.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(this);
    }
}
