package bv;

public final class j2 extends m00.i implements u00.q {
    public boolean A;
    public String B;
    public Integer C;
    public boolean D;

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.A;
        String str = this.B;
        Integer num = this.C;
        boolean z2 = this.D;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return new ru.e(z, str, num, z2);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        j2 j2Var = new j2(5, (k00.c) obj5);
        j2Var.A = zBooleanValue;
        j2Var.B = (String) obj2;
        j2Var.C = (Integer) obj3;
        j2Var.D = zBooleanValue2;
        return j2Var.invokeSuspend(g00.b0.a);
    }
}
