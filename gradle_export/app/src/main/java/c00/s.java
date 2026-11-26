package c00;

import a40.z;
import bt.a2;
import g00.b0;
import ri.t1;

public final class s extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final z0.g C;
    public final u00.k D;

    public s(z0.g gVar, u00.k kVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = gVar;
        this.D = kVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new s(this.C, this.D, cVar, 0);
            case 1:
                return new s(this.C, this.D, cVar, 1);
            case 2:
                return new s(this.C, this.D, cVar, 2);
            case 3:
                return new s(this.C, this.D, cVar, 3);
            case 4:
                return new s(this.C, this.D, cVar, 4);
            case 5:
                return new s(this.C, this.D, cVar, 5);
            case 6:
                return new s(this.C, this.D, cVar, 6);
            case 7:
                return new s(this.C, this.D, cVar, 7);
            case 8:
                return new s(this.C, this.D, cVar, 8);
            default:
                return new s(this.C, this.D, cVar, 9);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
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
        }
        return ((s) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    final int i2 = 0;
                    final z0.g gVar = this.C;
                    a2 a2VarJ = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i3 = i2;
                            z0.g gVar2 = gVar;
                            switch (i3) {
                                case 0:
                                    return gVar2.d().C;
                                case 1:
                                    return gVar2.d().C.toString();
                                case 2:
                                    return gVar2.d().C;
                                case 3:
                                    return gVar2.d().C;
                                case 4:
                                    return gVar2.d().C;
                                case 5:
                                    return gVar2.d().C;
                                case 6:
                                    return gVar2.d().C;
                                case 7:
                                    return gVar2.d().C;
                                case 8:
                                    return gVar2.d().C;
                                case 9:
                                    return gVar2.d().C;
                                default:
                                    return gVar2.d().C;
                            }
                        }
                    });
                    r rVar = new r(0, this.D);
                    this.B = 1;
                    if (a2VarJ.collect(rVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    final int i4 = 2;
                    final z0.g gVar2 = this.C;
                    a2 a2VarJ2 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i5 = i4;
                            z0.g gVar3 = gVar2;
                            switch (i5) {
                                case 0:
                                    return gVar3.d().C;
                                case 1:
                                    return gVar3.d().C.toString();
                                case 2:
                                    return gVar3.d().C;
                                case 3:
                                    return gVar3.d().C;
                                case 4:
                                    return gVar3.d().C;
                                case 5:
                                    return gVar3.d().C;
                                case 6:
                                    return gVar3.d().C;
                                case 7:
                                    return gVar3.d().C;
                                case 8:
                                    return gVar3.d().C;
                                case 9:
                                    return gVar3.d().C;
                                default:
                                    return gVar3.d().C;
                            }
                        }
                    });
                    r rVar2 = new r(1, this.D);
                    this.B = 1;
                    if (a2VarJ2.collect(rVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    final int i6 = 3;
                    final z0.g gVar3 = this.C;
                    a2 a2VarJ3 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i7 = i6;
                            z0.g gVar4 = gVar3;
                            switch (i7) {
                                case 0:
                                    return gVar4.d().C;
                                case 1:
                                    return gVar4.d().C.toString();
                                case 2:
                                    return gVar4.d().C;
                                case 3:
                                    return gVar4.d().C;
                                case 4:
                                    return gVar4.d().C;
                                case 5:
                                    return gVar4.d().C;
                                case 6:
                                    return gVar4.d().C;
                                case 7:
                                    return gVar4.d().C;
                                case 8:
                                    return gVar4.d().C;
                                case 9:
                                    return gVar4.d().C;
                                default:
                                    return gVar4.d().C;
                            }
                        }
                    });
                    r rVar3 = new r(2, this.D);
                    this.B = 1;
                    if (a2VarJ3.collect(rVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    t1.O(obj);
                    final int i8 = 4;
                    final z0.g gVar4 = this.C;
                    a2 a2VarJ4 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i9 = i8;
                            z0.g gVar5 = gVar4;
                            switch (i9) {
                                case 0:
                                    return gVar5.d().C;
                                case 1:
                                    return gVar5.d().C.toString();
                                case 2:
                                    return gVar5.d().C;
                                case 3:
                                    return gVar5.d().C;
                                case 4:
                                    return gVar5.d().C;
                                case 5:
                                    return gVar5.d().C;
                                case 6:
                                    return gVar5.d().C;
                                case 7:
                                    return gVar5.d().C;
                                case 8:
                                    return gVar5.d().C;
                                case 9:
                                    return gVar5.d().C;
                                default:
                                    return gVar5.d().C;
                            }
                        }
                    });
                    r rVar4 = new r(3, this.D);
                    this.B = 1;
                    if (a2VarJ4.collect(rVar4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i9 = this.B;
                b0 b0Var = b0.a;
                if (i9 == 0) {
                    t1.O(obj);
                    final int i11 = 5;
                    final z0.g gVar5 = this.C;
                    a2 a2VarJ5 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i12 = i11;
                            z0.g gVar6 = gVar5;
                            switch (i12) {
                                case 0:
                                    return gVar6.d().C;
                                case 1:
                                    return gVar6.d().C.toString();
                                case 2:
                                    return gVar6.d().C;
                                case 3:
                                    return gVar6.d().C;
                                case 4:
                                    return gVar6.d().C;
                                case 5:
                                    return gVar6.d().C;
                                case 6:
                                    return gVar6.d().C;
                                case 7:
                                    return gVar6.d().C;
                                case 8:
                                    return gVar6.d().C;
                                case 9:
                                    return gVar6.d().C;
                                default:
                                    return gVar6.d().C;
                            }
                        }
                    });
                    r rVar5 = new r(4, this.D);
                    this.B = 1;
                    if (a2VarJ5.collect(rVar5, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    final int i13 = 6;
                    final z0.g gVar6 = this.C;
                    a2 a2VarJ6 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i14 = i13;
                            z0.g gVar7 = gVar6;
                            switch (i14) {
                                case 0:
                                    return gVar7.d().C;
                                case 1:
                                    return gVar7.d().C.toString();
                                case 2:
                                    return gVar7.d().C;
                                case 3:
                                    return gVar7.d().C;
                                case 4:
                                    return gVar7.d().C;
                                case 5:
                                    return gVar7.d().C;
                                case 6:
                                    return gVar7.d().C;
                                case 7:
                                    return gVar7.d().C;
                                case 8:
                                    return gVar7.d().C;
                                case 9:
                                    return gVar7.d().C;
                                default:
                                    return gVar7.d().C;
                            }
                        }
                    });
                    r rVar6 = new r(5, this.D);
                    this.B = 1;
                    if (a2VarJ6.collect(rVar6, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    t1.O(obj);
                    final int i15 = 7;
                    final z0.g gVar7 = this.C;
                    a2 a2VarJ7 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i16 = i15;
                            z0.g gVar8 = gVar7;
                            switch (i16) {
                                case 0:
                                    return gVar8.d().C;
                                case 1:
                                    return gVar8.d().C.toString();
                                case 2:
                                    return gVar8.d().C;
                                case 3:
                                    return gVar8.d().C;
                                case 4:
                                    return gVar8.d().C;
                                case 5:
                                    return gVar8.d().C;
                                case 6:
                                    return gVar8.d().C;
                                case 7:
                                    return gVar8.d().C;
                                case 8:
                                    return gVar8.d().C;
                                case 9:
                                    return gVar8.d().C;
                                default:
                                    return gVar8.d().C;
                            }
                        }
                    });
                    r rVar7 = new r(6, this.D);
                    this.B = 1;
                    if (a2VarJ7.collect(rVar7, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 7:
                l00.a aVar8 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    t1.O(obj);
                    final int i17 = 8;
                    final z0.g gVar8 = this.C;
                    a2 a2VarJ8 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i18 = i17;
                            z0.g gVar9 = gVar8;
                            switch (i18) {
                                case 0:
                                    return gVar9.d().C;
                                case 1:
                                    return gVar9.d().C.toString();
                                case 2:
                                    return gVar9.d().C;
                                case 3:
                                    return gVar9.d().C;
                                case 4:
                                    return gVar9.d().C;
                                case 5:
                                    return gVar9.d().C;
                                case 6:
                                    return gVar9.d().C;
                                case 7:
                                    return gVar9.d().C;
                                case 8:
                                    return gVar9.d().C;
                                case 9:
                                    return gVar9.d().C;
                                default:
                                    return gVar9.d().C;
                            }
                        }
                    });
                    r rVar8 = new r(7, this.D);
                    this.B = 1;
                    if (a2VarJ8.collect(rVar8, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 8:
                l00.a aVar9 = l00.a.A;
                int i18 = this.B;
                b0 b0Var2 = b0.a;
                if (i18 == 0) {
                    t1.O(obj);
                    final int i19 = 9;
                    final z0.g gVar9 = this.C;
                    a2 a2VarJ9 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i110 = i19;
                            z0.g gVar10 = gVar9;
                            switch (i110) {
                                case 0:
                                    return gVar10.d().C;
                                case 1:
                                    return gVar10.d().C.toString();
                                case 2:
                                    return gVar10.d().C;
                                case 3:
                                    return gVar10.d().C;
                                case 4:
                                    return gVar10.d().C;
                                case 5:
                                    return gVar10.d().C;
                                case 6:
                                    return gVar10.d().C;
                                case 7:
                                    return gVar10.d().C;
                                case 8:
                                    return gVar10.d().C;
                                case 9:
                                    return gVar10.d().C;
                                default:
                                    return gVar10.d().C;
                            }
                        }
                    });
                    r rVar9 = new r(8, this.D);
                    this.B = 1;
                    if (a2VarJ9.collect(rVar9, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
            default:
                l00.a aVar10 = l00.a.A;
                int i21 = this.B;
                if (i21 == 0) {
                    t1.O(obj);
                    final int i22 = 10;
                    final z0.g gVar10 = this.C;
                    a2 a2VarJ10 = l1.q.J(new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i110 = i22;
                            z0.g gVar11 = gVar10;
                            switch (i110) {
                                case 0:
                                    return gVar11.d().C;
                                case 1:
                                    return gVar11.d().C.toString();
                                case 2:
                                    return gVar11.d().C;
                                case 3:
                                    return gVar11.d().C;
                                case 4:
                                    return gVar11.d().C;
                                case 5:
                                    return gVar11.d().C;
                                case 6:
                                    return gVar11.d().C;
                                case 7:
                                    return gVar11.d().C;
                                case 8:
                                    return gVar11.d().C;
                                case 9:
                                    return gVar11.d().C;
                                default:
                                    return gVar11.d().C;
                            }
                        }
                    });
                    r rVar10 = new r(9, this.D);
                    this.B = 1;
                    if (a2VarJ10.collect(rVar10, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
