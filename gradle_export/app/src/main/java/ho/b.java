package ho;

import com.google.android.gms.internal.measurement.x5;

public final class b {
    public final Integer a;
    public final String b;
    public final String c;

    public b(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.a, bVar.a) && kotlin.jvm.internal.m.a(this.b, bVar.b) && kotlin.jvm.internal.m.a(this.c, bVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iE = x5.e((num == null ? 0 : num.hashCode()) * 31, this.b, 31);
        String str = this.c;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStoryAuthor(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", photoUrl=");
        return x5.n(sb, this.c, ")");
    }
}
