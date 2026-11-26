package m7;

import java.util.Objects;

public final class b {

    public final String f10576a;

    public final String f10577b;

    public final int f10578c;

    public final int f10579d;

    public b(int i10, int i11, String str, String str2) {
        this.f10576a = str;
        this.f10577b = str2;
        this.f10578c = i10;
        this.f10579d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10578c == bVar.f10578c && this.f10579d == bVar.f10579d && Objects.equals(this.f10576a, bVar.f10576a) && Objects.equals(this.f10577b, bVar.f10577b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10576a, this.f10577b, Integer.valueOf(this.f10578c), Integer.valueOf(this.f10579d));
    }
}
