package rn;

public final class c extends m00.c {
    public Object A;
    public final in.c B;
    public int C;

    public c(in.c cVar, m00.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        in.c.j(this.B, null, 0, this);
        return l00.a.A;
    }
}
