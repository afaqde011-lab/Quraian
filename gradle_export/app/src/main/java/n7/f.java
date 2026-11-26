package n7;

public final class f implements Runnable {
    public final int A;
    public final h B;
    public final Object C;

    public f(h hVar, i iVar, int i10) {
        this.A = i10;
        this.B = hVar;
        this.C = iVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                h hVar = this.B;
                this.C.d(hVar.f11168a, hVar.f11169b);
                break;
            default:
                h hVar2 = this.B;
                this.C.i(hVar2.f11168a, hVar2.f11169b);
                break;
        }
    }
}
