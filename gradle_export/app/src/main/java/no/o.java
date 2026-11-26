package no;

public final class o {
    public final ho.a a;
    public final ho.g b;
    public final ho.o c;

    public o(ho.a story, ho.g episode, ho.o oVar) {
        kotlin.jvm.internal.m.e(story, "story");
        kotlin.jvm.internal.m.e(episode, "episode");
        this.a = story;
        this.b = episode;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.a, oVar.a) && kotlin.jvm.internal.m.a(this.b, oVar.b) && this.c == oVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PendingStart(story=" + this.a + ", episode=" + this.b + ", source=" + this.c + ")";
    }
}
