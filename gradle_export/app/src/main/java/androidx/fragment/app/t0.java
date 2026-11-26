package androidx.fragment.app;

import android.os.Handler;

public abstract class t0 extends r0 {
    public final o0 A;
    public final o0 B;
    public final Handler C;
    public final j1 D;

    public t0(o0 o0Var) {
        Handler handler = new Handler();
        this.A = o0Var;
        this.B = o0Var;
        this.C = handler;
        this.D = new j1();
    }
}
