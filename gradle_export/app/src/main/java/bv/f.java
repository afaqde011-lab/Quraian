package bv;

public final class f implements g1 {
    public final yt.a a;

    public f(yt.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnCancelTrackListItemDownload(progress=" + this.a + ")";
    }
}
