package d0;

public final class c3 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final u00.o C;
    public final t1 D;
    public final v2.s E;

    public c3(u00.o oVar, t1 t1Var, v2.s sVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = oVar;
        this.D = t1Var;
        this.E = sVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c3(this.C, this.D, this.E, cVar, 0);
            default:
                return new c3(this.C, this.D, this.E, cVar, 1);
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
                    h2.b bVar = new h2.b(this.E.f15401c);
                    this.B = 1;
                    if (this.C.invoke(this.D, bVar, this) == aVar) {
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
                    h2.b bVar2 = new h2.b(this.E.f15401c);
                    this.B = 1;
                    if (this.C.invoke(this.D, bVar2, this) == aVar2) {
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
