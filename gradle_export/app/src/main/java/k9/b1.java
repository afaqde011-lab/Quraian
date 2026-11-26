package k9;

import android.os.Looper;
import java.util.Objects;

public final class b1 implements c1, i2 {
    public final a4 A;
    public final androidx.media3.common.b1 B;

    public b1(a4 a4Var, androidx.media3.common.b1 b1Var) {
        this.A = a4Var;
        this.B = b1Var;
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z1Var.d(i10, this.A, this.B);
    }

    @Override
    public void g(t0 t0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        u uVar = t0Var.f9438a;
        if (t0Var.isConnected()) {
            androidx.media3.common.b1 b1Var = t0Var.f9459x;
            androidx.media3.common.b1 b1Var2 = this.B;
            boolean zEquals = Objects.equals(b1Var, b1Var2);
            a4 a4Var = t0Var.f9458w;
            a4 a4Var2 = this.A;
            boolean zEquals2 = Objects.equals(a4Var, a4Var2);
            if (zEquals && zEquals2) {
                return;
            }
            t0Var.f9458w = a4Var2;
            if (zEquals) {
                z10 = false;
            } else {
                t0Var.f9459x = b1Var2;
                androidx.media3.common.b1 b1Var3 = t0Var.f9461z;
                androidx.media3.common.b1 b1VarH = t0.h(b1Var2, t0Var.f9460y);
                t0Var.f9461z = b1VarH;
                z10 = !b1VarH.equals(b1Var3);
            }
            if (!zEquals2 || z10) {
                fh.d2 d2Var = t0Var.f9456u;
                fh.d2 d2Var2 = t0Var.f9457v;
                fh.d2 d2VarC = t0.C(t0Var.f9455t, t0Var.f9454s, a4Var2, t0Var.f9461z, t0Var.J);
                t0Var.f9456u = d2VarC;
                t0Var.f9457v = t0.B(d2VarC, t0Var.f9454s, t0Var.J, a4Var2, t0Var.f9461z);
                z11 = !t0Var.f9456u.equals(d2Var);
                z12 = !t0Var.f9457v.equals(d2Var2);
            } else {
                z11 = false;
                z12 = false;
            }
            if (z10) {
                t0Var.f9446i.f(13, new b0(t0Var, 0));
            }
            if (!zEquals2) {
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                uVar.f9522e.i();
            }
            if (z12) {
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                uVar.f9522e.getClass();
            }
            if (z11) {
                uVar.getClass();
                ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                uVar.f9522e.o();
            }
        }
    }
}
