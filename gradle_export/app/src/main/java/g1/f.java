package g1;

public final class f extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final h C;
    public final float D;
    public final x.i E;

    public f(h hVar, float f3, x.i iVar, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.C = hVar;
        this.D = f3;
        this.E = iVar;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f(this.C, this.D, (x.b1) this.E, cVar, 0);
            default:
                return new f(this.C, this.D, this.E, cVar, 1);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
        }
        return create(cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                x.b bVar = this.C.f5812f;
                Float f3 = new Float(this.D);
                x.b1 b1Var = (x.b1) this.E;
                this.B = 1;
                Object objC = x.b.c(bVar, f3, b1Var, null, this, 12);
                return objC == aVar ? aVar : objC;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                x.b bVar2 = this.C.f5812f;
                Float f10 = new Float(this.D);
                this.B = 1;
                Object objC2 = x.b.c(bVar2, f10, this.E, null, this, 12);
                return objC2 == aVar2 ? aVar2 : objC2;
        }
    }
}
