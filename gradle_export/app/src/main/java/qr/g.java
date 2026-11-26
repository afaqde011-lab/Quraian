package qr;

public final class g implements l {
    public final String a;
    public final u30.b b;
    public final boolean c;

    public g(String key, u30.b cards, boolean z) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(cards, "cards");
        this.a = key;
        this.b = cards;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.a, gVar.a) && kotlin.jvm.internal.m.a(this.b, gVar.b) && this.c == gVar.c;
    }

    @Override
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g4.c.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStories(key=");
        sb.append(this.a);
        sb.append(", cards=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return g4.c.l(sb, this.c, ")");
    }
}
