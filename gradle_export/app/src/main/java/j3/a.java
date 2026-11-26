package j3;

public final class a {

    public final String f7926a;

    public final g00.e f7927b;

    public a(String str, g00.e eVar) {
        this.f7926a = str;
        this.f7927b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f7926a, aVar.f7926a) && kotlin.jvm.internal.m.a(this.f7927b, aVar.f7927b);
    }

    public final int hashCode() {
        String str = this.f7926a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        g00.e eVar = this.f7927b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f7926a + ", action=" + this.f7927b + ')';
    }
}
