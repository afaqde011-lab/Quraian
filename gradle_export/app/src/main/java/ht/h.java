package ht;

import a40.q;

public final class h extends m00.c {
    public ft.f A;
    public q B;
    public Object C;
    public final k D;
    public int E;

    public h(k kVar, m00.c cVar) {
        super(cVar);
        this.D = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(null, this);
    }
}
