package m3;

public final class o0 {

    public final i0 f10502a;

    public final i0 f10503b;

    public final i0 f10504c;

    public final i0 f10505d;

    public o0(i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4) {
        this.f10502a = i0Var;
        this.f10503b = i0Var2;
        this.f10504c = i0Var3;
        this.f10505d = i0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.m.a(this.f10502a, o0Var.f10502a) && kotlin.jvm.internal.m.a(this.f10503b, o0Var.f10503b) && kotlin.jvm.internal.m.a(this.f10504c, o0Var.f10504c) && kotlin.jvm.internal.m.a(this.f10505d, o0Var.f10505d);
    }

    public final int hashCode() {
        i0 i0Var = this.f10502a;
        int iHashCode = (i0Var != null ? i0Var.hashCode() : 0) * 31;
        i0 i0Var2 = this.f10503b;
        int iHashCode2 = (iHashCode + (i0Var2 != null ? i0Var2.hashCode() : 0)) * 31;
        i0 i0Var3 = this.f10504c;
        int iHashCode3 = (iHashCode2 + (i0Var3 != null ? i0Var3.hashCode() : 0)) * 31;
        i0 i0Var4 = this.f10505d;
        return iHashCode3 + (i0Var4 != null ? i0Var4.hashCode() : 0);
    }
}
