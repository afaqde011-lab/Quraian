package q0;

import bv.d3;

public final class x1 extends m00.i implements u00.o {
    public int A;
    public d0.t1 B;
    public long C;
    public final a40.z D;
    public final l1.z0 E;
    public final f0.i F;

    public x1(a40.z zVar, l1.z0 z0Var, f0.i iVar, k00.c cVar) {
        super(3, cVar);
        this.D = zVar;
        this.E = z0Var;
        this.F = iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9 = ((h2.b) obj2).f6544a;
        l1.z0 z0Var = this.E;
        f0.i iVar = this.F;
        x1 x1Var = new x1(this.D, z0Var, iVar, (k00.c) obj3);
        x1Var.B = (d0.t1) obj;
        x1Var.C = j9;
        return x1Var.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        a40.z zVar = this.D;
        if (i10 == 0) {
            ri.t1.O(obj);
            d0.t1 t1Var = this.B;
            a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new b1.w(this.E, this.C, this.F, (k00.c) null, 8), 3);
            this.A = 1;
            obj = t1Var.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d3(this.E, ((Boolean) obj).booleanValue(), this.F, (k00.c) null), 3);
        return g00.b0.a;
    }
}
