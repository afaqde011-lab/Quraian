package nx;

public final class o implements x {
    public final yt.a a;

    public o(yt.a progress) {
        kotlin.jvm.internal.m.e(progress, "progress");
        this.a = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.m.a(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemCancelDownloadingClicked(progress=" + this.a + ")";
    }
}
