package lw;

import m00.c;

public final class a extends c {
    public String A;
    public String B;
    public Object C;
    public final b D;
    public int E;

    public a(b bVar, c cVar) {
        super(cVar);
        this.D = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, null, null, this);
    }
}
