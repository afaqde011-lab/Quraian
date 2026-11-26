package c3;

public final class f2 implements g3 {

    public u00.a f2669a;

    public l1.i1 f2670b;

    public final l1.i1 f2671c = l1.q.z(Boolean.FALSE);

    public final long a() {
        q1 q1Var;
        if (this.f2670b == null) {
            u00.a aVar = this.f2669a;
            if (aVar == null || (q1Var = (q1) aVar.invoke()) == null) {
                q1Var = q1.f2752c;
            }
            this.f2670b = l1.q.z(q1Var);
            this.f2669a = null;
        }
        l1.i1 i1Var = this.f2670b;
        kotlin.jvm.internal.m.b(i1Var);
        return ((q1) i1Var.getValue()).f2753a;
    }

    public final boolean b() {
        return ((Boolean) this.f2671c.getValue()).booleanValue();
    }
}
