package ri;

import java.util.List;

public final class q0 extends d2 {

    public final r0 f13500a;

    public final List f13501b;

    public final List f13502c;

    public final Boolean f13503d;

    public final c2 f13504e;

    public final List f13505f;

    public final int f13506g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i10) {
        this.f13500a = r0Var;
        this.f13501b = list;
        this.f13502c = list2;
        this.f13503d = bool;
        this.f13504e = c2Var;
        this.f13505f = list3;
        this.f13506g = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        q0 q0Var = (q0) ((d2) obj);
        List list = q0Var.f13505f;
        c2 c2Var = q0Var.f13504e;
        Boolean bool = q0Var.f13503d;
        List list2 = q0Var.f13502c;
        List list3 = q0Var.f13501b;
        if (!this.f13500a.equals(q0Var.f13500a)) {
            return false;
        }
        List list4 = this.f13501b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f13502c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f13503d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        c2 c2Var2 = this.f13504e;
        if (c2Var2 == null) {
            if (c2Var != null) {
                return false;
            }
        } else if (!c2Var2.equals(c2Var)) {
            return false;
        }
        List list6 = this.f13505f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.f13506g == q0Var.f13506g;
    }

    public final int hashCode() {
        int iHashCode = (this.f13500a.hashCode() ^ 1000003) * 1000003;
        List list = this.f13501b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f13502c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f13503d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f13504e;
        int iHashCode5 = (iHashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f13505f;
        return this.f13506g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f13500a);
        sb2.append(", customAttributes=");
        sb2.append(this.f13501b);
        sb2.append(", internalKeys=");
        sb2.append(this.f13502c);
        sb2.append(", background=");
        sb2.append(this.f13503d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f13504e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f13505f);
        sb2.append(", uiOrientation=");
        return g4.c.g(this.f13506g, "}", sb2);
    }
}
