package d40;

public final class u0 implements i {
    public final i A;
    public final i B;
    public final u00.o C;

    public u0(i iVar, i iVar2, u00.o oVar) {
        this.A = iVar;
        this.B = iVar2;
        this.C = oVar;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) {
        Object objA = e40.b.a(jVar, cVar, v0.A, new g0(this.C, (k00.c) null, 1), new i[]{this.A, this.B});
        return objA == l00.a.A ? objA : g00.b0.a;
    }
}
