package a1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import d0.g3;

public final class g2 implements PointerInputEventHandler {

    public final int f47a;

    public final Object f48b;

    public g2(Object obj, int i10) {
        this.f47a = i10;
        this.f48b = obj;
    }

    @Override
    public final Object invoke(v2.v vVar, k00.c cVar) {
        switch (this.f47a) {
            case 0:
                Object objK = a40.c0.k(new f2((j2) this.f48b, vVar, null, 0), cVar);
                return objK == l00.a.A ? objK : g00.b0.a;
            case 1:
                Object objB1 = ((v2.j0) vVar).B1(new b1.v((q0.r0) this.f48b, null, 1), cVar);
                return objB1 == l00.a.A ? objB1 : g00.b0.a;
            case 2:
                Object objK2 = a40.c0.k(new f2(vVar, (q0.r1) this.f48b, null), cVar);
                l00.a aVar = l00.a.A;
                g00.b0 b0Var = g00.b0.a;
                if (objK2 != aVar) {
                    objK2 = b0Var;
                }
                return objK2 == aVar ? objK2 : b0Var;
            case 3:
                Object objK3 = a40.c0.k(new g6.a(vVar, (m0.w) this.f48b, null, 16), cVar);
                return objK3 == l00.a.A ? objK3 : g00.b0.a;
            case 4:
                e1.v0 v0Var = (e1.v0) this.f48b;
                Object objO = bi.b.o(vVar, v0Var.A, v0Var.f5038z, cVar);
                return objO == l00.a.A ? objO : g00.b0.a;
            case 5:
                tm.e eVar = (tm.e) this.f48b;
                Object objE = g3.e(vVar, new tm.f(new sm.e(eVar, 11), new l0.g0(eVar, vVar, 23), new sm.b(eVar, 9), new sm.e(eVar, 12), (k00.c) null), cVar);
                l00.a aVar2 = l00.a.A;
                g00.b0 b0Var2 = g00.b0.a;
                if (objE != aVar2) {
                    objE = b0Var2;
                }
                return objE == aVar2 ? objE : b0Var2;
            case 6:
                tm.i iVar = (tm.i) this.f48b;
                Object objE2 = g3.e(vVar, new tm.f(new sm.p(iVar, 3), new m3.a(iVar, 18), new q0.f2(iVar, 4), new sm.p(iVar, 4), (k00.c) null), cVar);
                l00.a aVar3 = l00.a.A;
                g00.b0 b0Var3 = g00.b0.a;
                if (objE2 != aVar3) {
                    objE2 = b0Var3;
                }
                return objE2 == aVar3 ? objE2 : b0Var3;
            case 7:
                Object objE3 = g3.e(vVar, new bv.m1(1, (k00.c) null, new gz.e1(1, (w0.g) this.f48b, w0.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 23)), cVar);
                l00.a aVar4 = l00.a.A;
                g00.b0 b0Var4 = g00.b0.a;
                if (objE3 != aVar4) {
                    objE3 = b0Var4;
                }
                return objE3 == aVar4 ? objE3 : b0Var4;
            case 8:
                Object objE4 = g3.e(vVar, new a40.l1((y0.c) this.f48b, (k00.c) null, 5), cVar);
                return objE4 == l00.a.A ? objE4 : g00.b0.a;
            default:
                Object objE5 = g3.e(vVar, new b1.v((z.j) this.f48b, null, 3), cVar);
                return objE5 == l00.a.A ? objE5 : g00.b0.a;
        }
    }
}
