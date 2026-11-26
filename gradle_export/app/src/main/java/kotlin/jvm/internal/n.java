package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class n implements h, Serializable {
    private final int arity;

    public n(int i) {
        this.arity = i;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strK = a0.a.k(this);
        m.d(strK, "renderLambdaToString(...)");
        return strK;
    }
}
