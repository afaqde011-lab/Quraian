package uu;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.List;

public final class f extends m00.c {
    public PlayerItem A;
    public List B;
    public long C;
    public long D;
    public int E;
    public Object F;
    public final w G;
    public int H;

    public f(w wVar, m00.c cVar) {
        super(cVar);
        this.G = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return w.a(this.G, this);
    }
}
