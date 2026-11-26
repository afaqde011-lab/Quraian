package rt;

import ot.o;

public final class a extends m00.c {
    public boolean A;
    public String B;
    public String C;
    public o D;
    public b E;
    public Object F;
    public final b G;
    public int H;

    public a(b bVar, m00.c cVar) {
        super(cVar);
        this.G = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(null, this, false);
    }
}
