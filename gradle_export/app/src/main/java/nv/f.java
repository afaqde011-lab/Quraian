package nv;

import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import g00.b0;
import k9.g1;
import ri.t1;

public final class f extends m00.i implements u00.n {
    public final int A;
    public final AudioPlayerService B;

    public f(AudioPlayerService audioPlayerService, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = audioPlayerService;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f(this.B, cVar, 0);
            default:
                return new f(this.B, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                f fVar = (f) create((zz.a) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                fVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                f fVar2 = (f) create((u30.b) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                fVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        AudioPlayerService audioPlayerService = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                g1 g1Var = audioPlayerService.I;
                if (g1Var != null) {
                    g1Var.b(1, "tab_home");
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                g1 g1Var2 = audioPlayerService.I;
                if (g1Var2 != null) {
                    g1Var2.b(1, "tab_home");
                }
                break;
        }
        return b0Var;
    }
}
