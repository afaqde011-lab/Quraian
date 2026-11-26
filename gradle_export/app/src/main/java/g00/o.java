package g00;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class o implements h, Serializable {
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "B");
    public volatile u00.a A;
    public volatile Object B;

    @Override
    public final Object getValue() {
        Object obj = this.B;
        y yVar = y.a;
        if (obj != yVar) {
            return obj;
        }
        u00.a aVar = this.A;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            if (C.compareAndSet(this, yVar, objInvoke)) {
                this.A = null;
                return objInvoke;
            }
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
