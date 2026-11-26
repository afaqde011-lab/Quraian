package jq;

import m00.i;
import u00.k;

public final class a extends m00.c {
    public k A;
    public i B;
    public Object C;
    public final e D;
    public int E;

    public a(e eVar, m00.c cVar) {
        super(cVar);
        this.D = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, this);
    }
}
