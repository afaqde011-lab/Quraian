package d40;

public class e extends e40.d {
    public final m00.i D;

    public e(u00.n nVar, k00.i iVar, int i, c40.a aVar) {
        super(iVar, i, aVar);
        this.D = (m00.i) nVar;
    }

    @Override
    public Object d(c40.t tVar, k00.c cVar) {
        Object objInvoke = this.D.invoke(tVar, cVar);
        return objInvoke == l00.a.A ? objInvoke : g00.b0.a;
    }

    @Override
    public e40.d e(k00.i iVar, int i, c40.a aVar) {
        return new e(this.D, iVar, i, aVar);
    }

    @Override
    public final String toString() {
        return "block[" + this.D + "] -> " + super.toString();
    }
}
