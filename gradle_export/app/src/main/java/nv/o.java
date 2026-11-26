package nv;

import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.t0;
import g00.b0;
import java.util.List;
import k9.a2;
import k9.b2;
import ri.t1;

public final class o extends m00.i implements u00.k {
    public int A;
    public final AudioPlayerService B;
    public final List C;
    public final int D;
    public final long E;
    public final a2 F;

    public o(AudioPlayerService audioPlayerService, List list, int i, long j, a2 a2Var, k00.c cVar) {
        super(1, cVar);
        this.B = audioPlayerService;
        this.C = list;
        this.D = i;
        this.E = j;
        this.F = a2Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new o(this.B, this.C, this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((o) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        o oVar;
        l00.a aVar = l00.a.A;
        int i = this.A;
        AudioPlayerService audioPlayerService = this.B;
        if (i == 0) {
            t1.O(obj);
            this.A = 1;
            oVar = this;
            obj = AudioPlayerService.k(audioPlayerService, this.C, this.D, this.E, oVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            oVar = this;
        }
        b2 b2Var = (b2) obj;
        t0 mediaItems = b2Var.a;
        kotlin.jvm.internal.m.d(mediaItems, "mediaItems");
        if (!mediaItems.isEmpty() && AudioPlayerService.C(oVar.F)) {
            audioPlayerService.u().logEvent(new AndroidAutoEvent.AndroidAutoPlaybackStarted(null));
        }
        return b2Var;
    }
}
