package lo;

public final class u {
    public final u30.b a;
    public final boolean b;
    public final boolean c;

    public u(u30.b paragraphs, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(paragraphs, "paragraphs");
        this.a = paragraphs;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.a, uVar.a) && this.b == uVar.b && this.c == uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + w.c.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryReadAlongDvo(paragraphs=");
        sb.append(this.a);
        sb.append(", isTruncated=");
        sb.append(this.b);
        sb.append(", isRightToLeft=");
        return g4.c.l(sb, this.c, ")");
    }
}
