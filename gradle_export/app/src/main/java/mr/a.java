package mr;

import java.util.List;
import kotlin.jvm.internal.m;

public final class a {
    public final List a;
    public final boolean b;
    public final Integer c;
    public final List d;
    public final List e;

    public a(List stories, boolean z, Integer num, List downloads, List downloadProgress) {
        m.e(stories, "stories");
        m.e(downloads, "downloads");
        m.e(downloadProgress, "downloadProgress");
        this.a = stories;
        this.b = z;
        this.c = num;
        this.d = downloads;
        this.e = downloadProgress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && m.a(this.c, aVar.c) && m.a(this.d, aVar.d) && m.a(this.e, aVar.e);
    }

    public final int hashCode() {
        int iE = w.c.e(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.e.hashCode() + g4.c.a((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "HomeAudioStoriesData(stories=" + this.a + ", isLoading=" + this.b + ", playingStoryId=" + this.c + ", downloads=" + this.d + ", downloadProgress=" + this.e + ")";
    }
}
