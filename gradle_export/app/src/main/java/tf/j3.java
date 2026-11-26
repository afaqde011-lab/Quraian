package tf;

import android.os.Looper;
import android.os.SystemClock;

public final class j3 extends d0 {
    public com.google.android.gms.internal.cast.a3 D;
    public boolean E;
    public final o9.q F;
    public final s7.w0 G;
    public final s10.w0 H;

    public j3(h1 h1Var) {
        super(h1Var);
        this.E = true;
        this.F = new o9.q(this, 20);
        s7.w0 w0Var = new s7.w0();
        w0Var.D = this;
        h1 h1Var2 = (h1) this.B;
        w0Var.C = new i3(w0Var, h1Var2, 0);
        h1Var2.K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        w0Var.A = jElapsedRealtime;
        w0Var.B = jElapsedRealtime;
        this.G = w0Var;
        this.H = new s10.w0(this, 6);
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void Z0() {
        V0();
        if (this.D == null) {
            this.D = new com.google.android.gms.internal.cast.a3(Looper.getMainLooper(), 1);
        }
    }
}
