package b1;

import a1.d2;
import ri.t1;

public final class c0 extends m00.i implements u00.n {
    public Object A;
    public final e0 B;
    public final v2.v C;
    public final boolean D;

    public c0(e0 e0Var, v2.v vVar, boolean z10, k00.c cVar) {
        super(2, cVar);
        this.B = e0Var;
        this.C = vVar;
        this.D = z10;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        c0 c0Var = new c0(this.B, this.C, this.D, cVar);
        c0Var.A = obj;
        return c0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        a40.z zVar = (a40.z) this.A;
        a40.a0 a0Var = a40.a0.D;
        e0 e0Var = this.B;
        v2.v vVar = this.C;
        a40.c0.y(zVar, (k00.i) null, a0Var, new d2(e0Var, vVar, null, 4), 1);
        boolean z10 = this.D;
        a40.c0.y(zVar, (k00.i) null, a0Var, new b0(vVar, e0Var, z10, (k00.c) null), 1).f0(new s(e0Var, 1));
        return a40.c0.y(zVar, (k00.i) null, a0Var, new b0(e0Var, vVar, z10, (k00.c) null), 1);
    }
}
