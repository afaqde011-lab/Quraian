package u40;

import android.content.res.Resources;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class d {
    public final b a;
    public final long b;
    public final boolean c;
    public final v40.c d;
    public final ArrayList e;

    public d(b party) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = Resources.getSystem().getDisplayMetrics().density;
        m.e(party, "party");
        this.a = party;
        this.b = jCurrentTimeMillis;
        this.c = true;
        this.d = new v40.c(party.i, f);
        this.e = new ArrayList();
    }
}
