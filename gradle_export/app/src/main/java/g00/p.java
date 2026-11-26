package g00;

import java.io.Serializable;

public final class p implements h, Serializable {
    public u00.a A;
    public volatile Object B;
    public final Object C;

    public p(u00.a initializer) {
        kotlin.jvm.internal.m.e(initializer, "initializer");
        this.A = initializer;
        this.B = y.a;
        this.C = this;
    }

    @Override
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.B;
        y yVar = y.a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.C) {
            objInvoke = this.B;
            if (objInvoke == yVar) {
                u00.a aVar = this.A;
                kotlin.jvm.internal.m.b(aVar);
                objInvoke = aVar.invoke();
                this.B = objInvoke;
                this.A = null;
            }
        }
        return objInvoke;
    }

    @Override
    public final boolean isInitialized() {
        return this.B != y.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
