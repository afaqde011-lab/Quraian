package xw;

import java.util.List;

public final class i extends m00.c {
    public List A;
    public Object B;
    public final k C;
    public int D;

    public i(k kVar, m00.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.e(null, this);
    }
}
