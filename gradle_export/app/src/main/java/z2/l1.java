package z2;

public abstract class l1 {
    public int A;
    public int B;
    public long C;
    public long D = n1.f17143a;
    public long E = 0;

    public l1() {
        long j9 = 0;
        this.C = (j9 & 4294967295L) | (j9 << 32);
    }

    public Object U() {
        return null;
    }

    public int i0() {
        return (int) (this.C & 4294967295L);
    }

    public int j0() {
        return (int) (this.C >> 32);
    }

    public final void l0() {
        this.A = ab.a0.y((int) (this.C >> 32), y3.a.j(this.D), y3.a.h(this.D));
        int iY = ab.a0.y((int) (this.C & 4294967295L), y3.a.i(this.D), y3.a.g(this.D));
        this.B = iY;
        int i10 = this.A;
        long j9 = this.C;
        this.E = (((long) ((i10 - ((int) (j9 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iY - ((int) (j9 & 4294967295L))) / 2)));
    }

    public void q0(long j9, float f3, l2.b bVar) {
        r0(j9, f3, null);
    }

    public abstract void r0(long j9, float f3, u00.k kVar);

    public final void v0(long j9) {
        if (y3.l.b(this.C, j9)) {
            return;
        }
        this.C = j9;
        l0();
    }

    public final void x0(long j9) {
        if (y3.a.b(this.D, j9)) {
            return;
        }
        this.D = j9;
        l0();
    }
}
