package nv;

import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g00.b0;
import java.util.List;
import k9.a2;
import k9.e1;
import k9.g1;
import ri.t1;

public final class m extends m00.i implements u00.k {
    public int A;
    public final AudioPlayerService B;
    public final String C;
    public final String D;
    public final boolean E;
    public final g1 F;
    public final a2 G;
    public final e1 H;

    public m(AudioPlayerService audioPlayerService, String str, String str2, boolean z, g1 g1Var, a2 a2Var, e1 e1Var, k00.c cVar) {
        super(1, cVar);
        this.B = audioPlayerService;
        this.C = str;
        this.D = str2;
        this.E = z;
        this.F = g1Var;
        this.G = a2Var;
        this.H = e1Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new m(this.B, this.C, this.D, this.E, this.F, this.G, this.H, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((m) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        String str = this.C;
        AudioPlayerService audioPlayerService = this.B;
        if (i == 0) {
            t1.O(obj);
            int i2 = AudioPlayerService.j0;
            ov.g gVarY = audioPlayerService.y();
            this.A = 1;
            obj = gVarY.h(str, this.D, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        int size = ((List) obj).size();
        if (this.E) {
            int i3 = AudioPlayerService.j0;
            audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoSearchPerformed.INSTANCE);
        }
        this.F.c(this.G, str, size, this.H);
        return k9.q.d();
    }
}
