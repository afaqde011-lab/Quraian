package m10;

public abstract class c0 extends n implements j10.e0 {
    public final n20.c F;
    public final String G;

    public c0(j10.z module, n20.c fqName) {
        kotlin.jvm.internal.m.e(module, "module");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        n20.d dVar = fqName.a;
        super(module, k10.g.a, dVar.c() ? n20.d.e : dVar.g(), j10.n0.n);
        this.F = fqName;
        this.G = "package " + fqName + " of " + module;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.e(this, obj);
    }

    @Override
    public final j10.z l() {
        j10.k kVarL = super.l();
        kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (j10.z) kVarL;
    }

    @Override
    public j10.n0 o() {
        return j10.n0.n;
    }

    @Override
    public String toString() {
        return this.G;
    }
}
