package ko;

public final class i {
    public final ho.a a;
    public final ho.g b;
    public final lo.i c;
    public final boolean d;

    public i(ho.a story, ho.g gVar, lo.i iVar, boolean z) {
        kotlin.jvm.internal.m.e(story, "story");
        this.a = story;
        this.b = gVar;
        this.c = iVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.a, iVar.a) && kotlin.jvm.internal.m.a(this.b, iVar.b) && kotlin.jvm.internal.m.a(this.c, iVar.c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioStoryEpisodeDvoInput(story=" + this.a + ", episode=" + this.b + ", download=" + this.c + ", isAvailable=" + this.d + ")";
    }
}
