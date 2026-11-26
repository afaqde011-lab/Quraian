package d6;

public final class d0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final m00.i D;

    public d0(u00.n nVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        switch (i10) {
            case 1:
                this.D = (m00.i) nVar;
                super(2, cVar);
                break;
            default:
                this.D = (m00.i) nVar;
                break;
        }
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                d0 d0Var = new d0(this.D, cVar, 0);
                d0Var.C = obj;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.D, cVar, 1);
                d0Var2.C = obj;
                return d0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((t5.b) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    a40.z zVar = (a40.z) this.C;
                    this.B = 1;
                    if (this.D.invoke(zVar, this) == aVar) {
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
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t5.b bVar = (t5.b) this.C;
                    ri.t1.O(obj);
                    return bVar;
                }
                ri.t1.O(obj);
                t5.b bVarG = ((t5.b) this.C).g();
                this.C = bVarG;
                this.B = 1;
                return this.D.invoke(bVarG, this) == aVar2 ? aVar2 : bVarG;
        }
    }
}
