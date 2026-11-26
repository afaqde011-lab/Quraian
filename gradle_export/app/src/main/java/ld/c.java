package ld;

public final class c extends m00.c {
    public h A;
    public String B;
    public j40.a C;
    public Object D;
    public final h E;
    public int F;

    public c(h hVar, m00.c cVar) {
        super(cVar);
        this.E = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.d(null, this);
    }
}
