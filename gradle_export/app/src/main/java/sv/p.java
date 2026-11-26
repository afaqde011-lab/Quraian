package sv;

public final class p extends m00.c {
    public String A;
    public Object B;
    public final p10.a C;
    public int D;

    public p(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.g(null, this);
    }
}
