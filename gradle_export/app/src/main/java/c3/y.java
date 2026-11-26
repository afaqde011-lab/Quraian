package c3;

import kotlin.KotlinNothingValueException;

public final class y extends m00.c {
    public Object A;
    public final z B;
    public int C;

    public y(z zVar, m00.c cVar) {
        super(cVar);
        this.B = zVar;
    }

    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.J(null, this);
        return l00.a.A;
    }
}
