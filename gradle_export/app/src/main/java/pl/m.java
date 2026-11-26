package pl;

import a40.z;
import fy.t;
import g00.b0;
import l1.p2;
import l1.y0;
import l1.z0;
import ri.t1;
import z1.s;

public final class m extends m00.i implements u00.n {
    public int A;
    public final boolean B;
    public final z0 C;
    public final p2 D;
    public final z1.p E;
    public final float F;
    public final s G;
    public final y0 H;

    public m(boolean z, z0 z0Var, p2 p2Var, z1.p pVar, float f, s sVar, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.C = z0Var;
        this.D = p2Var;
        this.E = pVar;
        this.F = f;
        this.G = sVar;
        this.H = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new m(this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        t tVar;
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            if (!this.B || ((Boolean) this.C.getValue()).booleanValue() || ((String) this.D.getValue()).length() == 0) {
                return b0.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        do {
            tVar = new t(this.E, this.F, this.G, this.H, 3);
            this.A = 1;
        } while (l1.q.u(getContext()).b0(tVar, this) != aVar);
        return aVar;
    }
}
