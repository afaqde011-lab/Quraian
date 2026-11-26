package m00;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;

public abstract class i extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public i(int i, k00.c cVar) {
        super(cVar);
        this.arity = i;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strJ = a0.a.j(this);
        m.d(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
