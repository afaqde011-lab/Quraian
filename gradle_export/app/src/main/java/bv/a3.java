package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class a3 implements d40.j {
    public final a40.z A;
    public final long B;
    public final e3 C;

    public a3(a40.z zVar, long j, e3 e3Var) {
        this.A = zVar;
        this.B = j;
        this.C = e3Var;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        g00.q qVar = (g00.q) obj;
        long jLongValue = ((Number) qVar.A).longValue();
        long jLongValue2 = ((Number) qVar.B).longValue();
        PlayerItem playerItem = (PlayerItem) qVar.C;
        boolean zV = a40.c0.v(this.A);
        g00.b0 b0Var = g00.b0.a;
        if (zV) {
            e3 e3Var = this.C;
            if (playerItem == null || playerItem.getSurahId() != this.B) {
                e3.k(e3Var);
                e3Var.q();
                return b0Var;
            }
            if (((o1) e3Var.c.d.getValue()).W == null && jLongValue2 > 0 && jLongValue >= jLongValue2 - 750) {
                uu.w wVar = (uu.w) e3Var.d;
                PlayerItem playerItem2 = (PlayerItem) wVar.C.getValue();
                if (playerItem2 != null) {
                    wVar.v(false, new uu.j(wVar, playerItem2, null));
                }
                e3.k(e3Var);
                e3Var.q();
            }
        }
        return b0Var;
    }
}
