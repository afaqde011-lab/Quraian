package m10;

public final class w extends m implements j10.i0 {
    public static final a10.w[] I;
    public final a0 D;
    public final n20.c E;
    public final d30.i F;
    public final d30.i G;
    public final x20.j H;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(w.class, "fragments", "getFragments()Ljava/util/List;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        I = new a10.w[]{b0Var.h(sVar), a1.b.h(w.class, "empty", "getEmpty()Z", 0, b0Var)};
    }

    public w(a0 a0Var, n20.c fqName, d30.l storageManager) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        n20.d dVar = fqName.a;
        super(k10.g.a, dVar.c() ? n20.d.e : dVar.g());
        this.D = a0Var;
        this.E = fqName;
        this.F = new d30.i(storageManager, new v(this, 0));
        this.G = new d30.i(storageManager, new v(this, 1));
        this.H = new x20.j(storageManager, new v(this, 2));
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.E(this, obj);
    }

    public final boolean equals(Object obj) {
        j10.i0 i0Var = obj instanceof j10.i0 ? (j10.i0) obj : null;
        if (i0Var == null) {
            return false;
        }
        w wVar = (w) i0Var;
        return kotlin.jvm.internal.m.a(this.E, wVar.E) && kotlin.jvm.internal.m.a(this.D, wVar.D);
    }

    public final int hashCode() {
        return this.E.hashCode() + (this.D.hashCode() * 31);
    }

    @Override
    public final j10.k l() {
        n20.c cVar = this.E;
        if (cVar.a.c()) {
            return null;
        }
        return this.D.f0(cVar.b());
    }
}
