package jj;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class i {

    public static final long f8309b = TimeUnit.HOURS.toSeconds(1);

    public static final Pattern f8310c = Pattern.compile("\\AA[\\w-]{38}\\z");

    public static i f8311d;

    public final gj.e f8312a;

    public i(gj.e eVar) {
        this.f8312a = eVar;
    }

    public final boolean a(kj.b bVar) {
        if (TextUtils.isEmpty(bVar.f9694c)) {
            return true;
        }
        long j9 = bVar.f9697f + bVar.f9696e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f8312a.getClass();
        return j9 < timeUnit.toSeconds(System.currentTimeMillis()) + f8309b;
    }
}
