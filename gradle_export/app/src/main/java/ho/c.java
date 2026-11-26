package ho;

import java.util.List;

public final class c {
    public final String a;
    public final List b;

    public c(String language, List stories) {
        kotlin.jvm.internal.m.e(language, "language");
        kotlin.jvm.internal.m.e(stories, "stories");
        this.a = language;
        this.b = stories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.a, cVar.a) && kotlin.jvm.internal.m.a(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioStoryCatalog(language=" + this.a + ", stories=" + this.b + ")";
    }
}
