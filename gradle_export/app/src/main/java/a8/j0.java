package a8;

public final class j0 extends x {

    public final d0 f280b;

    public final i0 f281c;

    public j0(i0 i0Var, d0 d0Var, d0 d0Var2) {
        super(d0Var);
        this.f281c = i0Var;
        this.f280b = d0Var2;
    }

    @Override
    public final c0 d(long j9) {
        c0 c0VarD = this.f280b.d(j9);
        e0 e0Var = c0VarD.f236a;
        long j10 = e0Var.f253a;
        long j11 = e0Var.f254b;
        long j12 = this.f281c.B;
        e0 e0Var2 = new e0(j10, j11 + j12);
        e0 e0Var3 = c0VarD.f237b;
        return new c0(e0Var2, new e0(e0Var3.f253a, e0Var3.f254b + j12));
    }
}
