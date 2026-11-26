package k9;

public final class k2 implements s2 {
    public final int A;
    public final t2 B;
    public final long C;

    public k2(t2 t2Var, long j9, int i10) {
        this.A = i10;
        this.B = t2Var;
        this.C = j9;
    }

    @Override
    public final void a(a2 a2Var) {
        switch (this.A) {
            case 0:
                this.B.f9463f.f9430t.seekToDefaultPosition((int) this.C);
                break;
            default:
                this.B.f9463f.f9430t.seekTo(this.C);
                break;
        }
    }
}
