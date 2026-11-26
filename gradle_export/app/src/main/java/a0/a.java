package a0;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class a {

    public static final a f1b = new a("text/*");

    public static final a f2c = new a("*/*");

    public final String f3a;

    public a(String str) {
        this.f3a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return m.a(this.f3a, ((a) obj).f3a);
    }

    public final int hashCode() {
        return this.f3a.hashCode();
    }

    public final String toString() {
        return x5.n(new StringBuilder("MediaType(representation='"), this.f3a, "')");
    }
}
