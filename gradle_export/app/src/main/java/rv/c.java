package rv;

import java.util.LinkedHashMap;
import java.util.List;

public final class c extends m00.c {
    public int A;
    public List B;
    public Object C;
    public LinkedHashMap D;
    public Object E;
    public final i F;
    public int G;

    public c(i iVar, m00.c cVar) {
        super(cVar);
        this.F = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.e(0, this);
    }
}
