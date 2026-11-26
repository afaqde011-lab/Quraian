package d0;

public final class j2 extends m00.i implements u00.n {
    public Object A;
    public final long B;

    public j2(long j9, k00.c cVar) {
        super(2, cVar);
        this.B = j9;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        j2 j2Var = new j2(this.B, cVar);
        j2Var.A = obj;
        return j2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j2 j2VarCreate = create((s2) obj, (k00.c) obj2);
        g00.b0 b0Var = g00.b0.a;
        j2VarCreate.invokeSuspend(b0Var);
        return b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        u2 u2Var = ((s2) this.A).f4508a;
        u2Var.c(u2Var.f4522k, this.B, 1);
        return g00.b0.a;
    }
}
