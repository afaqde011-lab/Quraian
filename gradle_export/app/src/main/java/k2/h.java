package k2;

import kotlin.jvm.internal.m;

public final class h extends e {

    public final float f8923a;

    public final float f8924b;

    public final int f8925c;

    public final int f8926d;

    public final i2.h f8927e;

    public h(float f3, float f10, int i10, int i11, i2.h hVar, int i12) {
        f10 = (i12 & 2) != 0 ? 4.0f : f10;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        hVar = (i12 & 16) != 0 ? null : hVar;
        this.f8923a = f3;
        this.f8924b = f10;
        this.f8925c = i10;
        this.f8926d = i11;
        this.f8927e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f8923a == hVar.f8923a && this.f8924b == hVar.f8924b && this.f8925c == hVar.f8925c && this.f8926d == hVar.f8926d && m.a(this.f8927e, hVar.f8927e);
    }

    public final int hashCode() {
        int iD = w.c.d(this.f8926d, w.c.d(this.f8925c, w.c.c(this.f8924b, Float.hashCode(this.f8923a) * 31, 31), 31), 31);
        i2.h hVar = this.f8927e;
        return iD + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f8923a);
        sb2.append(", miter=");
        sb2.append(this.f8924b);
        sb2.append(", cap=");
        String str2 = "Unknown";
        int i10 = this.f8925c;
        if (i10 == 0) {
            str = "Butt";
        } else if (i10 == 1) {
            str = "Round";
        } else {
            str = i10 == 2 ? "Square" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i11 = this.f8926d;
        if (i11 == 0) {
            str2 = "Miter";
        } else if (i11 == 1) {
            str2 = "Round";
        } else if (i11 == 2) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append(this.f8927e);
        sb2.append(')');
        return sb2.toString();
    }
}
