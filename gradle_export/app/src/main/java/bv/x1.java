package bv;

public final class x1 extends m00.i implements u00.n {
    public long A;

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        x1 x1Var = new x1(2, cVar);
        x1Var.A = ((Number) obj).longValue();
        return x1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create(Long.valueOf(((Number) obj).longValue()), (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        long j = this.A;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return Boolean.valueOf(j > 0);
    }
}
