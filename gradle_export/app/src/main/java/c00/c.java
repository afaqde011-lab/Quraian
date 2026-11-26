package c00;

public final class c implements f {
    public final zz.a a;

    public c(zz.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.m.a(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        zz.a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "OnItemClicked(item=" + this.a + ")";
    }
}
