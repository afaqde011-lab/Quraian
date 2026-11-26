package ss;

public final class t implements d {
    public final e a;
    public final f b = f.SEEK;

    public t(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.m.a(this.a, ((t) obj).a);
    }

    @Override
    public final e getFields() {
        return this.a;
    }

    @Override
    public final f getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ListeningSeekEvent(fields=" + this.a + ")";
    }
}
