package d6;

public final class s extends m00.c {
    public Object A;
    public final t B;
    public int C;

    public s(t tVar, m00.c cVar) {
        super(cVar);
        this.B = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.Z(null, this);
        return l00.a.A;
    }
}
