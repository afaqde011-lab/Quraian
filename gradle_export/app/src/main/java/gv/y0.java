package gv;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.f3;

public final class y0 implements PointerInputEventHandler {
    public final float a;
    public final boolean b;
    public final z00.a c;
    public final float d;
    public final l1.z0 e;
    public final l1.z0 f;

    public y0(float f, boolean z, z00.a aVar, float f2, l1.z0 z0Var, l1.z0 z0Var2) {
        this.a = f;
        this.b = z;
        this.c = aVar;
        this.d = f2;
        this.e = z0Var;
        this.f = z0Var2;
    }

    public final Object invoke(v2.v vVar, k00.c cVar) {
        Object objD = f3.d(vVar, (u00.o) null, new x0(this.a, this.b, this.c, this.d, this.e, this.f), cVar, 7);
        return objD == l00.a.A ? objD : g00.b0.a;
    }
}
