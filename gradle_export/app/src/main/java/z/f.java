package z;

public final class f extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final h C;
    public final f0.k D;

    public f(h hVar, f0.k kVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = hVar;
        this.D = kVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f(this.C, this.D, cVar, 0);
            case 1:
                return new f(this.C, this.D, cVar, 1);
            case 2:
                return new f(this.C, this.D, cVar, 2);
            default:
                return new f(this.C, this.D, cVar, 3);
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
            case 2:
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
                    f0.i iVar = this.C.Q;
                    if (iVar != null) {
                        f0.j jVar = new f0.j(this.D);
                        this.B = 1;
                        if (iVar.a(jVar, this) == aVar) {
                            return aVar;
                        }
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
                    f0.i iVar2 = this.C.Q;
                    if (iVar2 != null) {
                        f0.j jVar2 = new f0.j(this.D);
                        this.B = 1;
                        if (iVar2.a(jVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    f0.i iVar3 = this.C.Q;
                    if (iVar3 != null) {
                        this.B = 1;
                        if (iVar3.a(this.D, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar4 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    f0.i iVar4 = this.C.Q;
                    if (iVar4 != null) {
                        f0.l lVar = new f0.l(this.D);
                        this.B = 1;
                        if (iVar4.a(lVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
