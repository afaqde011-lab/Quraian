package l6;

import android.os.SystemClock;
import androidx.glance.session.SessionWorker;
import androidx.media3.common.q0;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import k9.e1;
import ri.t1;

public final class r extends m00.i implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public r(Object obj, Object obj2, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r((y) this.B, (SessionWorker) this.C, cVar, 0);
            case 1:
                return new r((AudioPlayerService) this.B, (e1) this.C, cVar, 1);
            default:
                return new r((x.b) this.B, this.C, cVar, 2);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                r rVarCreate = create(cVar);
                g00.b0 b0Var = g00.b0.a;
                rVarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                return create(cVar).invokeSuspend(g00.b0.a);
            default:
                r rVarCreate2 = create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                rVarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                ((y) obj3).b(((SessionWorker) obj2).f970j.f10048c);
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                int i11 = AudioPlayerService.j0;
                q0 q0VarG = ((AudioPlayerService) obj3).y().g();
                k9.q.e(q0VarG);
                return new k9.q(0, SystemClock.elapsedRealtime(), (e1) obj2, null, q0VarG, 2);
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                x.b bVar = (x.b) obj3;
                x.b.b(bVar);
                Object objA = x.b.a(bVar, obj2);
                bVar.f16234c.B.setValue(objA);
                bVar.f16236e.setValue(objA);
                return b0Var;
        }
    }
}
