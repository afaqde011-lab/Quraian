package h4;

public class f extends e {
    public int m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f6580e = 2;
        } else {
            this.f6580e = 3;
        }
    }

    @Override
    public final void d(int i10) {
        if (this.f6585j) {
            return;
        }
        this.f6585j = true;
        this.f6582g = i10;
        for (d dVar : this.f6586k) {
            dVar.a(dVar);
        }
    }
}
