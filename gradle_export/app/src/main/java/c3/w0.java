package c3;

import android.view.Choreographer;
import java.util.ArrayList;

public final class w0 implements l1.q0 {
    public final int A;
    public final Object B;
    public final Object C;

    public w0(Choreographer choreographer, u0 u0Var) {
        this.A = 0;
        this.B = choreographer;
        this.C = u0Var;
    }

    public w0(l1.q0 q0Var) {
        this.A = 2;
        this.B = q0Var;
        this.C = new c7.c(2);
    }

    public w0(u00.a aVar) {
        this.A = 1;
        this.B = aVar;
        this.C = new ce.c(16);
    }

    @Override
    public final Object b0(u00.k kVar, k00.c cVar) {
        l1.j1 j1Var;
        boolean z10;
        Object objQ;
        switch (this.A) {
            case 0:
                u0 u0Var = (u0) this.C;
                a40.k kVar2 = new a40.k(1, qd.s0.j0(cVar));
                kVar2.r();
                v0 v0Var = new v0(kVar2, this, kVar);
                if (kotlin.jvm.internal.m.a(u0Var.C, (Choreographer) this.B)) {
                    synchronized (u0Var.E) {
                        u0Var.G.add(v0Var);
                        if (!u0Var.J) {
                            u0Var.J = true;
                            u0Var.C.postFrameCallback(u0Var.K);
                        }
                        break;
                    }
                    kVar2.u(new b2.v(u0Var, v0Var, 4));
                } else {
                    ((Choreographer) this.B).postFrameCallback(v0Var);
                    kVar2.u(new b2.v(this, v0Var, 5));
                }
                Object objQ2 = kVar2.q();
                l00.a aVar = l00.a.A;
                return objQ2;
            case 1:
                a40.k kVar3 = new a40.k(1, qd.s0.j0(cVar));
                kVar3.r();
                ce.c cVar2 = (ce.c) this.C;
                l1.b bVar = new l1.b();
                bVar.f9827a = kVar3;
                bVar.f9828b = kVar;
                kVar3.u(new a20.d(cVar2.p(bVar, (u00.a) this.B), 19));
                Object objQ3 = kVar3.q();
                l00.a aVar2 = l00.a.A;
                return objQ3;
            default:
                if (cVar instanceof l1.j1) {
                    j1Var = (l1.j1) cVar;
                    int i10 = j1Var.D;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        j1Var.D = i10 - Integer.MIN_VALUE;
                    } else {
                        j1Var = new l1.j1(this, cVar);
                    }
                } else {
                    j1Var = new l1.j1(this, cVar);
                }
                Object obj = j1Var.B;
                l00.a aVar3 = l00.a.A;
                int i11 = j1Var.D;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    c7.c cVar3 = (c7.c) this.C;
                    j1Var.A = kVar;
                    j1Var.D = 1;
                    synchronized (cVar3.B) {
                        z10 = cVar3.A;
                    }
                    if (z10) {
                        objQ = g00.b0.a;
                    } else {
                        a40.k kVar4 = new a40.k(1, qd.s0.j0(j1Var));
                        kVar4.r();
                        synchronized (cVar3.B) {
                            ((ArrayList) cVar3.C).add(kVar4);
                        }
                        kVar4.u(new a1.v2(cVar3, kVar4, 23));
                        objQ = kVar4.q();
                        if (objQ != aVar3) {
                            objQ = g00.b0.a;
                        }
                    }
                    if (objQ != aVar3) {
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                kVar = j1Var.A;
                ri.t1.O(obj);
                l1.q0 q0Var = (l1.q0) this.B;
                j1Var.A = null;
                j1Var.D = 2;
                Object objB0 = q0Var.b0(kVar, j1Var);
                if (objB0 != aVar3) {
                    return objB0;
                }
                return aVar3;
        }
    }

    public final Object fold(Object obj, u00.n nVar) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return rd.a.C(this, hVar);
    }

    public final k00.i minusKey(k00.h hVar) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return rd.a.P(this, iVar);
    }
}
