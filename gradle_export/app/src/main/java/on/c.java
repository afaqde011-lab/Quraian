package on;

import java.util.Set;

public final class c extends m00.c {
    public Set A;
    public Object B;
    public final d C;
    public int D;

    public c(d dVar, m00.c cVar) {
        super(cVar);
        this.C = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return d.b(this.C, null, this);
    }
}
