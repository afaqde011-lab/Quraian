package cy;

import java.util.ArrayList;

public final class k extends n {
    public final bx.c b;
    public final ArrayList c;
    public final ArrayList d;
    public final String e;
    public final String f;

    public k(bx.c cVar, ArrayList arrayList, ArrayList arrayList2, String str) {
        this.b = cVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = str;
        this.f = g4.c.f(cVar.a, "reciter-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.b.equals(kVar.b) && this.c.equals(kVar.c) && this.d.equals(kVar.d) && kotlin.jvm.internal.m.a(this.e, kVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReciterItem(reciter=" + this.b + ", normalizedNameFields=" + this.c + ", normalizedCountryFields=" + this.d + ", normalizedLetter=" + this.e + ")";
    }
}
