package ri;

public final class i1 extends k2 {

    public final int f13379a;

    public final String f13380b;

    public final String f13381c;

    public final boolean f13382d;

    public i1(int i10, String str, String str2, boolean z10) {
        this.f13379a = i10;
        this.f13380b = str;
        this.f13381c = str2;
        this.f13382d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f13379a == i1Var.f13379a && this.f13380b.equals(i1Var.f13380b) && this.f13381c.equals(i1Var.f13381c) && this.f13382d == i1Var.f13382d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13382d ? 1231 : 1237) ^ ((((((this.f13379a ^ 1000003) * 1000003) ^ this.f13380b.hashCode()) * 1000003) ^ this.f13381c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f13379a);
        sb2.append(", version=");
        sb2.append(this.f13380b);
        sb2.append(", buildVersion=");
        sb2.append(this.f13381c);
        sb2.append(", jailbroken=");
        return g4.c.l(sb2, this.f13382d, "}");
    }
}
