package ez;

import a40.z;
import g00.b0;
import ri.t1;

public final class q extends m00.i implements u00.n {
    public int A;
    public final u B;
    public final boolean C;
    public final hp.a D;
    public final u00.a E;
    public final ol.b F;
    public final sy.c G;

    public q(u uVar, boolean z, hp.a aVar, u00.a aVar2, ol.b bVar, sy.c cVar, k00.c cVar2) {
        super(2, cVar2);
        this.B = uVar;
        this.C = z;
        this.D = aVar;
        this.E = aVar2;
        this.F = bVar;
        this.G = cVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new q(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            d40.i iVarH = this.B.h();
            p pVar = new p(this.C, this.D, this.E, this.F, this.G, null);
            this.A = 1;
            if (d40.o.i(iVarH, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }
}
