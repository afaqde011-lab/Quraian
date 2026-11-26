package bt;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.List;

public final class e1 extends m00.i implements u00.q {
    public List A;
    public mr.g B;
    public PlayerItem C;
    public int D;
    public final j2 E;

    public e1(j2 j2Var, k00.c cVar) {
        super(5, cVar);
        this.E = j2Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        List list = this.A;
        mr.g gVar = this.B;
        PlayerItem playerItem = this.C;
        int i = this.D;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        this.E.f.getClass();
        return new y(gVar, i, g4.d0(pr.c.a(list, gVar, i)), playerItem != null);
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj4).intValue();
        e1 e1Var = new e1(this.E, (k00.c) obj5);
        e1Var.A = (List) obj;
        e1Var.B = (mr.g) obj2;
        e1Var.C = (PlayerItem) obj3;
        e1Var.D = iIntValue;
        return e1Var.invokeSuspend(g00.b0.a);
    }
}
