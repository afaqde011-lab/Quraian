package t3;

import java.util.Locale;
import kotlin.jvm.internal.m;

public final class a {

    public final Locale f14352a;

    public a(Locale locale) {
        this.f14352a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m.a(this.f14352a.toLanguageTag(), ((a) obj).f14352a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f14352a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f14352a.toLanguageTag();
    }
}
