package uz;

public final class c extends m00.c {
    public sz.a A;
    public Object B;
    public final f C;
    public int D;

    public c(f fVar, m00.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.g(null, this);
    }
}
