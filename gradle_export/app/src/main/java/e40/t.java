package e40;

public final class t implements k00.c, m00.d {
    public final k00.c A;
    public final k00.i B;

    public t(k00.c cVar, k00.i iVar) {
        this.A = cVar;
        this.B = iVar;
    }

    @Override
    public final m00.d getCallerFrame() {
        k00.c cVar = this.A;
        if (cVar instanceof m00.d) {
            return (m00.d) cVar;
        }
        return null;
    }

    @Override
    public final k00.i getContext() {
        return this.B;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.A.resumeWith(obj);
    }
}
