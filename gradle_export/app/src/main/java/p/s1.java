package p;

public final class s1 implements Runnable {
    public final int A;
    public final w1 B;

    public s1(w1 w1Var, int i10) {
        this.A = i10;
        this.B = w1Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                j1 j1Var = this.B.C;
                if (j1Var != null) {
                    j1Var.setListSelectionHidden(true);
                    j1Var.requestLayout();
                }
                break;
            default:
                w1 w1Var = this.B;
                j1 j1Var2 = w1Var.C;
                if (j1Var2 != null && j1Var2.isAttachedToWindow() && w1Var.C.getCount() > w1Var.C.getChildCount() && w1Var.C.getChildCount() <= w1Var.M) {
                    w1Var.Z.setInputMethodMode(2);
                    w1Var.show();
                    break;
                }
                break;
        }
    }
}
