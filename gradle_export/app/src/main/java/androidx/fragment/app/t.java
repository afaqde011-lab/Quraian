package androidx.fragment.app;

public final class t implements Runnable {
    public final int A;
    public final Object B;

    public t(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                x xVar = (x) this.B;
                xVar.mOnDismissListener.onDismiss(xVar.mDialog);
                break;
            case 1:
                s sVar = (s) this.B;
                if (!sVar.f817b.isEmpty()) {
                    sVar.e();
                }
                break;
            default:
                ((i1) this.B).z(true);
                break;
        }
    }
}
