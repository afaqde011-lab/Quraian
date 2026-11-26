package l1;

public final class m2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final u00.n D;
    public final z0 E;

    public m2(u00.n nVar, z0 z0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = nVar;
        this.E = z0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                m2 m2Var = new m2(this.D, this.E, cVar, 0);
                m2Var.C = obj;
                return m2Var;
            case 1:
                m2 m2Var2 = new m2(this.D, this.E, cVar, 1);
                m2Var2.C = obj;
                return m2Var2;
            case 2:
                m2 m2Var3 = new m2(this.D, this.E, cVar, 2);
                m2Var3.C = obj;
                return m2Var3;
            default:
                m2 m2Var4 = new m2(this.D, this.E, cVar, 3);
                m2Var4.C = obj;
                return m2Var4;
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
                    o1 o1Var = new o1(this.E, ((a40.z) this.C).A());
                    this.B = 1;
                    if (this.D.invoke(o1Var, this) == aVar) {
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
                    o1 o1Var2 = new o1(this.E, ((a40.z) this.C).A());
                    this.B = 1;
                    if (this.D.invoke(o1Var2, this) == aVar2) {
                        return aVar2;
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
                    o1 o1Var3 = new o1(this.E, ((a40.z) this.C).A());
                    this.B = 1;
                    if (this.D.invoke(o1Var3, this) == aVar3) {
                        return aVar3;
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
                    o1 o1Var4 = new o1(this.E, ((a40.z) this.C).A());
                    this.B = 1;
                    if (this.D.invoke(o1Var4, this) == aVar4) {
                        return aVar4;
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
