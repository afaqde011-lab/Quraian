package eh;

import java.io.Serializable;

public final class y implements x, Serializable {
    public final transient Object A = new Object();
    public final x B;
    public volatile transient boolean C;
    public transient Object D;

    public y(x xVar) {
        this.B = xVar;
    }

    @Override
    public final Object get() {
        if (!this.C) {
            synchronized (this.A) {
                try {
                    if (!this.C) {
                        Object obj = this.B.get();
                        this.D = obj;
                        this.C = true;
                        return obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.D;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.C) {
            obj = "<supplier that returned " + this.D + ">";
        } else {
            obj = this.B;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
