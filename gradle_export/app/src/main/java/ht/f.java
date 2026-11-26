package ht;

import a40.q;

public final class f extends m00.c {
    public q A;
    public Object B;
    public final k C;
    public int D;

    public f(k kVar, m00.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(this);
    }
}
