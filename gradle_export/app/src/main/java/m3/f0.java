package m3;

public final class f0 implements y1.j {
    public final u00.n A;
    public final u00.k B;

    public f0(u00.n nVar, u00.k kVar) {
        this.A = nVar;
        this.B = kVar;
    }

    @Override
    public final Object c(y1.b bVar, Object obj) {
        return this.A.invoke(bVar, obj);
    }

    @Override
    public final Object f(Object obj) {
        return this.B.invoke(obj);
    }
}
