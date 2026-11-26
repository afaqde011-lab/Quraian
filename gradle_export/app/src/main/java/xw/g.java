package xw;

import java.util.List;

public final class g extends m00.c {
    public k A;
    public List B;
    public Object C;
    public final k D;
    public int E;

    public g(k kVar, m00.c cVar) {
        super(cVar);
        this.D = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(this);
    }
}
