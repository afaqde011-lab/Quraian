package x3;

import java.util.ArrayList;

public final class l {

    public static final l f16417b = new l(0);

    public static final l f16418c = new l(1);

    public static final l f16419d = new l(2);

    public final int f16420a;

    public l(int i10) {
        this.f16420a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f16420a == ((l) obj).f16420a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16420a;
    }

    public final String toString() {
        int i10 = this.f16420a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return g4.c.k(new StringBuilder("TextDecoration["), a4.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
