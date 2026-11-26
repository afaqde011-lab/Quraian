package l1;

public final class x implements y1 {
    public final u00.k A;
    public y B;

    public x(u00.k kVar) {
        this.A = kVar;
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
        y yVar = this.B;
        if (yVar != null) {
            yVar.dispose();
        }
        this.B = null;
    }

    @Override
    public final void d() {
        this.B = (y) this.A.invoke(q.f9907b);
    }
}
