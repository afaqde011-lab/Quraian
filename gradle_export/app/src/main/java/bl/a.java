package bl;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import ol.c;

public final class a {
    public final long a;
    public final String b;
    public final c c;

    public a(long j, String message, c cVar) {
        m.e(message, "message");
        this.a = j;
        this.b = message;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b) && this.c == aVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(3000L) + ((this.c.hashCode() + x5.e(Long.hashCode(this.a) * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "TopSnackbarVisuals(id=" + this.a + ", message=" + this.b + ", style=" + this.c + ", durationMillis=3000)";
    }
}
