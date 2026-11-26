package ld;

public final class d extends m00.c {
    public h A;
    public j40.a B;
    public Object C;
    public final h D;
    public int E;

    public d(h hVar, m00.c cVar) {
        super(cVar);
        this.D = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return h.a(this.D, this);
    }
}
