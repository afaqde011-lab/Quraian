package gj;

import java.util.ArrayList;

public final class a {

    public final String f6344a;

    public final ArrayList f6345b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f6344a = str;
        this.f6345b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6344a.equals(aVar.f6344a) && this.f6345b.equals(aVar.f6345b);
    }

    public final int hashCode() {
        return this.f6345b.hashCode() ^ ((this.f6344a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f6344a + ", usedDates=" + this.f6345b + "}";
    }
}
