package s2;

import com.google.android.gms.internal.measurement.x5;
import v2.r;

public final class b {

    public final long f13626a;

    public final long f13627b;

    public final long f13628c;

    public final boolean f13629d;

    public final float f13630e;

    public final long f13631f;

    public final long f13632g;

    public final boolean f13633h;

    public boolean f13634i;

    public b(long j9, long j10, long j11, boolean z10, float f3, long j12, long j13, boolean z11) {
        this.f13626a = j9;
        this.f13627b = j10;
        this.f13628c = j11;
        this.f13629d = z10;
        this.f13630e = f3;
        this.f13631f = j12;
        this.f13632g = j13;
        this.f13633h = z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndirectPointerInputChange(id=");
        sb2.append((Object) r.j(this.f13626a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f13627b);
        sb2.append(", position=");
        sb2.append((Object) h2.b.h(this.f13628c));
        sb2.append(", pressed=");
        sb2.append(this.f13629d);
        sb2.append(", pressure=");
        sb2.append(this.f13630e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f13631f);
        sb2.append(", previousPosition=");
        sb2.append((Object) h2.b.h(this.f13632g));
        sb2.append(", previousPressed=");
        sb2.append(this.f13633h);
        sb2.append(", isConsumed=");
        return x5.o(sb2, this.f13634i, ')');
    }
}
