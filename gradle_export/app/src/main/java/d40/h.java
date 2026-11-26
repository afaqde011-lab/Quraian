package d40;

public final class h implements i {
    public final i A;
    public final u00.k B;
    public final u00.n C;

    public h(i iVar, u00.k kVar, u00.n nVar) {
        this.A = iVar;
        this.B = kVar;
        this.C = nVar;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.A = e40.b.b;
        Object objCollect = this.A.collect(new g(this, zVar, jVar, 0), cVar);
        return objCollect == l00.a.A ? objCollect : g00.b0.a;
    }
}
