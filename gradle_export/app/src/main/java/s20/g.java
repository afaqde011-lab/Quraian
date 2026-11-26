package s20;

public abstract class g {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    public abstract e30.w a(j10.z zVar);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return kotlin.jvm.internal.m.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
