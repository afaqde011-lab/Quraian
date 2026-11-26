package h1;

import a40.l1;
import d0.g3;
import g1.k8;
import ri.t1;

public final class q extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final v2.v D;
    public final k8 E;

    public q(v2.v vVar, k8 k8Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = vVar;
        this.E = k8Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                q qVar = new q(this.D, this.E, cVar, 0);
                qVar.C = obj;
                return qVar;
            default:
                q qVar2 = new q(this.D, this.E, cVar, 1);
                qVar2.C = obj;
                return qVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
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
                    t1.O(obj);
                    p pVar = new p((a40.z) this.C, this.E, null);
                    this.B = 1;
                    if (g3.e(this.D, pVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    u00.n l1Var = new l1((a40.z) this.C, this.E, (k00.c) null, 3);
                    this.B = 1;
                    if (((v2.j0) this.D).B1(l1Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
