package q3;

public final class a0 {

    public final int f12723a;

    public final u f12724b;

    public final int f12725c;

    public final t f12726d;

    public a0(int i10, u uVar, int i11, t tVar) {
        this.f12723a = i10;
        this.f12724b = uVar;
        this.f12725c = i11;
        this.f12726d = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f12723a == a0Var.f12723a && kotlin.jvm.internal.m.a(this.f12724b, a0Var.f12724b) && this.f12725c == a0Var.f12725c && this.f12726d.equals(a0Var.f12726d);
    }

    public final int hashCode() {
        return this.f12726d.f12750a.hashCode() + w.c.d(0, w.c.d(this.f12725c, ((this.f12723a * 31) + this.f12724b.A) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ResourceFont(resId=");
        sb2.append(this.f12723a);
        sb2.append(", weight=");
        sb2.append(this.f12724b);
        sb2.append(", style=");
        int i10 = this.f12725c;
        if (i10 == 0) {
            str = "Normal";
        } else {
            str = i10 == 1 ? "Italic" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", loadingStrategy=Blocking)");
        return sb2.toString();
    }
}
