package r3;

public final class j {

    public static final j f13072g = new j(false, 0, true, 1, 1, t3.b.C);

    public final boolean f13073a;

    public final int f13074b;

    public final boolean f13075c;

    public final int f13076d;

    public final int f13077e;

    public final t3.b f13078f;

    public j(boolean z10, int i10, boolean z11, int i11, int i12, t3.b bVar) {
        this.f13073a = z10;
        this.f13074b = i10;
        this.f13075c = z11;
        this.f13076d = i11;
        this.f13077e = i12;
        this.f13078f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13073a == jVar.f13073a && this.f13074b == jVar.f13074b && this.f13075c == jVar.f13075c && this.f13076d == jVar.f13076d && this.f13077e == jVar.f13077e && kotlin.jvm.internal.m.a(this.f13078f, jVar.f13078f);
    }

    public final int hashCode() {
        return this.f13078f.A.hashCode() + w.c.d(this.f13077e, w.c.d(this.f13076d, w.c.e(w.c.d(this.f13074b, Boolean.hashCode(this.f13073a) * 31, 31), 31, this.f13075c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f13073a + ", capitalization=" + ((Object) k.a(this.f13074b)) + ", autoCorrect=" + this.f13075c + ", keyboardType=" + ((Object) l.a(this.f13076d)) + ", imeAction=" + ((Object) i.a(this.f13077e)) + ", platformImeOptions=null, hintLocales=" + this.f13078f + ')';
    }
}
