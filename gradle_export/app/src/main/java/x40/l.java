package x40;

import com.google.android.gms.internal.measurement.x5;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class l {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public l(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(lVar.a, this.a) && kotlin.jvm.internal.m.a(lVar.b, this.b) && lVar.c == this.c && kotlin.jvm.internal.m.a(lVar.d, this.d) && kotlin.jvm.internal.m.a(lVar.e, this.e) && lVar.f == this.f && lVar.g == this.g && lVar.h == this.h && lVar.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + w.c.e(w.c.e(w.c.e(x5.e(x5.e(w.c.f(x5.e(x5.e(527, this.a, 31), this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j2 = this.c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) c50.c.a.get()).format(new Date(j2));
                kotlin.jvm.internal.m.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString()");
        return string;
    }
}
