package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class u2 extends m00.c {
    public PlayerItem A;
    public Object B;
    public final e3 C;
    public int D;

    public u2(e3 e3Var, m00.c cVar) {
        super(cVar);
        this.C = e3Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return e3.n(this.C, null, this);
    }
}
