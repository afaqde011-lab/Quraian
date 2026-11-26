package nv;

import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g00.b0;
import h00.x;
import k9.a2;
import ri.t1;

public final class j extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final AudioPlayerService C;
    public final String D;
    public final a2 E;

    public j(AudioPlayerService audioPlayerService, String str, a2 a2Var, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.C = audioPlayerService;
        this.D = str;
        this.E = a2Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j(this.C, this.D, this.E, cVar, 0);
            default:
                return new j(this.C, this.D, this.E, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
        }
        return ((j) create(cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        x xVar = x.A;
        a2 a2Var = this.E;
        String str = this.D;
        AudioPlayerService audioPlayerService = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    return AudioPlayerService.o(audioPlayerService, str, a2Var, this) == aVar ? aVar : xVar;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return xVar;
            default:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    int i4 = AudioPlayerService.j0;
                    ov.g gVarY = audioPlayerService.y();
                    this.B = 1;
                    obj = gVarY.h.g(str, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                if (!((Boolean) obj).booleanValue() || !AudioPlayerService.C(a2Var)) {
                    return xVar;
                }
                audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoBackgroundSoundSelected.INSTANCE);
                return xVar;
        }
    }
}
