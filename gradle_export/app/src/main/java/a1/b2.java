package a1;

import kotlin.KotlinNothingValueException;

public final class b2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final j2 C;

    public b2(j2 j2Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = j2Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b2(this.C, cVar, 0);
            case 1:
                return new b2(this.C, cVar, 1);
            case 2:
                return new b2(this.C, cVar, 2);
            case 3:
                return new b2(this.C, cVar, 3);
            case 4:
                return new b2(this.C, cVar, 4);
            default:
                return new b2(this.C, cVar, 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 1:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 2:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 3:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 4:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            default:
                create(zVar, cVar).invokeSuspend(g00.b0.a);
                return l00.a.A;
        }
    }

    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        switch (this.A) {
            case 0:
                g00.b0 b0Var = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    b1.e0 e0Var = this.C.S;
                    this.B = 1;
                    e0Var.e(true, this);
                    if (b0Var2 == b0Var) {
                        return b0Var;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
            case 1:
                g00.b0 b0Var3 = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var4 = g00.b0.a;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    b1.e0 e0Var2 = this.C.S;
                    this.B = 1;
                    e0Var2.f(this);
                    if (b0Var4 == b0Var3) {
                        return b0Var3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var4;
            case 2:
                l00.a aVar = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    b1.e0 e0Var3 = this.C.S;
                    this.B = 1;
                    if (e0Var3.s(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar2 = l00.a.A;
                int i13 = this.B;
                g00.b0 b0Var5 = g00.b0.a;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    j2 j2Var = this.C;
                    Object objCollect = new bt.a2(new bt.t1(l1.q.J(new w1(j2Var, 0)), 11), 2).collect(new c(j2Var, 3), this);
                    if (objCollect != aVar2) {
                        objCollect = b0Var5;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var5;
            case 4:
                l00.a aVar3 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    b1.e0 e0Var4 = this.C.S;
                    this.B = 1;
                    if (e0Var4.y(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar4 = l00.a.A;
                int i15 = this.B;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw b.t(obj);
                }
                ri.t1.O(obj);
                j2 j2Var2 = this.C;
                d dVar = new d(j2Var2, null, 6);
                this.B = 1;
                c3.q2.a(j2Var2, dVar, this);
                return aVar4;
        }
    }
}
