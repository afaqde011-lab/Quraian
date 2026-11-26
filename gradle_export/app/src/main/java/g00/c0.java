package g00;

import java.io.Serializable;

public final class c0 implements h, Serializable {
    public u00.a A;
    public Object B;

    @Override
    public final Object getValue() {
        if (this.B == y.a) {
            u00.a aVar = this.A;
            kotlin.jvm.internal.m.b(aVar);
            this.B = aVar.invoke();
            this.A = null;
        }
        return this.B;
    }

    @Override
    public final boolean isInitialized() {
        return this.B != y.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
