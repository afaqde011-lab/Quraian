package pl;

import a40.z;
import fy.t;
import g00.b0;
import l1.y0;
import l1.z0;
import ri.t1;

public final class e extends m00.i implements u00.n {
    public int A;
    public final boolean B;
    public final z0 C;
    public final z0 D;
    public final z1.p E;
    public final float F;
    public final y0 G;

    public e(boolean z, z0 z0Var, z0 z0Var2, z1.p pVar, float f, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.C = z0Var;
        this.D = z0Var2;
        this.E = pVar;
        this.F = f;
        this.G = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new e(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        t tVar;
        l00.a aVar = l00.a.A;
        int i = this.A;
        z0 z0Var = this.D;
        if (i == 0) {
            t1.O(obj);
            if (!this.B || ((Boolean) this.C.getValue()).booleanValue() || y3.l.b(((y3.l) z0Var.getValue()).a, 0L)) {
                return b0.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        do {
            tVar = new t(this.E, this.F, z0Var, this.G, 2);
            this.A = 1;
        } while (l1.q.u(getContext()).b0(tVar, this) != aVar);
        return aVar;
    }
}
