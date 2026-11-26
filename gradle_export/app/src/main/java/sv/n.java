package sv;

import java.util.Set;

public final class n extends m00.c {
    public Set A;
    public Object B;
    public final p10.a C;
    public int D;

    public n(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.t(this);
    }
}
