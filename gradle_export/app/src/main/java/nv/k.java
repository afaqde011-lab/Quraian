package nv;

import ab.a0;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.t0;
import g00.b0;
import java.util.List;
import k9.e1;
import ri.t1;

public final class k extends m00.i implements u00.k {
    public int A;
    public final AudioPlayerService B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;
    public final e1 G;

    public k(AudioPlayerService audioPlayerService, String str, String str2, int i, int i2, e1 e1Var, k00.c cVar) {
        super(1, cVar);
        this.B = audioPlayerService;
        this.C = str;
        this.D = str2;
        this.E = i;
        this.F = i2;
        this.G = e1Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new k(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((k) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            int i2 = AudioPlayerService.j0;
            ov.g gVarY = this.B.y();
            this.A = 1;
            obj = gVarY.h(this.C, this.D, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        List list = (List) obj;
        int i3 = this.E;
        int i4 = this.F;
        int iY = a0.y(i3 * i4, 0, list.size());
        return k9.q.c(t0.o(list.subList(iY, a0.y(i4 + iY, iY, list.size()))), this.G);
    }
}
