package xw;

import java.util.List;

public final class f extends m00.c {
    public String A;
    public List B;
    public k C;
    public List D;
    public Object E;
    public final k F;
    public int G;

    public f(k kVar, m00.c cVar) {
        super(cVar);
        this.F = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(this);
    }
}
