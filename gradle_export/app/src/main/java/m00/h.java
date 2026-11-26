package m00;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;

public abstract class h extends g implements kotlin.jvm.internal.h {
    public final int A;

    public h(int i, k00.c cVar) {
        super(cVar);
        this.A = i;
    }

    @Override
    public final int getArity() {
        return this.A;
    }

    @Override
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strJ = a0.a.j(this);
        m.d(strJ, "renderLambdaToString(...)");
        return strJ;
    }
}
