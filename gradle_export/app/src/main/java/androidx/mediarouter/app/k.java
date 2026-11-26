package androidx.mediarouter.app;

public final class k implements Runnable {
    public final int A;
    public final Object B;

    public k(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                v vVar = (v) this.B;
                vVar.h(true);
                vVar.f1815f0.requestLayout();
                vVar.f1815f0.getViewTreeObserver().addOnGlobalLayoutListener(new j(vVar));
                break;
            default:
                v vVar2 = ((t) this.B).f1809b;
                if (vVar2.f1823n0 != null) {
                    vVar2.f1823n0 = null;
                    if (vVar2.D0) {
                        vVar2.o(vVar2.E0);
                    }
                }
                break;
        }
    }
}
