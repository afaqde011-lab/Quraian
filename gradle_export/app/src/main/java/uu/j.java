package uu;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import g00.b0;
import ri.t1;

public final class j extends m00.i implements u00.n {
    public Object A;
    public final w B;
    public final PlayerItem C;

    public j(w wVar, PlayerItem playerItem, k00.c cVar) {
        super(2, cVar);
        this.B = wVar;
        this.C = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        j jVar = new j(this.B, this.C, cVar);
        jVar.A = obj;
        return jVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((k9.u) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        jVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        k9.u uVar = (k9.u) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (uVar.isPlaying()) {
            uVar.pause();
            w wVar = this.B;
            wVar.h.logEvent(new AudioPlayerEvent.AudioPause(String.valueOf(this.C.getSurahId()), ((Number) wVar.E.getValue()).longValue()));
        }
        return b0.a;
    }
}
