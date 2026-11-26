package on;

import g00.k;
import java.util.Map;

public final class a extends m00.c {
    public Map A;
    public k B;
    public Object C;
    public final d D;
    public int E;

    public a(d dVar, m00.c cVar) {
        super(cVar);
        this.D = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return d.a(this.D, null, null, 0.0f, null, this);
    }
}
