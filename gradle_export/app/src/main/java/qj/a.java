package qj;

import com.google.android.gms.internal.measurement.x5;

public final class a {

    public final String f13030a;

    public final String f13031b;

    public a(String str, String str2) {
        this.f13030a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f13031b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13030a.equals(aVar.f13030a) && this.f13031b.equals(aVar.f13031b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13031b.hashCode() ^ ((this.f13030a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f13030a);
        sb2.append(", version=");
        return x5.n(sb2, this.f13031b, "}");
    }
}
