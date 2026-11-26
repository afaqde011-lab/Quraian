package l1;

public final class o2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final d40.i C;
    public final o1 D;

    public o2(d40.i iVar, o1 o1Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = iVar;
        this.D = o1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new o2(this.C, this.D, cVar, 0);
            case 1:
                return new o2(this.C, this.D, cVar, 1);
            default:
                return new o2(this.C, this.D, cVar, 2);
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
                    n2 n2Var = new n2(this.D, 1);
                    this.B = 1;
                    if (this.C.collect(n2Var, this) == aVar) {
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
                    n2 n2Var2 = new n2(this.D, 3);
                    this.B = 1;
                    if (this.C.collect(n2Var2, this) == aVar2) {
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
                    k00.j jVar = k00.j.A;
                    boolean zEquals = jVar.equals(jVar);
                    o1 o1Var = this.D;
                    d40.i iVar = this.C;
                    if (zEquals) {
                        n2 n2Var3 = new n2(o1Var, 2);
                        this.B = 1;
                        if (iVar.collect(n2Var3, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        o2 o2Var = new o2(iVar, o1Var, null, 1);
                        this.B = 2;
                        if (a40.c0.J(o2Var, jVar, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
