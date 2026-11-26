package j0;

public final class s extends m00.c {
    public Object A;
    public final v B;
    public int C;

    public s(v vVar, k00.c cVar) {
        super(cVar);
        this.B = vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.f(0, this);
    }
}
