package g1;

public final class l4 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x.b C;

    public l4(x.b bVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = bVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l4(this.C, cVar, 0);
            default:
                return new l4(this.C, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    Float f3 = new Float(0.0f);
                    this.B = 1;
                    if (x.b.c(this.C, f3, null, null, this, 14) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    Float f10 = new Float(0.0f);
                    x.b1 b1Var = new x.b1(1.0f, 300.0f, new Float(0.5f));
                    this.B = 1;
                    if (x.b.c(this.C, f10, b1Var, null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
