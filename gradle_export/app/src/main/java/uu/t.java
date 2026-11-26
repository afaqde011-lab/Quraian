package uu;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class t extends m00.c {
    public PlayerItem A;
    public int B;
    public int C;
    public Object D;
    public final w E;
    public int F;

    public t(w wVar, m00.c cVar) {
        super(cVar);
        this.E = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.B(null, 0, this);
    }
}
