package uu;

import java.util.List;

public final class o extends m00.c {
    public bx.c A;
    public Object B;
    public List C;
    public List D;
    public Object E;
    public final w F;
    public int G;

    public o(w wVar, m00.c cVar) {
        super(cVar);
        this.F = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.t(null, this);
    }
}
