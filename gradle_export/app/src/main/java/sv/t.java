package sv;

import java.util.LinkedHashMap;

public final class t extends m00.c {
    public String A;
    public LinkedHashMap B;
    public Object C;
    public final p10.a D;
    public int E;

    public t(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.D = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.E(this);
    }
}
