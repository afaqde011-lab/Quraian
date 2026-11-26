package ss;

public final class y implements d {
    public final e a;
    public final f b = f.TRACK_CHANGE;

    public y(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.a, ((y) obj).a);
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
        return "ListeningTrackChangeEvent(fields=" + this.a + ")";
    }
}
