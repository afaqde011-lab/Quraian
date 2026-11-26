package uu;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.List;

public final class n extends m00.c {
    public PlayerItem A;
    public List B;
    public int C;
    public Object D;
    public final w E;
    public int F;

    public n(w wVar, m00.c cVar) {
        super(cVar);
        this.E = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.s(null, this);
    }
}
