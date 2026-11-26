package ko;

import java.util.List;

public final class f {
    public final int a;
    public final List b;
    public final Integer c;
    public final List d;
    public final List e;

    public f(int i, List list, Integer num, List downloads, List progress) {
        kotlin.jvm.internal.m.e(downloads, "downloads");
        kotlin.jvm.internal.m.e(progress, "progress");
        this.a = i;
        this.b = list;
        this.c = num;
        this.d = downloads;
        this.e = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && kotlin.jvm.internal.m.a(this.b, fVar.b) && kotlin.jvm.internal.m.a(this.c, fVar.c) && kotlin.jvm.internal.m.a(this.d, fVar.d) && kotlin.jvm.internal.m.a(this.e, fVar.e);
    }

    public final int hashCode() {
        int iA = g4.c.a(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        return this.e.hashCode() + g4.c.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "AudioStoryDownloadStateInput(storyId=" + this.a + ", episodes=" + this.b + ", episodeId=" + this.c + ", downloads=" + this.d + ", progress=" + this.e + ")";
    }
}
