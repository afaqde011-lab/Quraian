package ci;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a {

    public static final String[] f3157g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    public static final SimpleDateFormat f3158h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public final String f3159a;

    public final String f3160b;

    public final String f3161c;

    public final Date f3162d;

    public final long f3163e;

    public final long f3164f;

    public a(String str, String str2, String str3, Date date, long j9, long j10) {
        this.f3159a = str;
        this.f3160b = str2;
        this.f3161c = str3;
        this.f3162d = date;
        this.f3163e = j9;
        this.f3164f = j10;
    }

    public final fi.a a() {
        fi.a aVar = new fi.a();
        aVar.f5684a = "frc";
        aVar.m = this.f3162d.getTime();
        aVar.f5685b = this.f3159a;
        aVar.f5686c = this.f3160b;
        String str = this.f3161c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f5687d = str;
        aVar.f5688e = this.f3163e;
        aVar.f5693j = this.f3164f;
        return aVar;
    }
}
