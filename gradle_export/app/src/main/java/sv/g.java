package sv;

import java.util.LinkedHashMap;
import java.util.List;

public final class g extends m00.c {
    public List A;
    public LinkedHashMap B;
    public Object C;
    public final th.o D;
    public int E;

    public g(th.o oVar, m00.c cVar) {
        super(cVar);
        this.D = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.t(this);
    }
}
