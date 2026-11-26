package tf;

import android.os.Bundle;

public final class b2 implements Runnable {
    public final String A;
    public final String B;
    public final long C;
    public final Bundle D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final i2 H;

    public b2(i2 i2Var, String str, String str2, long j9, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.A = str;
        this.B = str2;
        this.C = j9;
        this.D = bundle;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = i2Var;
    }

    @Override
    public final void run() {
        this.H.e1(this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }
}
