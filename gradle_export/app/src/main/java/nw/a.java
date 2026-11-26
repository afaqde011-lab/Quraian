package nw;

import m00.c;

public final class a extends c {
    public String A;
    public kw.a B;
    public boolean C;
    public Object D;
    public final b E;
    public int F;

    public a(b bVar, c cVar) {
        super(cVar);
        this.E = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(this);
    }
}
