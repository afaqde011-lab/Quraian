package vl;

public final class m implements r {
    public final String a;
    public final int b;

    public m(String storySlug, int i) {
        kotlin.jvm.internal.m.e(storySlug, "storySlug");
        this.a = storySlug;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Episode(storySlug=" + this.a + ", order=" + this.b + ")";
    }
}
