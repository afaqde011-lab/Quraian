package wn;

import b1.g;

public final class b extends m00.c {
    public Object A;
    public int B;
    public final g C;

    public b(g gVar, k00.c cVar) {
        super(cVar);
        this.C = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit((Object) null, this);
    }
}
