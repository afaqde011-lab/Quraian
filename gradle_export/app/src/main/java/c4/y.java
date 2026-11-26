package c4;

public final class y extends kotlin.jvm.internal.n implements u00.a {
    public final kotlin.jvm.internal.y A;
    public final z B;
    public final y3.k C;
    public final long D;
    public final long E;

    public y(kotlin.jvm.internal.y yVar, z zVar, y3.k kVar, long j9, long j10) {
        super(0);
        this.A = yVar;
        this.B = zVar;
        this.C = kVar;
        this.D = j9;
        this.E = j10;
    }

    public final Object invoke() {
        z zVar = this.B;
        this.A.A = zVar.getPositionProvider().f(this.C, this.D, zVar.getParentLayoutDirection(), this.E);
        return g00.b0.a;
    }
}
