package d0;

public final class j3 extends m00.c {
    public Object A;
    public final k3 B;
    public int C;

    public j3(k3 k3Var, m00.c cVar) {
        super(cVar);
        this.B = k3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return k3.c(this.B, null, null, this);
    }
}
