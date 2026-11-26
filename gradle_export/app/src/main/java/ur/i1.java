package ur;

import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;

public final class i1 extends m00.c {
    public ReciterCollectionEvent A;
    public i00.b B;
    public long C;
    public Object D;
    public final r1 E;
    public int F;

    public i1(r1 r1Var, m00.c cVar) {
        super(cVar);
        this.E = r1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return r1.j(this.E, null, 0L, this);
    }
}
