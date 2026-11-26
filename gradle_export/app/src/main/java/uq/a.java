package uq;

import m00.c;

public final class a extends c {
    public zq.a A;
    public Object B;
    public final b C;
    public int D;

    public a(b bVar, c cVar) {
        super(cVar);
        this.C = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
