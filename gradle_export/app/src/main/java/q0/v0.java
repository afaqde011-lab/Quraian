package q0;

import d0.g3;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final v2.v C;
    public final r1 D;

    public v0(v2.v vVar, r1 r1Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = vVar;
        this.D = r1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v0(this.C, this.D, cVar, 0);
            case 1:
                return new v0(this.C, this.D, cVar, 1);
            default:
                return new v0(this.C, this.D, cVar, 2);
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
                g00.b0 b0Var = g00.b0.a;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    Object objK = a40.c0.k(new a1.f2(this.C, this.D, null), this);
                    if (objK != aVar) {
                        objK = b0Var;
                    }
                    if (objK == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    Object objE = g3.e(this.C, new d0.v0(this.D, (k00.c) null, 3), this);
                    if (objE != aVar2) {
                        objE = b0Var2;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
            default:
                l00.a aVar3 = l00.a.A;
                int i12 = this.B;
                g00.b0 b0Var3 = g00.b0.a;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    final r1 r1Var = this.D;
                    e1.y yVar = new e1.y(r1Var, 2);
                    final int i13 = 0;
                    u00.a aVar4 = new u00.a() {
                        public final Object invoke() {
                            int i14 = i13;
                            r1 r1Var2 = r1Var;
                            switch (i14) {
                                case 0:
                                    r1Var2.a();
                                    break;
                                default:
                                    r1Var2.onCancel();
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    final int i14 = 1;
                    Object objE2 = d0.i0.e(this.C, yVar, aVar4, new u00.a() {
                        public final Object invoke() {
                            int i15 = i14;
                            r1 r1Var2 = r1Var;
                            switch (i15) {
                                case 0:
                                    r1Var2.a();
                                    break;
                                default:
                                    r1Var2.onCancel();
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, new m3.a(r1Var, 10), this);
                    if (objE2 != aVar3) {
                        objE2 = b0Var3;
                    }
                    if (objE2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var3;
        }
    }
}
