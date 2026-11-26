package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class s1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;

    public s1(int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        switch (i2) {
            case 1:
                super(i, cVar);
                break;
            default:
                this.B = i;
                break;
        }
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                s1 s1Var = new s1(this.B, cVar, 0);
                s1Var.C = obj;
                return s1Var;
            default:
                s1 s1Var2 = new s1(2, cVar, 1);
                s1Var2.C = obj;
                return s1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((s1) create((PlayerItem) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((s1) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        a40.z zVar;
        boolean z = false;
        switch (this.A) {
            case 0:
                PlayerItem playerItem = (PlayerItem) this.C;
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                if (playerItem != null && playerItem.getSurahNumber() == this.B) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                l00.a aVar2 = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    zVar = (a40.z) this.C;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (a40.z) this.C;
                    ri.t1.O(obj);
                }
                while (a40.c0.w(zVar.A())) {
                    z.y0 y0Var = new z.y0(0);
                    this.C = zVar;
                    this.B = 1;
                    if (l1.q.u(getContext()).b0(y0Var, this) == aVar2) {
                        return aVar2;
                    }
                }
                return g00.b0.a;
        }
    }
}
