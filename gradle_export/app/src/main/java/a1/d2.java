package a1;

import d0.f3;

public final class d2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final b1.e0 C;
    public final v2.v D;

    public d2(b1.e0 e0Var, v2.v vVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = e0Var;
        this.D = vVar;
    }

    public d2(v2.v vVar, b1.e0 e0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.D = vVar;
        this.C = e0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d2(this.C, this.D, cVar, 0);
            case 1:
                return new d2(this.C, this.D, cVar, 1);
            case 2:
                return new d2(this.C, this.D, cVar, 2);
            case 3:
                return new d2(this.D, this.C, cVar);
            default:
                return new d2(this.C, this.D, cVar, 4);
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
            case 3:
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
                    this.B = 1;
                    if (this.C.i(this.D, this) == aVar) {
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
                    if (this.C.i(this.D, this) == aVar2) {
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
                    this.B = 1;
                    if (b1.e0.a(this.C, this.D, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    b1.s sVar = new b1.s(this.C, 0);
                    this.B = 1;
                    if (f3.d(this.D, null, sVar, this, 7) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.i(this.D, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
