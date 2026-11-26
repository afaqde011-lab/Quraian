package oi;

public final class o implements Runnable {
    public final int A;
    public final s B;
    public final a30.k C;

    public o(s sVar, a30.k kVar, int i10) {
        this.A = i10;
        this.B = sVar;
        this.C = kVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.a(this.C);
                break;
            default:
                this.B.a(this.C);
                break;
        }
    }
}
