package g1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

public final class s4 implements PointerInputEventHandler {

    public final int f5959a;

    public final u00.a f5960b;

    public s4(int i10, u00.a aVar) {
        this.f5959a = i10;
        this.f5960b = aVar;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.f5959a) {
            case 0:
                Object objD = d0.f3.d(vVar, null, new ca.q(6, this.f5960b), cVar, 7);
                return objD == l00.a.A ? objD : g00.b0.a;
            case 1:
                Object objD2 = d0.f3.d(vVar, null, new ca.q(16, this.f5960b), cVar, 7);
                return objD2 == l00.a.A ? objD2 : g00.b0.a;
            default:
                v2.j0 j0Var = (v2.j0) vVar;
                Object objE = d0.g3.e(j0Var, new zk.e(j0Var.c() * zk.f.a, this.f5960b, (k00.c) null), cVar);
                return objE == l00.a.A ? objE : g00.b0.a;
        }
    }
}
