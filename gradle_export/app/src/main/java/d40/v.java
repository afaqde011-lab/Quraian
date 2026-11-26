package d40;

public final class v extends m00.c {
    public w A;
    public Object B;
    public final w C;
    public int D;

    public v(w wVar, k00.c cVar) {
        super(cVar);
        this.C = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
