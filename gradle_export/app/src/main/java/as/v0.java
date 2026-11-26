package as;

import ri.t1;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final b1 C;
    public final yt.a D;

    public v0(b1 b1Var, yt.a aVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = b1Var;
        this.D = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v0(this.C, this.D, cVar, 0);
            default:
                return new v0(this.C, this.D, cVar, 1);
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
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    t1.O(obj);
                    zt.a aVar2 = this.C.i;
                    this.B = 1;
                    ((ut.p) aVar2).b(this.D, this);
                    if (b0Var == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                xw.k kVar = this.C.e;
                int i3 = this.D.b;
                this.B = 1;
                Object objD = kVar.d(i3, this);
                return objD == aVar3 ? aVar3 : objD;
        }
    }
}
