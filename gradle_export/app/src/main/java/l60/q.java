package l60;

public final class q extends r {
    public final f d;
    public final boolean e;

    public q(a1.b0 b0Var, x40.e eVar, m mVar, f fVar, boolean z) {
        super(b0Var, eVar, mVar);
        this.d = fVar;
        this.e = z;
    }

    @Override
    public final Object a(y yVar, Object[] objArr) {
        d dVar = (d) this.d.a(yVar);
        k00.c cVar = (k00.c) objArr[objArr.length - 1];
        try {
            if (!this.e) {
                return w0.b(dVar, cVar);
            }
            kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return w0.c(dVar, cVar);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
            throw e;
        } catch (Throwable th) {
            w0.q(th, cVar);
            return l00.a.A;
        }
    }
}
