package dh;

public final class m implements p {
    public static final Object C = new Object();
    public volatile n A;
    public volatile Object B;

    public static m a(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        m mVar = new m();
        mVar.B = C;
        mVar.A = nVar;
        return mVar;
    }

    @Override
    public final Object e() {
        Object obj = this.B;
        Object obj2 = C;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.B;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objE = this.A.e();
                Object obj4 = this.B;
                if (obj4 != obj2 && obj4 != objE) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objE + ". This is likely due to a circular dependency.");
                }
                this.B = objE;
                this.A = null;
                return objE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
