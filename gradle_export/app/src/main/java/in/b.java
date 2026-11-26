package in;

public final class b extends m00.c {
    public Object A;
    public final c B;
    public int C;

    public b(c cVar, m00.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        c.i(this.B, null, 0, this);
        return l00.a.A;
    }
}
