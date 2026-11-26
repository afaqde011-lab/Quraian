package ea;

public final class l implements d40.i {
    public final d40.i A;
    public final ca.t B;
    public final boolean C;
    public final u00.k D;

    public l(d40.i iVar, ca.t tVar, boolean z10, u00.k kVar) {
        this.A = iVar;
        this.B = tVar;
        this.C = z10;
        this.D = kVar;
    }

    public final Object collect(d40.j jVar, k00.c cVar) {
        Object objCollect = this.A.collect(new k(jVar, this.B, this.C, this.D), cVar);
        return objCollect == l00.a.A ? objCollect : g00.b0.a;
    }
}
