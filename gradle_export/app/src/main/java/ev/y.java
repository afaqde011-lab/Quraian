package ev;

import a40.m0;
import bt.a2;
import bt.b1;
import d40.p1;
import d40.u0;
import java.util.List;
import ri.t1;

public final class y extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final c0 C;

    public y(c0 c0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = c0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y(this.C, cVar, 0);
            case 1:
                return new y(this.C, cVar, 1);
            default:
                return new y(this.C, cVar, 2);
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
        }
        return ((y) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objB;
        Object objC;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                c0 c0Var = this.C;
                if (i == 0) {
                    t1.O(obj);
                    xw.k kVar = c0Var.e;
                    this.B = 1;
                    objB = kVar.b(this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objB = obj;
                }
                c0Var.i(t.a((t) c0Var.c.d.getValue(), null, false, null, 0, 0, null, null, false, ((List) objB).isEmpty(), false, null, false, 3711));
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                c0 c0Var2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    xw.k kVar2 = c0Var2.e;
                    this.B = 1;
                    objC = kVar2.c(this);
                    if (objC == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objC = obj;
                }
                if (((List) objC).isEmpty()) {
                    c0Var2.k();
                }
                return g00.b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    c0 c0Var3 = this.C;
                    a2 a2Var = new a2(c0Var3.e.f(), 6);
                    k00.c cVar = null;
                    u0 u0Var = new u0(c0Var3.h.c, ((ut.p) c0Var3.g).k(), new z(3, cVar, 0));
                    p1 p1Var = c0Var3.i;
                    uu.w wVar = (uu.w) c0Var3.d;
                    d40.i iVarV = d40.o.v(d40.o.j(a2Var, p1Var, u0Var, wVar.B, wVar.C, new b1(2, cVar)), m0.a);
                    av.o oVar = new av.o(2, c0Var3, c0.class, "applyListing", "applyListing(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/reciterpicker/ReciterPickerViewModel$Listing;)V", 4, 8);
                    this.B = 1;
                    if (d40.o.i(iVarV, oVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
