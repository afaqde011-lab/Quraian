package g1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class n0 implements PointerInputEventHandler {

    public final int f5891a;

    public final o0 f5892b;

    public n0(o0 o0Var, int i10) {
        this.f5891a = i10;
        this.f5892b = o0Var;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.f5891a) {
            case 0:
                o0 o0Var = this.f5892b;
                Object objE = d0.i0.e(vVar, new bw.b(13), new l0(o0Var, 0), new a2.f(17), new a1.y1(o0Var, 14), cVar);
                return objE == l00.a.A ? objE : g00.b0.a;
            default:
                o0 o0Var2 = this.f5892b;
                Object objD = d0.f3.d(vVar, new dq.p(o0Var2, (k00.c) null), new a1.e1(o0Var2, 18), cVar, 3);
                return objD == l00.a.A ? objD : g00.b0.a;
        }
    }
}
