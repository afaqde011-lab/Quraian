package d;

public final class c implements Runnable {
    public final int A;
    public final n B;

    public c(n nVar, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        n nVar = this.B;
        switch (i10) {
            case 0:
                nVar.invalidateMenu();
                break;
            default:
                n.d(nVar);
                break;
        }
    }
}
