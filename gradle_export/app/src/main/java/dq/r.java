package dq;

import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;

public final class r extends m00.c {
    public ReciterCollectionEvent A;
    public Object B;
    public final u C;
    public int D;

    public r(u uVar, m00.c cVar) {
        super(cVar);
        this.C = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return u.k(this.C, null, this);
    }
}
