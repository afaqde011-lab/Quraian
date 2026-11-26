package yj;

public final class a implements c {
    public static final Object C = new Object();
    public volatile b A;
    public volatile Object B;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.B = C;
        aVar.A = bVar;
        return aVar;
    }

    public final Object get() {
        Object obj;
        Object obj2 = this.B;
        Object obj3 = C;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.B;
                if (obj == obj3) {
                    obj = this.A.get();
                    Object obj4 = this.B;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.B = obj;
                    this.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
