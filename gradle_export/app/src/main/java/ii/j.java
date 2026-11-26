package ii;

import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.x5;

public final class j {

    public final p f7699a;

    public final int f7700b;

    public final int f7701c;

    public j(int i10, int i11, Class cls) {
        this(p.a(cls), i10, i11);
    }

    public j(p pVar, int i10, int i11) {
        b5.m(pVar, "Null dependency anInterface.");
        this.f7699a = pVar;
        this.f7700b = i10;
        this.f7701c = i11;
    }

    public static j a(p pVar) {
        return new j(pVar, 1, 0);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7699a.equals(jVar.f7699a) && this.f7700b == jVar.f7700b && this.f7701c == jVar.f7701c;
    }

    public final int hashCode() {
        return this.f7701c ^ ((((this.f7699a.hashCode() ^ 1000003) * 1000003) ^ this.f7700b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f7699a);
        sb2.append(", type=");
        int i10 = this.f7700b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f7701c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(g4.c.f(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return x5.n(sb2, str2, "}");
    }
}
