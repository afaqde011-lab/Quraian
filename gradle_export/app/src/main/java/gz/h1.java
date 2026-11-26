package gz;

import ri.t1;

public final class h1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m1 C;
    public final String D;

    public h1(m1 m1Var, String str, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m1Var;
        this.D = str;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new h1(this.C, this.D, cVar, 0);
            default:
                return new h1(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((h1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objB;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                m1 m1Var = this.C;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                wo.b0 b0Var = m1Var.n;
                ep.q qVar = ep.q.PURCHASE;
                this.B = 1;
                if (b0Var.n(qVar, this) == aVar) {
                    return aVar;
                }
                ly.d dVar = m1Var.i;
                this.B = 2;
                if (dVar.a(this.D, this) == aVar) {
                    return aVar;
                }
                return g00.b0.a;
            default:
                Object obj2 = l00.a.A;
                int i2 = this.B;
                String str = this.D;
                m1 m1Var2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    m1Var2.i(g1.a((g1) m1Var2.c.d.getValue(), false, null, false, false, false, false, null, true, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, false, false, null, 268432895));
                    ly.d dVar2 = m1Var2.i;
                    this.B = 1;
                    objB = dVar2.b(str, this);
                    if (objB != obj2) {
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                objB = obj;
                String str2 = ((oy.a) objB).b;
                if (str2 == null || r30.k.L0(str2)) {
                    str2 = null;
                }
                obj2 = g00.b0.a;
                if (str2 == null) {
                    m1.k(m1Var2);
                } else {
                    ab.a0.A0(m1Var2, new n0(str2, str));
                    m1Var2.o();
                }
                return obj2;
        }
    }
}
