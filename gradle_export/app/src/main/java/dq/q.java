package dq;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class q extends m00.c {
    public PlayerItem A;
    public Object B;
    public final u C;
    public int D;

    public q(u uVar, m00.c cVar) {
        super(cVar);
        this.C = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return u.j(this.C, null, this);
    }
}
