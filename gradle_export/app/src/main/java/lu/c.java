package lu;

public final class c implements p {
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
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAmbientSoundClicked(soundEffect=" + this.a + ")";
    }
}
