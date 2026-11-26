package ea;

public final class a implements k00.g {
    public final k00.h A;
    public final d0 B;

    public a(k00.h hVar, d0 d0Var) {
        kotlin.jvm.internal.m.e(d0Var, "connectionWrapper");
        this.A = hVar;
        this.B = d0Var;
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.h getKey() {
        return this.A;
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }
}
