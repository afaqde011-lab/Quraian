package nx;

import ri.t1;

public final class l0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final p0 C;
    public final int D;

    public l0(p0 p0Var, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.C = p0Var;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l0(this.C, this.D, cVar, 0);
            default:
                return new l0(this.C, this.D, cVar, 1);
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
        return ((l0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                xw.k kVar = this.C.e;
                this.B = 1;
                Object objD = kVar.d(this.D, this);
                return objD == aVar ? aVar : objD;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                xw.k kVar2 = this.C.e;
                this.B = 1;
                Object objD2 = kVar2.d(this.D, this);
                return objD2 == aVar2 ? aVar2 : objD2;
        }
    }
}
