package ho;

import com.google.android.gms.internal.measurement.x5;

public final class q {
    public final int a;
    public final String b;
    public final long c;
    public final boolean d;

    public q(int i, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b.equals(qVar.b) && this.c == qVar.c && this.d == qVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w.c.f(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStoryProgress(episodeId=", this.a, ", language=", this.b, ", positionMs=");
        sbM.append(this.c);
        sbM.append(", isCompleted=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
