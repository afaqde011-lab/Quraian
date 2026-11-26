package q0;

public final class a0 implements e1.n {

    public final int f12561a;

    public final b1.e0 f12562b;

    public a0(b1.e0 e0Var, int i10) {
        this.f12561a = i10;
        this.f12562b = e0Var;
    }

    @Override
    public final long a() {
        switch (this.f12561a) {
            case 0:
                return this.f12562b.j(true).f1935b;
            case 1:
                return this.f12562b.p(true, true).f1935b;
            default:
                return this.f12562b.p(false, true).f1935b;
        }
    }
}
