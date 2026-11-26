package bv;

public final class o2 extends m00.i implements u00.q {
    public long A;
    public long B;
    public float C;
    public float D;

    @Override
    public final Object invokeSuspend(Object obj) {
        long j = this.A;
        long j2 = this.B;
        float f = this.C;
        float f2 = this.D;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return new dv.a(j, j2, f, f2);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        float fFloatValue = ((Number) obj3).floatValue();
        float fFloatValue2 = ((Number) obj4).floatValue();
        o2 o2Var = new o2(5, (k00.c) obj5);
        o2Var.A = jLongValue;
        o2Var.B = jLongValue2;
        o2Var.C = fFloatValue;
        o2Var.D = fFloatValue2;
        return o2Var.invokeSuspend(g00.b0.a);
    }
}
