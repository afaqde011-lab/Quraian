package du;

public final class k0 implements d40.j {
    public final am.c A;
    public final boolean B;

    public k0(am.c cVar, boolean z) {
        this.A = cVar;
        this.B = z;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        am.c cVar2 = this.A;
        cVar2.i = kotlin.jvm.internal.m.a((cu.e) obj, cu.b.INSTANCE) && !this.B;
        cVar2.b();
        return g00.b0.a;
    }
}
