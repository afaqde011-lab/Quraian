package ss;

import com.google.android.gms.internal.measurement.x5;

public final class b {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final int e;

    public b(int i, int i2, long j, String day, String soundId) {
        kotlin.jvm.internal.m.e(day, "day");
        kotlin.jvm.internal.m.e(soundId, "soundId");
        this.a = day;
        this.b = i;
        this.c = soundId;
        this.d = j;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.a, bVar.a) && this.b == bVar.b && kotlin.jvm.internal.m.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + w.c.f(x5.e(w.c.d(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        return "ListeningBackgroundStat(day=" + this.a + ", hour=" + this.b + ", soundId=" + this.c + ", listenedMs=" + this.d + ", avgVolumeTimes1000=" + this.e + ")";
    }
}
