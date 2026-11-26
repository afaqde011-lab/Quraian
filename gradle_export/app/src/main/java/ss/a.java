package ss;

public final class a implements d {
    public final e a;
    public final f b = f.AUDIO_END;

    public a(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.m.a(this.a, ((a) obj).a);
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
        return "ListeningAudioEndEvent(fields=" + this.a + ")";
    }
}
