package vz;

import g00.n;

public final class a extends m00.c {
    public Object A;
    public final c B;
    public int C;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objC = this.B.c(null, null, null, null, null, this);
        return objC == l00.a.A ? objC : new n(objC);
    }
}
