package p8;

import androidx.media3.common.u0;
import java.util.ArrayList;
import ta.c0;

public final class b implements u0 {

    public final ArrayList f12449a;

    public b(ArrayList arrayList) {
        this.f12449a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j9 = ((a) arrayList.get(0)).f12447b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((a) arrayList.get(i10)).f12446a < j9) {
                    z10 = true;
                    break;
                }
                j9 = ((a) arrayList.get(i10)).f12447b;
            }
        }
        c0.s(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f12449a.equals(((b) obj).f12449a);
    }

    public final int hashCode() {
        return this.f12449a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f12449a;
    }
}
