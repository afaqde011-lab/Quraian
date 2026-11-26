package ju;

import com.google.android.gms.internal.measurement.x5;

public final class h {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public h(int i, String name, String photoUrl, boolean z) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(photoUrl, "photoUrl");
        this.a = i;
        this.b = name;
        this.c = photoUrl;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && kotlin.jvm.internal.m.a(this.b, hVar.b) && kotlin.jvm.internal.m.a(this.c, hVar.c) && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("OnboardingReciterUi(id=", this.a, ", name=", this.b, ", photoUrl=");
        sbM.append(this.c);
        sbM.append(", isSelected=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
