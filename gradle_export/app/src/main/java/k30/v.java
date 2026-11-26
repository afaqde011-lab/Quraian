package k30;

public abstract class v implements e {
    public final u00.k a;
    public final String b;

    public v(String str, u00.k kVar) {
        this.a = kVar;
        this.b = "must return ".concat(str);
    }

    @Override
    public final boolean a(z10.e eVar) {
        return kotlin.jvm.internal.m.a(eVar.H, this.a.invoke(u20.d.e(eVar)));
    }

    @Override
    public final String b(z10.e eVar) {
        return a.a.J(this, eVar);
    }

    @Override
    public final String getDescription() {
        return this.b;
    }
}
