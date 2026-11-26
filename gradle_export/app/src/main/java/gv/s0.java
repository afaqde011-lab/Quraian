package gv;

public final class s0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final u00.k C;
    public final float D;

    public s0(u00.k kVar, float f, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = kVar;
        this.D = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new s0(this.C, this.D, cVar, 0);
            default:
                return new s0(this.C, this.D, cVar, 1);
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
        return ((s0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    this.C.invoke(new bv.h(this.D));
                    this.B = 1;
                    if (b40.e.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    this.C.invoke(new bv.g(this.D));
                    this.B = 1;
                    if (b40.e.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
