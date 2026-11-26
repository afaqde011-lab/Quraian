package as;

public final class l implements u {
    public final yt.a a;

    public l(yt.a progress) {
        kotlin.jvm.internal.m.e(progress, "progress");
        this.a = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && kotlin.jvm.internal.m.a(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnPlayerItemCancelDownloadingClicked(progress=" + this.a + ")";
    }
}
