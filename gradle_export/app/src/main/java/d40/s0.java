package d40;

import ri.t1;

public final class s0 extends m00.i implements u00.o {
    public final int A = 0;
    public int B;
    public j C;
    public Object[] D;
    public final m00.i E;

    public s0(k00.c cVar, u00.p pVar) {
        super(3, cVar);
        this.E = (m00.i) pVar;
    }

    public s0(k00.c cVar, u00.q qVar) {
        super(3, cVar);
        this.E = (m00.i) qVar;
    }

    public s0(k00.c cVar, u00.r rVar) {
        super(3, cVar);
        this.E = (m00.i) rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        Object[] objArr = (Object[]) obj2;
        k00.c cVar = (k00.c) obj3;
        switch (this.A) {
            case 0:
                s0 s0Var = new s0(cVar, (u00.p) this.E);
                s0Var.C = jVar;
                s0Var.D = objArr;
                return s0Var.invokeSuspend(g00.b0.a);
            case 1:
                s0 s0Var2 = new s0(cVar, (u00.q) this.E);
                s0Var2.C = jVar;
                s0Var2.D = objArr;
                return s0Var2.invokeSuspend(g00.b0.a);
            default:
                s0 s0Var3 = new s0(cVar, (u00.r) this.E);
                s0Var3.C = jVar;
                s0Var3.D = objArr;
                return s0Var3.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        j jVar3;
        s0 s0Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i != 0) {
                    if (i == 1) {
                        jVar = this.C;
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                jVar = this.C;
                Object[] objArr = this.D;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.C = jVar;
                this.B = 1;
                obj = this.E.invoke(obj2, obj3, obj4, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.C = null;
                this.B = 2;
                if (jVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 == 1) {
                        jVar2 = this.C;
                        t1.O(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                jVar2 = this.C;
                Object[] objArr2 = this.D;
                Object obj5 = objArr2[0];
                Object obj6 = objArr2[1];
                Object obj7 = objArr2[2];
                Object obj8 = objArr2[3];
                this.C = jVar2;
                this.B = 1;
                obj = this.E.t(obj5, obj6, obj7, obj8, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.C = null;
                this.B = 2;
                if (jVar2.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return g00.b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 == 1) {
                        jVar3 = this.C;
                        t1.O(obj);
                        s0Var = this;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                jVar3 = this.C;
                Object[] objArr3 = this.D;
                Object obj9 = objArr3[0];
                Object obj10 = objArr3[1];
                Object obj11 = objArr3[2];
                Object obj12 = objArr3[3];
                Object obj13 = objArr3[4];
                this.C = jVar3;
                this.B = 1;
                obj = this.E.o(obj9, obj10, obj11, obj12, obj13, this);
                s0Var = this;
                if (obj == aVar3) {
                    return aVar3;
                }
                s0Var.C = null;
                s0Var.B = 2;
                if (jVar3.emit(obj, s0Var) == aVar3) {
                    return aVar3;
                }
                return g00.b0.a;
        }
    }
}
