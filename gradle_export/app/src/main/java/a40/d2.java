package a40;

public final class d2 implements k00.g, k00.h {
    public static final d2 A = new d2();

    @Override
    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override
    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    @Override
    public final k00.h getKey() {
        return this;
    }

    @Override
    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    @Override
    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }
}
