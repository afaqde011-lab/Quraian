package ri;

import java.util.List;

public final class v0 extends a2 {

    public final String f13550a;

    public final int f13551b;

    public final List f13552c;

    public v0(String str, int i10, List list) {
        this.f13550a = str;
        this.f13551b = i10;
        this.f13552c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f13550a.equals(v0Var.f13550a) && this.f13551b == v0Var.f13551b && this.f13552c.equals(v0Var.f13552c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13552c.hashCode() ^ ((((this.f13550a.hashCode() ^ 1000003) * 1000003) ^ this.f13551b) * 1000003);
    }

    public final String toString() {
        return "Thread{name=" + this.f13550a + ", importance=" + this.f13551b + ", frames=" + this.f13552c + "}";
    }
}
