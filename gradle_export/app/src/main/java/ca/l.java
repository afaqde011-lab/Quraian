package ca;

import kotlin.KotlinNothingValueException;

public final class l extends m00.c {
    public Object A;
    public final qj.c B;
    public int C;

    public l(qj.c cVar, m00.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        this.B.H(null, this);
        return l00.a.A;
    }
}
