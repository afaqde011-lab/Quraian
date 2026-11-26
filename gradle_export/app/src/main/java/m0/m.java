package m0;

import l1.f1;
import ri.t1;
import z.b1;

public final class m extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final w C;

    public m(w wVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = wVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m(this.C, cVar, 0);
            case 1:
                return new m(this.C, cVar, 1);
            default:
                return new m(this.C, cVar, 2);
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
        Object objF;
        Object objF2;
        int i10 = this.A;
        w wVar = this.C;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                this.B = 1;
                float f3 = z.f10409a;
                if (((f1) wVar.f10388d.B).h() - 1 < 0 || (objF = wVar.f(((f1) wVar.f10388d.B).h() - 1, x.c.v(0.0f, 0.0f, null, 7), this)) != aVar) {
                    objF = b0Var;
                }
                return objF == aVar ? aVar : b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                this.B = 1;
                float f10 = z.f10409a;
                if (((f1) wVar.f10388d.B).h() + 1 >= wVar.l() || (objF2 = wVar.f(((f1) wVar.f10388d.B).h() + 1, x.c.v(0.0f, 0.0f, null, 7), this)) != aVar2) {
                    objF2 = b0Var;
                }
                return objF2 == aVar2 ? aVar2 : b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                this.B = 1;
                b1 b1Var = b1.A;
                br.c cVar = new br.c(2, (k00.c) null, 2);
                wVar.getClass();
                Object objQ = w.q(wVar, b1Var, cVar, this);
                if (objQ != aVar3) {
                    objQ = b0Var;
                }
                return objQ == aVar3 ? aVar3 : b0Var;
        }
    }
}
