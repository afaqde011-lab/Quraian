package q0;

public final class l extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final n1 C;

    public l(n1 n1Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = n1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l(this.C, cVar, 0);
            default:
                return new l(this.C, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((g00.b0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    n1 n1Var = this.C;
                    Object objI = d40.o.i(new d40.d(n1Var.f12670e, true), new l(n1Var, null, 1), this);
                    if (objI != aVar) {
                        objI = b0Var;
                    }
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (a40.c0.l(1500L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                this.C.f12667b.Z0(-1);
                return g00.b0.a;
        }
    }
}
