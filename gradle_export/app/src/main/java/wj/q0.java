package wj;

public final class q0 implements yj.b {
    public final int A;
    public final f00.a B;
    public final yj.c C;

    public q0(yj.c cVar, yj.c cVar2, int i10) {
        this.A = i10;
        this.B = cVar;
        this.C = cVar2;
    }

    public final Object get() {
        switch (this.A) {
            case 0:
                return new p0((b1) this.B.get(), (c1) this.C.get());
            default:
                return new zj.j((zj.n) this.B.get(), (zj.n) this.C.get());
        }
    }
}
