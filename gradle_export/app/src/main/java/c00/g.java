package c00;

public final class g implements h {
    public final zz.a a;

    public g(zz.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        zz.a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "SelectSoundEffect(soundEffect=" + this.a + ")";
    }
}
