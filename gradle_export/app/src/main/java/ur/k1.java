package ur;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import ri.t1;

public final class k1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final r1 C;
    public final PlayerItem D;

    public k1(r1 r1Var, PlayerItem playerItem, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = r1Var;
        this.D = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k1(this.C, this.D, cVar, 0);
            case 1:
                return new k1(this.C, this.D, cVar, 1);
            default:
                return new k1(this.C, this.D, cVar, 2);
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
        return ((k1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    uu.a aVar2 = this.C.d;
                    this.B = 1;
                    if (((uu.w) aVar2).s(this.D, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    zt.a aVar4 = this.C.h;
                    this.B = 1;
                    if (((ut.p) aVar4).f(this.D, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    tq.k kVar = this.C.g;
                    PlayerItem playerItem = this.D;
                    zq.a aVar6 = new zq.a(playerItem.getSurahId(), playerItem.getReciterId());
                    this.B = 1;
                    if (kVar.e(aVar6, this) == aVar5) {
                        return aVar5;
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
