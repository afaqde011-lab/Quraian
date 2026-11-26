package k50;

public final class a0 implements i0 {
    public final k A;
    public final i B;
    public d0 C;
    public int D;
    public boolean E;
    public long F;

    public a0(k kVar) {
        this.A = kVar;
        i iVarB = kVar.b();
        this.B = iVarB;
        d0 d0Var = iVarB.A;
        this.C = d0Var;
        this.D = d0Var != null ? d0Var.b : -1;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public final void close() {
        this.E = true;
    }

    @Override
    public final long s(k50.i r9, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: k50.a0.s(k50.i, long):long");
    }
}
