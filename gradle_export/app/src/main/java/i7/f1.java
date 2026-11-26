package i7;

import android.os.Looper;
import androidx.media3.common.k2;

public final class f1 {

    public final e1 f7294a;

    public final d1 f7295b;

    public final k2 f7296c;

    public int f7297d;

    public Object f7298e;

    public Looper f7299f;

    public int f7300g;

    public long f7301h = -9223372036854775807L;

    public boolean f7302i = true;

    public boolean f7303j;

    public boolean f7304k;

    public f1(d1 d1Var, e1 e1Var, k2 k2Var, int i10, Looper looper) {
        this.f7295b = d1Var;
        this.f7294a = e1Var;
        this.f7296c = k2Var;
        this.f7299f = looper;
        this.f7300g = i10;
    }

    public final synchronized void a(boolean z10) {
        notifyAll();
    }

    public final void b() {
        ta.c0.A(!this.f7303j);
        if (this.f7301h == -9223372036854775807L) {
            ta.c0.s(this.f7302i);
        }
        this.f7303j = true;
        i0 i0Var = (i0) this.f7295b;
        if (!i0Var.f7355j0 && i0Var.J.getThread().isAlive()) {
            i0Var.H.b(14, this).b();
        } else {
            e7.a.m("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
