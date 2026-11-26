package bt;

import java.util.List;

public final class d1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final j2 C;

    public d1(int i, j2 j2Var, k00.c cVar) {
        super(2, cVar);
        this.A = i;
        this.C = j2Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d1(0, this.C, cVar);
            case 1:
                return new d1(1, this.C, cVar);
            case 2:
                return new d1(2, this.C, cVar);
            case 3:
                return new d1(3, this.C, cVar);
            case 4:
                return new d1(4, this.C, cVar);
            default:
                return new d1(5, this.C, cVar);
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
        }
        return ((d1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                j2 j2Var = this.C;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    aq.a aVar2 = j2Var.j;
                    this.B = 1;
                    if (aq.a.b(aVar2, true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                if (!((Boolean) ((uu.w) j2Var.i).G.getValue()).booleanValue()) {
                    ((uu.w) j2Var.i).p();
                }
                return g00.b0.a;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                g00.b0 b0Var = g00.b0.a;
                j2 j2Var2 = this.C;
                if (i3 == 0) {
                    ri.t1.O(obj);
                    bx.c cVar = (bx.c) ((uu.w) j2Var2.i).B.getValue();
                    if (cVar != null) {
                        i = cVar.a;
                    } else {
                        d40.u0 u0VarF = j2Var2.d.f();
                        this.B = 1;
                        obj = d40.o.s(u0VarF, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    }
                    ab.a0.A0(j2Var2, new b0(i));
                    return b0Var;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(obj);
                bx.c cVar2 = (bx.c) h00.q.N0((List) obj);
                if (cVar2 != null) {
                    i = cVar2.a;
                    ab.a0.A0(j2Var2, new b0(i));
                }
                return b0Var;
            case 2:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    ri.t1.O(obj);
                    j2 j2Var3 = this.C;
                    d40.z0 z0Var = j2Var3.k.k;
                    d40.i iVar = j2Var3.w;
                    d40.i iVar2 = j2Var3.x;
                    uu.w wVar = (uu.w) j2Var3.i;
                    d40.t0 t0VarJ = d40.o.j(z0Var, iVar, iVar2, new d40.u0(wVar.B, wVar.G, j1.H), j2Var3.u, new as.z0(j2Var3, null, 1));
                    k1 k1Var = new k1(0, j2Var3, null);
                    this.B = 1;
                    if (d40.o.i(t0VarJ, k1Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i5 == 0) {
                    ri.t1.O(obj);
                    j2 j2Var4 = this.C;
                    d40.i iVarO = d40.o.o(j2Var4.k.k);
                    a1.c cVar3 = new a1.c(j2Var4, 6);
                    this.B = 1;
                    Object objCollect = iVarO.collect(new m1(cVar3, 0), this);
                    if (objCollect != aVar5) {
                        objCollect = b0Var2;
                    }
                    if (objCollect == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
            case 4:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    ri.t1.O(obj);
                    j2 j2Var5 = this.C;
                    d40.z0 z0Var2 = new d40.z0(j2Var5.l.c);
                    ab.o oVar = new ab.o(j2Var5, (k00.c) null, 3);
                    this.B = 1;
                    if (d40.o.i(z0Var2, oVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar7 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    ri.t1.O(obj);
                    j2 j2Var6 = this.C;
                    os.x xVar = j2Var6.t;
                    int iB = ((a1) j2Var6.c.d.getValue()).a.b();
                    boolean zK = j2Var6.k.k();
                    this.B = 1;
                    if (xVar.m(iB, zK, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
