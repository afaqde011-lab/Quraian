package ho;

public final class m {
    public final String a;
    public final String b;

    public m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && kotlin.jvm.internal.m.a(this.b, mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("AudioStoryLanguage(code=", this.a, ", label=", this.b, ")");
    }
}
