package av;

import a40.z;
import d40.d1;
import g00.b0;
import ri.t1;

public final class c extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final i C;

    public c(i iVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = iVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c(this.C, cVar, 0);
            default:
                return new c(this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((c) create(zVar, cVar)).invokeSuspend(b0.a);
            default:
                ((c) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    i iVar = this.C;
                    d40.i iVarH = iVar.n().h();
                    b bVar = new b(2, iVar, i.class, "handleEffect", "handleEffect(Lcom/mchutov/quranify/player/presentation/screen/fullscreen/FullScreenEffect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
                    this.B = 1;
                    if (d40.o.i(iVarH, bVar, this) == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                i iVar2 = this.C;
                d1 d1Var = ((mv.b) iVar2.G.getValue()).a;
                a1.c cVar = new a1.c(iVar2, 5);
                this.B = 1;
                d1Var.collect(cVar, this);
                return aVar2;
        }
    }
}
