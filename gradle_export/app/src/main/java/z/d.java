package z;

public final class d extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final f0.i C;
    public final f0.k D;

    public d(f0.i iVar, f0.k kVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = iVar;
        this.D = kVar;
    }

    public d(f0.k kVar, f0.i iVar, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.D = kVar;
        this.C = iVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d(this.D, this.C, cVar);
            case 1:
                return new d(this.C, this.D, cVar, 1);
            default:
                return new d(this.C, this.D, cVar, 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
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
                    f0.l lVar = new f0.l(this.D);
                    this.B = 1;
                    if (this.C.a(lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.a(this.D, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.a(this.D, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
