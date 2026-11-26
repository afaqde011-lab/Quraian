package k9;

public final class r implements Runnable {
    public final int A;
    public final v B;
    public final u C;

    public r(v vVar, u uVar, int i10) {
        this.A = i10;
        this.B = vVar;
        this.C = uVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                v vVar = this.B;
                u uVar = this.C;
                vVar.I = uVar;
                if (vVar.J) {
                    vVar.l(uVar);
                }
                vVar.a(new r(vVar, uVar, 1), new androidx.media3.common.q1(vVar, 2));
                break;
            default:
                v vVar2 = this.B;
                u uVar2 = this.C;
                if (vVar2.A instanceof kh.a) {
                    uVar2.release();
                }
                break;
        }
    }
}
