package m9;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Objects;
import tf.h1;
import tf.i2;
import tf.q0;

public final class b implements Runnable {
    public final int A = 0;
    public boolean B;
    public final Object C;

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.C = aspectRatioFrameLayout;
    }

    public b(i2 i2Var, boolean z10) {
        this.B = z10;
        Objects.requireNonNull(i2Var);
        this.C = i2Var;
    }

    @Override
    public final void run() {
        boolean z10 = false;
        switch (this.A) {
            case 0:
                this.B = false;
                AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) this.C;
                int i10 = AspectRatioFrameLayout.D;
                aspectRatioFrameLayout.getClass();
                break;
            default:
                i2 i2Var = (i2) this.C;
                h1 h1Var = (h1) i2Var.B;
                boolean zA = h1Var.a();
                boolean z11 = h1Var.Y != null && h1Var.Y.booleanValue();
                boolean z12 = this.B;
                h1Var.Y = Boolean.valueOf(z12);
                if (z11 == z12) {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.O.c(Boolean.valueOf(z12), "Default data collection state already set to");
                }
                if (h1Var.a() != zA) {
                    boolean zA2 = h1Var.a();
                    if (h1Var.Y != null && h1Var.Y.booleanValue()) {
                        z10 = true;
                    }
                    if (zA2 != z10) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.L.d("Default data collection is different than actual status", Boolean.valueOf(z12), Boolean.valueOf(zA));
                    }
                } else {
                    q0 q0Var3 = h1Var.F;
                    h1.g(q0Var3);
                    q0Var3.L.d("Default data collection is different than actual status", Boolean.valueOf(z12), Boolean.valueOf(zA));
                }
                i2Var.n1();
                break;
        }
    }
}
