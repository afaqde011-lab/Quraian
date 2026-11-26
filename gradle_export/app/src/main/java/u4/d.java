package u4;

import android.os.LocaleList;
import java.util.Locale;

public final class d {

    public static final d f14942b = new d(new e(new LocaleList(new Locale[0])));

    public final e f14943a;

    public d(e eVar) {
        this.f14943a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f14943a.equals(((d) obj).f14943a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14943a.f14944a.hashCode();
    }

    public final String toString() {
        return this.f14943a.f14944a.toString();
    }
}
