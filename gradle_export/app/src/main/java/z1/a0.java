package z1;

public abstract class a0 implements z {
    public final v1.a A = new v1.a(0);

    public final boolean f(int i10) {
        return (this.A.get() & i10) != 0;
    }

    public final void g(int i10) {
        v1.a aVar;
        int i11;
        do {
            aVar = this.A;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }
}
