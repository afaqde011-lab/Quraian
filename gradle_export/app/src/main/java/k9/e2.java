package k9;

public final class e2 implements Runnable {
    public final int A;
    public final s1 B;

    public e2(s1 s1Var, int i10) {
        this.A = i10;
        this.B = s1Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                s1 s1Var = this.B;
                h2 h2Var = s1Var.f9432v;
                if (h2Var != null) {
                    s1Var.f9430t.removeListener(h2Var);
                }
                break;
            case 1:
                s1 s1Var2 = this.B;
                gi.c cVar = s1Var2.f9433w;
                if (cVar != null) {
                    ((h1) cVar.B).g(s1Var2.f9423k);
                }
                break;
            case 2:
                s1.a(this.B);
                break;
            default:
                this.B.G();
                break;
        }
    }
}
