package eh;

public final class a0 implements x {
    public static final z D = new z(0);
    public final Object A = new Object();
    public volatile x B;
    public Object C;

    public a0(x xVar) {
        this.B = xVar;
    }

    @Override
    public final Object get() {
        x xVar = this.B;
        z zVar = D;
        if (xVar != zVar) {
            synchronized (this.A) {
                try {
                    if (this.B != zVar) {
                        Object obj = this.B.get();
                        this.C = obj;
                        this.B = zVar;
                        return obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.C;
    }

    public final String toString() {
        Object obj = this.B;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == D) {
            obj = "<supplier that returned " + this.C + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
