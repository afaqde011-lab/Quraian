package xu;

import su.s;

public final class c extends m00.c {
    public su.d A;
    public s B;
    public Object C;
    public final f D;
    public int E;

    public c(f fVar, m00.c cVar) {
        super(cVar);
        this.D = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.g(null, this);
    }
}
