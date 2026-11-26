package d30;

public final class g {
    public final Object a;
    public final u00.a b;

    public g(Object obj, u00.a aVar) {
        this.a = obj;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
