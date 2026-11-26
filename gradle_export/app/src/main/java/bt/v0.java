package bt;

import g1.m6;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m6 C;
    public final u00.k D;
    public final ep.e E;

    public v0(m6 m6Var, u00.k kVar, ep.e eVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m6Var;
        this.D = kVar;
        this.E = eVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v0(this.C, this.D, this.E, cVar, 0);
            default:
                return new v0(this.C, this.D, this.E, cVar, 1);
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
        return ((v0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                this.D.invoke(new f(this.E));
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                this.D.invoke(new ur.k(this.E));
                return g00.b0.a;
        }
    }
}
