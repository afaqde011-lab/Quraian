package nv;

import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g00.b0;
import k9.g1;
import ri.t1;

public final class i extends m00.i implements u00.n {
    public final int A;
    public boolean B;
    public final AudioPlayerService C;

    public i(AudioPlayerService audioPlayerService, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = audioPlayerService;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                i iVar = new i(this.C, cVar, 0);
                iVar.B = ((Boolean) obj).booleanValue();
                return iVar;
            default:
                i iVar2 = new i(this.C, cVar, 1);
                iVar2.B = ((Boolean) obj).booleanValue();
                return iVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        k00.c cVar = (k00.c) obj2;
        switch (i) {
            case 0:
                i iVar = (i) create(bool, cVar);
                b0 b0Var = b0.a;
                iVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((i) create(bool, cVar)).invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        AudioPlayerService audioPlayerService = this.C;
        b0 b0Var = b0.a;
        boolean z = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (z) {
                    int i2 = AudioPlayerService.j0;
                    ((hq.b) audioPlayerService.v()).c();
                } else {
                    int i3 = AudioPlayerService.j0;
                    ((hq.b) audioPlayerService.v()).b();
                    AudioPlayerService.p(audioPlayerService);
                }
                audioPlayerService.s();
                g1 g1Var = audioPlayerService.I;
                if (g1Var != null) {
                    g1Var.b(Integer.MAX_VALUE, "root");
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                int i4 = AudioPlayerService.j0;
                if (!audioPlayerService.x().k()) {
                    if (z) {
                        ((hq.b) audioPlayerService.v()).b();
                    }
                } else if (!z) {
                    AudioPlayerService.p(audioPlayerService);
                } else {
                    audioPlayerService.K();
                }
                break;
        }
        return b0Var;
    }
}
