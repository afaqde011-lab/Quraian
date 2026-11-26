package dz;

public final class n {
    public final u30.b a;
    public final u30.b b;
    public final u30.b c;

    public n(u30.b reciterDownloads, u30.b collectionDownloads, u30.b storyDownloads) {
        kotlin.jvm.internal.m.e(reciterDownloads, "reciterDownloads");
        kotlin.jvm.internal.m.e(collectionDownloads, "collectionDownloads");
        kotlin.jvm.internal.m.e(storyDownloads, "storyDownloads");
        this.a = reciterDownloads;
        this.b = collectionDownloads;
        this.c = storyDownloads;
    }

    public static n a(n nVar, u30.b reciterDownloads, u30.b collectionDownloads, u30.b storyDownloads, int i) {
        if ((i & 1) != 0) {
            reciterDownloads = nVar.a;
        }
        if ((i & 2) != 0) {
            collectionDownloads = nVar.b;
        }
        if ((i & 4) != 0) {
            storyDownloads = nVar.c;
        }
        nVar.getClass();
        kotlin.jvm.internal.m.e(reciterDownloads, "reciterDownloads");
        kotlin.jvm.internal.m.e(collectionDownloads, "collectionDownloads");
        kotlin.jvm.internal.m.e(storyDownloads, "storyDownloads");
        return new n(reciterDownloads, collectionDownloads, storyDownloads);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.a, nVar.a) && kotlin.jvm.internal.m.a(this.b, nVar.b) && kotlin.jvm.internal.m.a(this.c, nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g4.c.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DownloadManagerUiState(reciterDownloads=" + this.a + ", collectionDownloads=" + this.b + ", storyDownloads=" + this.c + ")";
    }
}
