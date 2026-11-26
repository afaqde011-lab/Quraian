package ho;

public final class f {
    public final int a;
    public final Integer b;
    public final float c;

    public f(int i, Integer num, float f) {
        this.a = i;
        this.b = num;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && kotlin.jvm.internal.m.a(this.b, fVar.b) && Float.compare(this.c, fVar.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Float.hashCode(this.c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "AudioStoryDownloadProgress(storyId=" + this.a + ", episodeId=" + this.b + ", progress=" + this.c + ")";
    }
}
