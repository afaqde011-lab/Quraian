package dn;

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
        return this.B.a(null, 0.0f, null, this);
    }
}
