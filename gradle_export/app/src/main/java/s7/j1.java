package s7;

public final class j1 implements a1 {
    public final a1 A;
    public final long B;

    public j1(a1 a1Var, long j9) {
        this.A = a1Var;
        this.B = j9;
    }

    @Override
    public final void a() {
        this.A.a();
    }

    @Override
    public final boolean b() {
        return this.A.b();
    }

    @Override
    public final int l(long j9) {
        return this.A.l(j9 - this.B);
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        int iN = this.A.n(bVar, eVar, i10);
        if (iN == -4) {
            eVar.G += this.B;
        }
        return iN;
    }
}
