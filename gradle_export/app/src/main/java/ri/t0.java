package ri;

import java.util.List;

public final class t0 extends x1 {

    public final String f13535a;

    public final String f13536b;

    public final List f13537c;

    public final x1 f13538d;

    public final int f13539e;

    public t0(String str, String str2, List list, x1 x1Var, int i10) {
        this.f13535a = str;
        this.f13536b = str2;
        this.f13537c = list;
        this.f13538d = x1Var;
        this.f13539e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f13538d;
            String str2 = t0Var.f13536b;
            if (this.f13535a.equals(t0Var.f13535a) && ((str = this.f13536b) != null ? str.equals(str2) : str2 == null) && this.f13537c.equals(t0Var.f13537c) && ((x1Var = this.f13538d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f13539e == t0Var.f13539e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13535a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13536b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f13537c.hashCode()) * 1000003;
        x1 x1Var = this.f13538d;
        return this.f13539e ^ ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f13535a);
        sb2.append(", reason=");
        sb2.append(this.f13536b);
        sb2.append(", frames=");
        sb2.append(this.f13537c);
        sb2.append(", causedBy=");
        sb2.append(this.f13538d);
        sb2.append(", overflowCount=");
        return g4.c.g(this.f13539e, "}", sb2);
    }
}
