package oo;

import bt.y1;
import ri.t1;

public final class c1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final d40.z0 C;
    public final g1 D;

    public c1(d40.z0 z0Var, g1 g1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = z0Var;
        this.D = g1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c1(this.C, this.D, cVar, 0);
            default:
                return new c1(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((c1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    d40.i iVarO = d40.o.o(new dq.k(this.C, 2));
                    a1 a1Var = new a1(this.D, 1);
                    this.B = 1;
                    if (iVarO.collect(a1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    d40.i iVarO2 = d40.o.o(new dq.k(this.C, 3));
                    g1 g1Var = this.D;
                    e40.i iVarA = g1Var.e.a();
                    d40.i iVarA2 = g1Var.i.a();
                    vn.o oVar = (vn.o) g1Var.h;
                    d40.t0 t0VarJ = d40.o.j(iVarO2, iVarA, new d40.u0(iVarA2, new y1(oVar.d.A("audio_story_download"), oVar, 23), new hw.h(3, null, 2)), g1Var.j.c, g1Var.m.k, new d1(g1Var, null));
                    a1 a1Var2 = new a1(g1Var, 2);
                    this.B = 1;
                    if (t0VarJ.collect(a1Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
