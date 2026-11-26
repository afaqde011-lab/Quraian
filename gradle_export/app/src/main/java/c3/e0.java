package c3;

import android.view.accessibility.AccessibilityEvent;

public final class e0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final f0 B;

    public e0(f0 f0Var, int i10) {
        super(1);
        this.A = i10;
        this.B = f0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                f0 f0Var = this.B;
                return Boolean.valueOf(f0Var.D.getParent().requestSendAccessibilityEvent(f0Var.D, (AccessibilityEvent) obj));
            default:
                r2 r2Var = (r2) obj;
                if (r2Var.B.contains(r2Var)) {
                    f0 f0Var2 = this.B;
                    b3.b2 snapshotObserver = f0Var2.D.getSnapshotObserver();
                    snapshotObserver.f2003a.d(r2Var, f0Var2.f2668m0, new b3.k0(r2Var, f0Var2, 5));
                }
                return g00.b0.a;
        }
    }
}
