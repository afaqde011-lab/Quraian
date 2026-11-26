package x;

public final class j1 {

    public final r1 f16305a;

    public final l1.i1 f16306b = l1.q.z(null);

    public final n1 f16307c;

    public j1(n1 n1Var, r1 r1Var, String str) {
        this.f16307c = n1Var;
        this.f16305a = r1Var;
    }

    public final i1 a(u00.k kVar, u00.k kVar2) {
        l1.i1 i1Var = this.f16306b;
        i1 i1Var2 = (i1) i1Var.getValue();
        n1 n1Var = this.f16307c;
        if (i1Var2 == null) {
            Object objInvoke = kVar2.invoke(n1Var.f16323a.J0());
            Object objInvoke2 = kVar2.invoke(n1Var.f16323a.J0());
            r1 r1Var = this.f16305a;
            o oVar = (o) r1Var.f16363a.invoke(objInvoke2);
            oVar.d();
            m1 m1Var = new m1(n1Var, objInvoke, oVar, r1Var);
            i1Var2 = new i1(this, m1Var, kVar, kVar2);
            i1Var.setValue(i1Var2);
            n1Var.f16331i.add(m1Var);
        }
        i1Var2.C = (kotlin.jvm.internal.n) kVar2;
        i1Var2.B = kVar;
        i1Var2.a(n1Var.f());
        return i1Var2;
    }
}
