package q50;

public final class a {
    public final u00.a a;
    public Object b;

    public a(Object obj, u00.a aVar) {
        this.a = aVar;
        this.b = obj;
    }

    public final Object a() {
        if (this.b == null) {
            u00.a aVar = this.a;
            this.b = aVar != null ? aVar.invoke() : null;
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
    }
}
