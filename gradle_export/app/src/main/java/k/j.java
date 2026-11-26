package k;

public final class j implements g.b {

    public final k f8412a;

    public j(k kVar) {
        this.f8412a = kVar;
    }

    @Override
    public final void a(d.n nVar) {
        k kVar = this.f8412a;
        p delegate = kVar.getDelegate();
        delegate.a();
        kVar.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
