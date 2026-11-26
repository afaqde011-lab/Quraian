package x3;

public final class i {

    public static final i f16412d = new i(f.f16407c, 17, 0);

    public final float f16413a;

    public final int f16414b;

    public final int f16415c;

    public i(float f3, int i10, int i11) {
        this.f16413a = f3;
        this.f16414b = i10;
        this.f16415c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f3 = iVar.f16413a;
        float f10 = f.f16406b;
        return Float.compare(this.f16413a, f3) == 0 && this.f16414b == iVar.f16414b && this.f16415c == iVar.f16415c;
    }

    public final int hashCode() {
        float f3 = f.f16406b;
        return Integer.hashCode(this.f16415c) + w.c.d(this.f16414b, Float.hashCode(this.f16413a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f16413a));
        sb2.append(", trim=");
        String str2 = "Invalid";
        int i10 = this.f16414b;
        if (i10 == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i10 == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i10 == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(",mode=");
        int i11 = this.f16415c;
        if (i11 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i11 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i11 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
