package gz;

import ri.t1;

public final class j1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m1 C;

    public j1(m1 m1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j1(this.C, cVar, 0);
            case 1:
                return new j1(this.C, cVar, 1);
            case 2:
                return new j1(this.C, cVar, 2);
            default:
                return new j1(this.C, cVar, 3);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((j1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    m1 m1Var = this.C;
                    d40.z0 z0Var = new d40.z0(m1Var.o.c);
                    i1 i1Var = new i1(m1Var, null, 0);
                    this.B = 1;
                    if (d40.o.i(z0Var, i1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    m1 m1Var2 = this.C;
                    vp.x xVar = m1Var2.h;
                    d40.u0 u0Var = new d40.u0(xVar.k, xVar.c, new k1(m1Var2, null));
                    c1 c1Var = new c1(m1Var2, null, 1);
                    this.B = 1;
                    if (d40.o.i(u0Var, c1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                m1 m1Var3 = this.C;
                if (i3 == 0) {
                    t1.O(obj);
                    m1Var3.i(g1.a((g1) m1Var3.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, true, false, false, null, null, false, false, null, 266797055));
                    wo.b0 b0Var = m1Var3.n;
                    this.B = 1;
                    if (b0Var.w(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                m1Var3.r.signedOut();
                m1Var3.i(g1.a((g1) m1Var3.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, false, "", "", false, false, null, 207618047));
                return g00.b0.a;
            default:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                m1 m1Var4 = this.C;
                if (i4 == 0) {
                    t1.O(obj);
                    m1Var4.i(g1.a((g1) m1Var4.c.d.getValue(), false, null, false, false, false, false, null, false, false, false, false, false, false, null, false, false, false, false, false, false, true, null, null, false, false, null, 264241151));
                    wo.b0 b0Var2 = m1Var4.n;
                    this.B = 1;
                    if (b0Var2.x(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                m1Var4.r();
                return g00.b0.a;
        }
    }
}
