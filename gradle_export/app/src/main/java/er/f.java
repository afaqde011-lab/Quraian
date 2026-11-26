package er;

import g00.n;
import java.io.Serializable;

public final class f extends m00.c {
    public String A;
    public Object B;
    public final j C;
    public int D;

    public f(j jVar, m00.c cVar) {
        super(cVar);
        this.C = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        Serializable serializableB = this.C.b(this);
        return serializableB == l00.a.A ? serializableB : new n(serializableB);
    }
}
