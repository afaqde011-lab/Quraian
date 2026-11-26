package d40;

public final class b extends m00.c {
    public c40.t A;
    public Object B;
    public final c C;
    public int D;

    public b(c cVar, m00.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, this);
    }
}
