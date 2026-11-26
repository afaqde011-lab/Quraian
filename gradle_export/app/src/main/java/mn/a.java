package mn;

import java.util.Locale;

public final class a extends m00.c {
    public c A;
    public Locale B;
    public Object C;
    public final c D;
    public int E;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.D = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        c.g(this.D, null, this);
        return l00.a.A;
    }
}
