package eo;

public final class s {
    public final int a;
    public final un.c b;

    public s(int i, un.c variant) {
        kotlin.jvm.internal.m.e(variant, "variant");
        this.a = i;
        this.b = variant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && kotlin.jvm.internal.m.a(this.b, sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DownloadItem(episodeId=" + this.a + ", variant=" + this.b + ")";
    }
}
