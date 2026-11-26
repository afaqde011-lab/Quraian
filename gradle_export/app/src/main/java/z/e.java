package z;

public final class e extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final f0.i C;
    public final f0.k D;
    public final h E;

    public e(f0.i iVar, f0.k kVar, h hVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = iVar;
        this.D = kVar;
        this.E = hVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e(this.C, this.D, this.E, cVar, 0);
            default:
                return new e(this.C, this.D, this.E, cVar, 1);
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
                f0.k kVar = this.D;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    this.E.f16922f0 = kVar;
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                long j9 = w.f16971a;
                this.B = 1;
                if (a40.c0.l(j9, this) == aVar) {
                    return aVar;
                }
                this.B = 2;
                if (this.C.a(kVar, this) == aVar) {
                    return aVar;
                }
                this.E.f16922f0 = kVar;
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                f0.k kVar2 = this.D;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    this.E.f16918b0 = kVar2;
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                long j10 = w.f16971a;
                this.B = 1;
                if (a40.c0.l(j10, this) == aVar2) {
                    return aVar2;
                }
                this.B = 2;
                if (this.C.a(kVar2, this) == aVar2) {
                    return aVar2;
                }
                this.E.f16918b0 = kVar2;
                return g00.b0.a;
        }
    }
}
