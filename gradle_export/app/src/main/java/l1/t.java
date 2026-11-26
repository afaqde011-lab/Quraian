package l1;

public final class t extends p1 {

    public final int f9928b = 1;

    public final Object f9929c;

    public t(u00.a aVar) {
        super(aVar);
        c cVar = c.G;
        this.f9929c = cVar;
    }

    public t(u00.k kVar) {
        super(new h.e(10));
        this.f9929c = new u(kVar);
    }

    @Override
    public final q1 a(Object obj) {
        switch (this.f9928b) {
            case 0:
                return new q1(this, obj, obj == null, null, true);
            default:
                return new q1(this, obj, obj == null, (k2) this.f9929c, true);
        }
    }

    @Override
    public s2 b() {
        switch (this.f9928b) {
            case 0:
                return (u) this.f9929c;
            default:
                return super.b();
        }
    }
}
