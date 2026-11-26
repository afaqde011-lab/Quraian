package ut;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import kotlin.jvm.internal.v;

public final class d extends m00.c {
    public PlayerItem A;
    public v B;
    public Object C;
    public final p D;
    public int E;

    public d(p pVar, m00.c cVar) {
        super(cVar);
        this.D = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(null, this);
    }
}
