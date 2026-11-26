package am;

import vl.k;

public final class b extends m00.c {
    public String A;
    public vl.b B;
    public k C;
    public Object D;
    public final c E;
    public int F;

    public b(c cVar, m00.c cVar2) {
        super(cVar2);
        this.E = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return c.a(this.E, null, this);
    }
}
