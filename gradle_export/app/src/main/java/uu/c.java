package uu;

public final class c extends m00.c {
    public int A;
    public Object B;
    public final w C;
    public int D;

    public c(w wVar, m00.c cVar) {
        super(cVar);
        this.C = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(0, 0, this);
    }
}
