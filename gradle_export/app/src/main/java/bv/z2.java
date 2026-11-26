package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class z2 extends m00.i implements u00.p {
    public long A;
    public long B;
    public PlayerItem C;

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        z2 z2Var = new z2(4, (k00.c) obj4);
        z2Var.A = jLongValue;
        z2Var.B = jLongValue2;
        z2Var.C = (PlayerItem) obj3;
        return z2Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        long j = this.A;
        long j2 = this.B;
        PlayerItem playerItem = this.C;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return new g00.q(new Long(j), new Long(j2), playerItem);
    }
}
