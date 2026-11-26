package l0;

import l1.p2;

public final class q0 implements p2 {
    public final int A;
    public final int B;
    public final l1.i1 C;
    public int D;

    public q0(int i10, int i11, int i12) {
        this.A = i11;
        this.B = i12;
        int i13 = (i10 / i11) * i11;
        this.C = new l1.i1(ab.a0.I0(Math.max(i13 - i12, 0), i13 + i11 + i12), l1.c.G);
        this.D = i10;
    }

    public final void a(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            int i11 = this.A;
            int i12 = (i10 / i11) * i11;
            int i13 = this.B;
            this.C.setValue(ab.a0.I0(Math.max(i12 - i13, 0), i12 + i11 + i13));
        }
    }

    @Override
    public final Object getValue() {
        return (z00.e) this.C.getValue();
    }
}
