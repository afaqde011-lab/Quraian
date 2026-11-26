package z4;

import android.view.WindowInsetsController;

public final class k1 extends s10.w0 {
    public final boolean l() {
        return (((WindowInsetsController) ((s10.w0) this).B).getSystemBarsAppearance() & 8) != 0;
    }

    public final void s(boolean z10) {
        ((WindowInsetsController) ((s10.w0) this).B).setSystemBarsAppearance(z10 ? 16 : 0, 16);
    }

    public final void t(boolean z10) {
        ((WindowInsetsController) ((s10.w0) this).B).setSystemBarsAppearance(z10 ? 8 : 0, 8);
    }

    public final void u() {
        ((WindowInsetsController) ((s10.w0) this).B).setSystemBarsBehavior(2);
    }
}
