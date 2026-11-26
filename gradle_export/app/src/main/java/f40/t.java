package f40;

public final class t implements k00.g {
    public final Object A;
    public final ThreadLocal B;
    public final u C;

    public t(Object obj, ThreadLocal threadLocal) {
        this.A = obj;
        this.B = threadLocal;
        this.C = new u(threadLocal);
    }

    public final void b(Object obj) {
        this.B.set(obj);
    }

    public final Object c(k00.i iVar) {
        ThreadLocal threadLocal = this.B;
        Object obj = threadLocal.get();
        threadLocal.set(this.A);
        return obj;
    }

    @Override
    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override
    public final k00.g get(k00.h hVar) {
        if (this.C.equals(hVar)) {
            return this;
        }
        return null;
    }

    @Override
    public final k00.h getKey() {
        return this.C;
    }

    @Override
    public final k00.i minusKey(k00.h hVar) {
        return this.C.equals(hVar) ? k00.j.A : this;
    }

    @Override
    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.A + ", threadLocal = " + this.B + ')';
    }
}
