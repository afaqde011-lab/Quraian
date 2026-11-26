package uu;

public final class i extends m00.c {
    public Object A;
    public final a1.c B;
    public int C;

    public i(a1.c cVar, k00.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b((ru.a) null, this);
    }
}
