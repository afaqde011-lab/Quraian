package g1;

public final class e4 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final f4 C;
    public final d.b D;

    public e4(f4 f4Var, d.b bVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = f4Var;
        this.D = bVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e4(this.C, this.D, cVar, 0);
            default:
                return new e4(this.C, this.D, cVar, 1);
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
                    x.b bVar = this.C.f5789e;
                    Float f3 = new Float(h1.m.f6522a.b(this.D.f4377c));
                    this.B = 1;
                    if (bVar.f(f3, this) == aVar) {
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
                    x.b bVar2 = this.C.f5789e;
                    Float f10 = new Float(h1.m.f6522a.b(this.D.f4377c));
                    this.B = 1;
                    if (bVar2.f(f10, this) == aVar2) {
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
