package e40;

public final class l implements k00.i {
    public final k00.i A;
    public final Throwable B;

    public l(Throwable th, k00.i iVar) {
        this.A = iVar;
        this.B = th;
    }

    @Override
    public final Object fold(Object obj, u00.n nVar) {
        return this.A.fold(obj, nVar);
    }

    @Override
    public final k00.g get(k00.h hVar) {
        return this.A.get(hVar);
    }

    @Override
    public final k00.i minusKey(k00.h hVar) {
        return this.A.minusKey(hVar);
    }

    @Override
    public final k00.i plus(k00.i iVar) {
        return this.A.plus(iVar);
    }
}
