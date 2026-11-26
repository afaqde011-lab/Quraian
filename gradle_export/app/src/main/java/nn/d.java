package nn;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.b5;
import kotlin.jvm.internal.m;

public final class d {
    public volatile a a;

    public final Boolean a(int i, Integer num) {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - aVar.c > 10000) {
            this.a = null;
            return null;
        }
        if (m.a(aVar.a, b5.I(i, num))) {
            return Boolean.valueOf(aVar.b);
        }
        Boolean bool = Boolean.FALSE;
        if (aVar.b) {
            return bool;
        }
        return null;
    }
}
