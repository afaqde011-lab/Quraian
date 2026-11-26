package ho;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class s {
    public final Integer a;
    public final String b;
    public final long c;
    public final long d;
    public final List e;

    public s(Integer num, String str, long j, long j2, List list) {
        this.a = num;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.a, sVar.a) && kotlin.jvm.internal.m.a(this.b, sVar.b) && this.c == sVar.c && this.d == sVar.d && kotlin.jvm.internal.m.a(this.e, sVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.e.hashCode() + w.c.f(w.c.f(x5.e((num == null ? 0 : num.hashCode()) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        return "AudioStoryTranscriptLine(paragraph=" + this.a + ", role=" + this.b + ", startMs=" + this.c + ", endMs=" + this.d + ", words=" + this.e + ")";
    }
}
