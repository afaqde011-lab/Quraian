package vl;

public final class p implements r {
    public final String a;
    public final String b;

    public p(String reciterSlug, String surahSlug) {
        kotlin.jvm.internal.m.e(reciterSlug, "reciterSlug");
        kotlin.jvm.internal.m.e(surahSlug, "surahSlug");
        this.a = reciterSlug;
        this.b = surahSlug;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.a, pVar.a) && kotlin.jvm.internal.m.a(this.b, pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("ReciterSurah(reciterSlug=", this.a, ", surahSlug=", this.b, ")");
    }
}
