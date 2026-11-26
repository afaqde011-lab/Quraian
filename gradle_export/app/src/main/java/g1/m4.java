package g1;

public final class m4 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m6 C;

    public m4(m6 m6Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = m6Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m4(this.C, cVar, 0);
            case 1:
                return new m4(this.C, cVar, 1);
            case 2:
                return new m4(this.C, cVar, 2);
            case 3:
                return new m4(this.C, cVar, 3);
            case 4:
                return new m4(this.C, cVar, 4);
            case 5:
                return new m4(this.C, cVar, 5);
            case 6:
                return new m4(this.C, cVar, 6);
            case 7:
                return new m4(this.C, cVar, 7);
            case 8:
                return new m4(this.C, cVar, 8);
            case 9:
                return new m4(this.C, cVar, 9);
            default:
                return new m4(this.C, cVar, 10);
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
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
                    if (this.C.e(this) == aVar) {
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
                    if (this.C.c(this) == aVar2) {
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
                    if (this.C.f(this) == aVar3) {
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
                    this.B = 1;
                    if (this.C.c(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.b(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.f(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.b(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 7:
                l00.a aVar8 = l00.a.A;
                int i17 = this.B;
                if (i17 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.e(this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 8:
                l00.a aVar9 = l00.a.A;
                int i18 = this.B;
                if (i18 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 9:
                l00.a aVar10 = l00.a.A;
                int i19 = this.B;
                if (i19 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar11 = l00.a.A;
                int i20 = this.B;
                if (i20 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
