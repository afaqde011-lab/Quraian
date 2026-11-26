package ht;

import ot.o;

public final class i extends m00.c {
    public o A;
    public ft.f B;
    public Object C;
    public final k D;
    public int E;

    public i(k kVar, m00.c cVar) {
        super(cVar);
        this.D = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.f(null, null, this);
    }
}
