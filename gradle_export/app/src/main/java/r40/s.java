package r40;

import java.util.LinkedHashMap;
import qd.j0;

public final class s extends m00.c {
    public g00.b A;
    public j0 B;
    public LinkedHashMap C;
    public String D;
    public Object E;
    public final j0 F;
    public int G;

    public s(j0 j0Var, m00.a aVar) {
        super(aVar);
        this.F = j0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return j0.c(this.F, (g00.b) null, this);
    }
}
