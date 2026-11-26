package wd;

public final class n extends y {

    public final l f16043a;

    public n(l lVar) {
        this.f16043a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.A;
        if (obj2.equals(obj2)) {
            return this.f16043a.equals(((n) yVar).f16043a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16043a.hashCode() ^ ((x.A.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.A + ", androidClientInfo=" + this.f16043a + "}";
    }
}
