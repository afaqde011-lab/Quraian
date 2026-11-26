package ii;

public final class l implements ij.b {

    public static final Object f7705c = new Object();

    public volatile Object f7706a = f7705c;

    public volatile ij.b f7707b;

    public l(ij.b bVar) {
        this.f7707b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f7706a;
        Object obj3 = f7705c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7706a;
                if (obj == obj3) {
                    obj = this.f7707b.get();
                    this.f7706a = obj;
                    this.f7707b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
