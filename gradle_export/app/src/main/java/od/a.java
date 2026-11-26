package od;

import kotlin.jvm.internal.m;

public final class a {

    public final String f11927a;

    public final String f11928b;

    public a(String str, String str2) {
        this.f11927a = str;
        this.f11928b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f11927a, aVar.f11927a) && m.a(this.f11928b, aVar.f11928b);
    }

    public final int hashCode() {
        String str = this.f11927a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11928b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Identity(userId=");
        sb2.append(this.f11927a);
        sb2.append(", deviceId=");
        return g4.c.k(sb2, this.f11928b, ')');
    }
}
