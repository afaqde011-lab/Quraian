package rs;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class d {
    public final String a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final Integer f;
    public final long g;

    public d(String key, long j, int i, String soundId, int i2, Integer num, long j2) {
        m.e(key, "key");
        m.e(soundId, "soundId");
        this.a = key;
        this.b = j;
        this.c = i;
        this.d = soundId;
        this.e = i2;
        this.f = num;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && m.a(this.d, dVar.d) && this.e == dVar.e && m.a(this.f, dVar.f) && this.g == dVar.g;
    }

    public final int hashCode() {
        int iD = w.c.d(this.e, x5.e(w.c.d(this.c, w.c.f(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), 31);
        Integer num = this.f;
        return Long.hashCode(this.g) + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "HourWithBackgroundSoundStat(key=" + this.a + ", dayStart=" + this.b + ", hour=" + this.c + ", soundId=" + this.d + ", seconds=" + this.e + ", avgVolumeTimes1000=" + this.f + ", updatedAt=" + this.g + ")";
    }
}
