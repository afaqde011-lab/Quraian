package ho;

import java.util.List;

public final class r {
    public final List a;

    public r(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.m.a(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AudioStoryTranscript(lines=" + this.a + ")";
    }
}
