package qo;

import a40.m0;
import bt.a2;
import bt.y1;
import d40.z0;
import g00.b0;
import ri.t1;

public final class v extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final y C;

    public v(y yVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = yVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v(this.C, cVar, 0);
            default:
                return new v(this.C, cVar, 1);
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
        return ((v) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    y yVar = this.C;
                    vn.o oVar = (vn.o) yVar.i;
                    oVar.getClass();
                    a2 a2Var = new a2(new rm.c(oVar, null, 18));
                    u uVar = new u(yVar, 0);
                    this.B = 1;
                    if (a2Var.collect(uVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    y yVar2 = this.C;
                    y1 y1Var = new y1(yVar2.e.a(), yVar2, 16);
                    d40.i iVarO = d40.o.o(new dq.k(new z0(((no.n) yVar2.f).r), 4));
                    d40.i iVarA = yVar2.j.a();
                    vn.o oVar2 = (vn.o) yVar2.i;
                    d40.i iVarV = d40.o.v(d40.o.j(y1Var, iVarO, iVarA, new y1(oVar2.d.A("audio_story_download"), oVar2, 23), yVar2.k.c, new as.z0(yVar2, null, 2)), m0.a);
                    u uVar2 = new u(yVar2, 1);
                    this.B = 1;
                    if (iVarV.collect(uVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
