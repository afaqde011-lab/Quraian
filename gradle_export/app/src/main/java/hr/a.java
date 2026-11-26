package hr;

import g00.n;
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
        Object objA = this.B.a(this);
        return objA == l00.a.A ? objA : new n(objA);
    }
}
