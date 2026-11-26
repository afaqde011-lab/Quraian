package ur;

import ri.t1;

public final class j1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final r1 C;

    public j1(r1 r1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = r1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j1(this.C, cVar, 0);
            case 1:
                return new j1(this.C, cVar, 1);
            case 2:
                return new j1(this.C, cVar, 2);
            case 3:
                return new j1(this.C, cVar, 3);
            case 4:
                return new j1(this.C, cVar, 4);
            case 5:
                return new j1(this.C, cVar, 5);
            case 6:
                return new j1(this.C, cVar, 6);
            case 7:
                return new j1(this.C, cVar, 7);
            default:
                return new j1(this.C, cVar, 8);
        }
    }

    @Override
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
        }
        return ((j1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                r1 r1Var = this.C;
                if (i == 0) {
                    t1.O(obj);
                    aq.a aVar2 = r1Var.m;
                    this.B = 1;
                    if (aq.a.b(aVar2, true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                if (!((h1) r1Var.c.d.getValue()).k) {
                    ((uu.w) r1Var.d).p();
                }
                return g00.b0.a;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    xv.c cVar = this.C.r;
                    this.B = 1;
                    if (cVar.a(false, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar4 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    r1 r1Var2 = this.C;
                    d40.z0 z0Var = new d40.z0(r1Var2.u.c);
                    m1 m1Var = new m1(r1Var2, null, 1);
                    this.B = 1;
                    if (d40.o.i(z0Var, m1Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar5 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    r1 r1Var3 = this.C;
                    d40.i iVarV = d40.o.v(d40.o.k(r1Var3.G, r1Var3.E, r1Var3.g.c, r1Var3.F, new bt.i1(r1Var3, null, 2)), a40.m0.a);
                    n1 n1Var = new n1(r1Var3, null, 0);
                    this.B = 1;
                    if (d40.o.i(iVarV, n1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar6 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    r1 r1Var4 = this.C;
                    d40.p1 p1Var = r1Var4.k.c;
                    f1 f1Var = new f1(r1Var4, null);
                    this.B = 1;
                    if (d40.o.i(p1Var, f1Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                l00.a aVar7 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    r1 r1Var5 = this.C;
                    d40.y0 y0Var = new d40.y0(r1Var5.f.h);
                    m1 m1Var2 = new m1(r1Var5, null, 2);
                    this.B = 1;
                    if (d40.o.i(y0Var, m1Var2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 6:
                l00.a aVar8 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    t1.O(obj);
                    os.x xVar = this.C.z;
                    this.B = 1;
                    if (xVar.m(7, false, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 7:
                l00.a aVar9 = l00.a.A;
                int i8 = this.B;
                if (i8 == 0) {
                    t1.O(obj);
                    xv.c cVar2 = this.C.r;
                    this.B = 1;
                    if (cVar2.a(true, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar10 = l00.a.A;
                int i9 = this.B;
                r1 r1Var6 = this.C;
                if (i9 == 0) {
                    t1.O(obj);
                    wo.b0 b0Var = r1Var6.t;
                    this.B = 1;
                    if (b0Var.x(this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                r1Var6.s();
                return g00.b0.a;
        }
    }
}
