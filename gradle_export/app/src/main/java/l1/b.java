package l1;

public final class b extends v1.b {

    public a40.k f9827a;

    public u00.k f9828b;

    @Override
    public final void a() {
        this.f9828b = null;
        this.f9827a = null;
    }

    @Override
    public final void b(Throwable th2) {
        a40.k kVar = this.f9827a;
        if (kVar != null) {
            kVar.resumeWith(ri.t1.s(th2));
        }
    }
}
