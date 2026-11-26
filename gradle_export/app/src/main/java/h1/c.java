package h1;

import g1.k6;
import g1.m6;
import ri.t1;

public final class c extends m00.i implements u00.p {
    public int A;
    public j B;
    public n0 C;
    public Object D;
    public final fc.n E;
    public final float F;

    public c(fc.n nVar, float f3, k00.c cVar) {
        super(4, cVar);
        this.E = nVar;
        this.F = f3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.E, this.F, (k00.c) obj4);
        cVar.B = (j) obj;
        cVar.C = (n0) obj2;
        cVar.D = obj3;
        return cVar.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            t1.O(obj);
            j jVar = this.B;
            float fD = this.C.d(this.D);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                fc.n nVar = this.E;
                float fH = Float.isNaN(((l1.e1) nVar.f5635j).h()) ? 0.0f : ((l1.e1) nVar.f5635j).h();
                wVar.A = fH;
                x.i iVar = ((m6) ((g1.l0) nVar.f5628c).B).f5886c;
                k6 k6Var = new k6(jVar, wVar, 1);
                this.B = null;
                this.C = null;
                this.A = 1;
                if (x.c.d(fH, fD, this.F, iVar, k6Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return g00.b0.a;
    }
}
