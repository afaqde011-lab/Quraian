package d6;

import java.util.List;

public final class p extends m00.c {
    public r A;
    public r B;
    public List C;
    public int D;
    public int E;
    public Object F;
    public final r G;
    public int H;

    public p(r rVar, m00.c cVar) {
        super(cVar);
        this.G = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return r.e(this.G, null, this);
    }
}
