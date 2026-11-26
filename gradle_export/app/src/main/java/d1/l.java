package d1;

import com.google.android.gms.internal.measurement.x5;

public final class l {

    public final String f4584a;

    public String f4585b;

    public boolean f4586c = false;

    public e f4587d = null;

    public l(String str, String str2) {
        this.f4584a = str;
        this.f4585b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f4584a, lVar.f4584a) && kotlin.jvm.internal.m.a(this.f4585b, lVar.f4585b) && this.f4586c == lVar.f4586c && kotlin.jvm.internal.m.a(this.f4587d, lVar.f4587d);
    }

    public final int hashCode() {
        int iE = w.c.e(x5.e(this.f4584a.hashCode() * 31, this.f4585b, 31), 31, this.f4586c);
        e eVar = this.f4587d;
        return iE + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
        sb2.append(this.f4587d);
        sb2.append(", isShowingSubstitution=");
        return x5.o(sb2, this.f4586c, ')');
    }
}
