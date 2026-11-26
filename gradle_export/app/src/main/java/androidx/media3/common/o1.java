package androidx.media3.common;

import android.view.SurfaceView;

public final class o1 implements eh.x {
    public final int A = 1;
    public final b2 B;
    public final Object C;

    public o1(b2 b2Var, SurfaceView surfaceView) {
        this.B = b2Var;
        this.C = surfaceView;
    }

    public o1(c2 c2Var, b2 b2Var) {
        this.C = c2Var;
        this.B = b2Var;
    }

    @Override
    public final Object get() {
        switch (this.A) {
            case 0:
                c2 c2Var = (c2) this.C;
                b2 b2Var = this.B;
                a2 a2VarA = b2Var.a();
                a2VarA.f1070d = 1;
                a2VarA.M = z1.f1691b;
                a2VarA.K = new y1(c2.l(b2Var.G.get(), b2Var, c2Var.window));
                a2VarA.L = b2Var.H;
                a2VarA.f1075i = false;
                return new b2(a2VarA);
            default:
                SurfaceView surfaceView = (SurfaceView) this.C;
                a2 a2VarA2 = this.B.a();
                a2VarA2.f1087w = c2.o(surfaceView.getHolder());
                return new b2(a2VarA2);
        }
    }
}
