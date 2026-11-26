package hx;

import a40.m0;
import bt.y1;
import d40.u0;
import ri.t1;

public final class y extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e0 C;

    public y(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y(this.C, cVar, 0);
            case 1:
                return new y(this.C, cVar, 1);
            case 2:
                return new y(this.C, cVar, 2);
            case 3:
                return new y(this.C, cVar, 3);
            case 4:
                return new y(this.C, cVar, 4);
            case 5:
                return new y(this.C, cVar, 5);
            case 6:
                return new y(this.C, cVar, 6);
            default:
                return new y(this.C, cVar, 7);
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
        }
        return ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    t1.O(obj);
                    xw.d dVar = this.C.e;
                    this.B = 1;
                    Object objUpdateData = dVar.b.updateData(new br.c(2, null, 6), this);
                    if (objUpdateData != aVar) {
                        objUpdateData = b0Var;
                    }
                    if (objUpdateData == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (e0.j(this.C, false, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    e0 e0Var = this.C;
                    k00.c cVar = null;
                    d40.i iVarV = d40.o.v(d40.o.l(e0Var.f.c, ((ut.p) e0Var.g).k(), e0Var.d.f(), new b0(4, cVar, 0)), m0.a);
                    c0 c0Var = new c0(e0Var, cVar, 0);
                    this.B = 1;
                    if (d40.o.i(iVarV, c0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    e0 e0Var2 = this.C;
                    d40.i iVarV2 = d40.o.v(d40.o.l(e0Var2.d.f(), e0Var2.h.c, e0Var2.e.g, new d0(4, null, 0)), m0.a);
                    c0 c0Var2 = new c0(e0Var2, null, 1);
                    this.B = 1;
                    if (d40.o.i(iVarV2, c0Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    e0 e0Var3 = this.C;
                    y1 y1Var = e0Var3.h.c;
                    c0 c0Var3 = new c0(e0Var3, null, 2);
                    this.B = 1;
                    if (d40.o.i(y1Var, c0Var3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    e0 e0Var4 = this.C;
                    d40.i iVarV3 = d40.o.v(new u0(e0Var4.d.f(), e0Var4.e.f, new hw.h(3, null, 1)), m0.a);
                    c0 c0Var4 = new c0(e0Var4, null, 3);
                    this.B = 1;
                    if (d40.o.i(iVarV3, c0Var4, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    t1.O(obj);
                    e0 e0Var5 = this.C;
                    e0Var5.i(x.a((x) e0Var5.c.d.getValue(), true, false, false, null, false, false, null, null, null, false, null, null, 16382));
                    this.B = 1;
                    if (e0.j(e0Var5, true, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar8 = l00.a.A;
                int i8 = this.B;
                if (i8 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (e0.j(this.C, true, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
