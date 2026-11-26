package s7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class r {

    public static final AtomicLong f13729f = new AtomicLong();

    public final g7.j f13730a;

    public final Uri f13731b;

    public final Map f13732c;

    public final long f13733d;

    public final long f13734e;

    public r(g7.j jVar, long j9) {
        this(jVar, jVar.f6218a, Collections.EMPTY_MAP, j9, 0L);
    }

    public r(g7.j jVar, Uri uri, Map map, long j9, long j10) {
        this.f13730a = jVar;
        this.f13731b = uri;
        this.f13732c = map;
        this.f13733d = j9;
        this.f13734e = j10;
    }
}
