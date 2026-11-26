package k9;

public final class m2 implements s2 {
    public final int A;
    public final t2 B;
    public final int C;

    public m2(t2 t2Var, int i10, int i11) {
        this.A = i11;
        this.B = t2Var;
        this.C = i10;
    }

    @Override
    public final void a(a2 a2Var) {
        switch (this.A) {
            case 0:
                this.B.f9463f.f9430t.setRepeatMode(p.s(this.C));
                break;
            default:
                this.B.f9463f.f9430t.setShuffleModeEnabled(p.u(this.C));
                break;
        }
    }
}
