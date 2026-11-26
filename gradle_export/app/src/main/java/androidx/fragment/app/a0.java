package androidx.fragment.app;

public final class a0 implements Runnable {
    public final int A;
    public final j0 B;

    public a0(j0 j0Var, int i10) {
        this.A = i10;
        this.B = j0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.startPostponedEnterTransition();
                break;
            default:
                this.B.callStartTransitionListener(false);
                break;
        }
    }
}
