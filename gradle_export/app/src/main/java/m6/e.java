package m6;

import m00.i;

public final class e extends m00.c {
    public i A;
    public Object B;
    public final f C;
    public int D;

    public e(f fVar, m00.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, null, null, null, this);
    }
}
