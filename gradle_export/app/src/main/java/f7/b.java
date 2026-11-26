package f7;

import androidx.media3.common.u0;

public final class b implements u0 {

    public final int f5493a;

    public b(int i10) {
        this.f5493a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f5493a == ((b) obj).f5493a;
    }

    public final int hashCode() {
        return this.f5493a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f5493a;
    }
}
