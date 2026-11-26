package k9;

import android.os.Looper;
import java.util.Objects;

public final class a1 implements c1, i2 {
    public final androidx.media3.common.b1 A;

    public a1(androidx.media3.common.b1 b1Var) {
        this.A = b1Var;
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z1Var.s(i10, this.A);
    }

    @Override
    public void g(t0 t0Var) {
        boolean z10;
        boolean z11;
        u uVar = t0Var.f9438a;
        if (t0Var.isConnected()) {
            androidx.media3.common.b1 b1Var = t0Var.f9460y;
            androidx.media3.common.b1 b1Var2 = this.A;
            if (Objects.equals(b1Var, b1Var2)) {
                return;
            }
            t0Var.f9460y = b1Var2;
            androidx.media3.common.b1 b1Var3 = t0Var.f9461z;
            androidx.media3.common.b1 b1VarH = t0.h(t0Var.f9459x, b1Var2);
            t0Var.f9461z = b1VarH;
            if (b1VarH.equals(b1Var3)) {
                z10 = false;
                z11 = false;
            } else {
                fh.d2 d2Var = t0Var.f9456u;
                fh.d2 d2Var2 = t0Var.f9457v;
                fh.d2 d2VarC = t0.C(t0Var.f9455t, t0Var.f9454s, t0Var.f9458w, t0Var.f9461z, t0Var.J);
                t0Var.f9456u = d2VarC;
                t0Var.f9457v = t0.B(d2VarC, t0Var.f9454s, t0Var.J, t0Var.f9458w, t0Var.f9461z);
                z10 = !t0Var.f9456u.equals(d2Var);
                z11 = !t0Var.f9457v.equals(d2Var2);
                t0Var.f9446i.f(13, new b0(t0Var, 1));
            }
            if (z11) {
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                uVar.f9522e.getClass();
            }
            if (z10) {
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                uVar.f9522e.o();
            }
        }
    }
}
