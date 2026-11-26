package jq;

import vl.r;

public final class b extends m00.c {
    public r A;
    public Object B;
    public final e C;
    public int D;

    public b(e eVar, m00.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(null, this);
    }
}
