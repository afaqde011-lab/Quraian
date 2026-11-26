package j8;

import androidx.media3.common.u0;
import c7.i;

public final class b implements u0 {

    public final long f8251a;

    public final long f8252b;

    public final long f8253c;

    public final long f8254d;

    public final long f8255e;

    public b(long j9, long j10, long j11, long j12, long j13) {
        this.f8251a = j9;
        this.f8252b = j10;
        this.f8253c = j11;
        this.f8254d = j12;
        this.f8255e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8251a == bVar.f8251a && this.f8252b == bVar.f8252b && this.f8253c == bVar.f8253c && this.f8254d == bVar.f8254d && this.f8255e == bVar.f8255e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i.G(this.f8255e) + ((i.G(this.f8254d) + ((i.G(this.f8253c) + ((i.G(this.f8252b) + ((i.G(this.f8251a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8251a + ", photoSize=" + this.f8252b + ", photoPresentationTimestampUs=" + this.f8253c + ", videoStartPosition=" + this.f8254d + ", videoSize=" + this.f8255e;
    }
}
