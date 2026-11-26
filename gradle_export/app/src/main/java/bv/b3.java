package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class b3 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public Object C;
    public final long D;
    public final e3 E;

    public b3(long j, e3 e3Var, k00.c cVar) {
        super(2, cVar);
        this.D = j;
        this.E = e3Var;
    }

    public b3(e3 e3Var, long j, k00.c cVar) {
        super(2, cVar);
        this.E = e3Var;
        this.D = j;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                b3 b3Var = new b3(this.E, this.D, cVar);
                b3Var.C = obj;
                return b3Var;
            default:
                b3 b3Var2 = new b3(this.D, this.E, cVar);
                b3Var2.C = obj;
                return b3Var2;
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
        return ((b3) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                a40.z zVar = (a40.z) this.C;
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    e3 e3Var = this.E;
                    uu.w wVar = (uu.w) e3Var.d;
                    d40.t0 t0VarL = d40.o.l(wVar.E, wVar.D, wVar.C, new z2(4, null));
                    a3 a3Var = new a3(zVar, this.D, e3Var);
                    this.C = null;
                    this.B = 1;
                    if (t0VarL.collect(a3Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                a40.z zVar2 = (a40.z) this.C;
                Object obj2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    this.C = zVar2;
                    this.B = 1;
                    if (a40.c0.l(this.D, this) != obj2) {
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(obj);
                boolean zV = a40.c0.v(zVar2);
                obj2 = g00.b0.a;
                if (zV) {
                    e3 e3Var2 = this.E;
                    uu.w wVar2 = (uu.w) e3Var2.d;
                    PlayerItem playerItem = (PlayerItem) wVar2.C.getValue();
                    if (playerItem != null) {
                        wVar2.v(false, new uu.j(wVar2, playerItem, null));
                    }
                    e3.k(e3Var2);
                }
                return obj2;
        }
    }
}
