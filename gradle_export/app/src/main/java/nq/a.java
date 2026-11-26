package nq;

import m00.c;

public final class a extends c {
    public Object A;
    public final b B;
    public int C;

    public a(b bVar, c cVar) {
        super(cVar);
        this.B = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
