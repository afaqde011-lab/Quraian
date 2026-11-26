package fy;

import a40.m0;
import bt.f2;
import bt.y0;
import d40.p1;
import d40.u0;
import d40.z0;
import java.util.List;
import ri.t1;

public final class v extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final c0 C;

    public v(c0 c0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = c0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v(this.C, cVar, 0);
            case 1:
                return new v(this.C, cVar, 1);
            case 2:
                return new v(this.C, cVar, 2);
            case 3:
                return new v(this.C, cVar, 3);
            case 4:
                return new v(this.C, cVar, 4);
            case 5:
                return new v(this.C, cVar, 5);
            default:
                return new v(this.C, cVar, 6);
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
        }
        return ((v) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        k00.c cVar = null;
        int i = 1;
        switch (this.A) {
            case 0:
                g00.b0 b0Var = g00.b0.a;
                c0 c0Var = this.C;
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    xx.c cVar2 = c0Var.f;
                    this.B = 1;
                    cVar2.getClass();
                    h40.e eVar = m0.a;
                    Object objJ2 = a40.c0.J(new y0(cVar2, cVar, 14), h40.d.C, this);
                    if (objJ2 != aVar) {
                        objJ2 = b0Var;
                    }
                    if (objJ2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                u uVar = (u) c0Var.c.d.getValue();
                h00.x xVar = h00.x.A;
                c0Var.i(u.a(uVar, null, null, ze.d.E(xVar), ze.d.E(xVar), false, false, null, null, null, 499));
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    c0 c0Var2 = this.C;
                    this.B = 1;
                    if (c0Var2.m(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    c0 c0Var3 = this.C;
                    p1 p1Var = c0Var3.g.c;
                    w wVar = new w(c0Var3, cVar, 0);
                    this.B = 1;
                    if (d40.o.i(p1Var, wVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                c0 c0Var4 = this.C;
                l00.a aVar4 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    u0 u0Var = new u0(c0Var4.d.f(), c0Var4.e.c.c, new f2(c0Var4, cVar, 3));
                    br.c cVar3 = new br.c(2, null, 5);
                    this.B = 1;
                    if (d40.o.i(u0Var, cVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                c0 c0Var5 = this.C;
                l00.a aVar5 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    ut.j jVarK = ((ut.p) c0Var5.h).k();
                    a1.c0 c0Var6 = new a1.c0(c0Var5, (k00.c) null, 18);
                    this.B = 1;
                    if (d40.o.i(jVarK, c0Var6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    t1.O(obj);
                    c0 c0Var7 = this.C;
                    z0 z0Var = c0Var7.i.k;
                    w wVar2 = new w(c0Var7, cVar, i);
                    this.B = 1;
                    if (d40.o.i(z0Var, wVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar7 = l00.a.A;
                int i8 = this.B;
                if (i8 == 0) {
                    t1.O(obj);
                    List list = this.C.q;
                    List list2 = this.C.r;
                    h40.e eVar2 = m0.a;
                    a1.f2 f2Var = new a1.f2(list, list2, this.C, (k00.c) null, 7);
                    this.B = 1;
                    objJ = a40.c0.J(f2Var, eVar2, this);
                    if (objJ == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objJ = obj;
                }
                this.C.t = (cy.i) objJ;
                c0.j(this.C);
                return g00.b0.a;
        }
    }
}
