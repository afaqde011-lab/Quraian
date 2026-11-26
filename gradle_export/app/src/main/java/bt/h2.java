package bt;

public final class h2 extends m00.i implements u00.o {
    public final int A;
    public int B;
    public Object C;
    public Object D;

    public h2(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    public h2(h1.l lVar, a1.e2 e2Var, k00.c cVar) {
        super(3, cVar);
        this.A = 2;
        this.C = lVar;
        this.D = e2Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                h2 h2Var = new h2(3, (k00.c) obj3, 0);
                h2Var.C = (d40.j) obj;
                h2Var.D = (n2) obj2;
                return h2Var.invokeSuspend(g00.b0.a);
            case 1:
                h2 h2Var2 = new h2(3, (k00.c) obj3, 1);
                h2Var2.C = (d40.j) obj;
                h2Var2.D = (Object[]) obj2;
                return h2Var2.invokeSuspend(g00.b0.a);
            default:
                return new h2((h1.l) this.C, (a1.e2) this.D, (k00.c) obj3).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Integer num;
        db.a aVar;
        db.a aVar2;
        switch (this.A) {
            case 0:
                d40.j jVar = (d40.j) this.C;
                n2 n2Var = (n2) this.D;
                l00.a aVar3 = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    if (n2Var.d) {
                        this.C = jVar;
                        this.D = null;
                        this.B = 1;
                        if (a40.c0.l(1000L, this) == aVar3) {
                            return aVar3;
                        }
                        num = new Integer(0);
                        this.C = null;
                        this.D = null;
                        this.B = 2;
                        if (jVar.emit(num, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        Integer num2 = new Integer(n2Var.b);
                        this.C = null;
                        this.D = null;
                        this.B = 3;
                        if (jVar.emit(num2, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else if (i == 1) {
                    ri.t1.O(obj);
                    num = new Integer(0);
                    this.C = null;
                    this.D = null;
                    this.B = 2;
                    if (jVar.emit(num, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    d40.j jVar2 = (d40.j) this.C;
                    db.a[] aVarArr = (db.c[]) ((Object[]) this.D);
                    int length = aVarArr.length;
                    int i3 = 0;
                    while (true) {
                        aVar = db.a.a;
                        if (i3 < length) {
                            aVar2 = aVarArr[i3];
                            if (kotlin.jvm.internal.m.a(aVar2, aVar)) {
                                i3++;
                            }
                        } else {
                            aVar2 = null;
                        }
                    }
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.B = 1;
                    if (jVar2.emit(aVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    ri.t1.O(obj);
                    h1.k kVar = (h1.k) ((h1.l) this.C).A;
                    a1.e2 e2Var = (a1.e2) this.D;
                    this.B = 1;
                    if (e2Var.invoke(kVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
