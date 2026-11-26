package q3;

public final class d0 {

    public final i f12729a;

    public final u f12730b;

    public final int f12731c;

    public final int f12732d;

    public final Object f12733e;

    public d0(i iVar, u uVar, int i10, int i11, Object obj) {
        this.f12729a = iVar;
        this.f12730b = uVar;
        this.f12731c = i10;
        this.f12732d = i11;
        this.f12733e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.m.a(this.f12729a, d0Var.f12729a) && kotlin.jvm.internal.m.a(this.f12730b, d0Var.f12730b) && this.f12731c == d0Var.f12731c && this.f12732d == d0Var.f12732d && kotlin.jvm.internal.m.a(this.f12733e, d0Var.f12733e);
    }

    public final int hashCode() {
        i iVar = this.f12729a;
        int iD = w.c.d(this.f12732d, w.c.d(this.f12731c, (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f12730b.A) * 31, 31), 31);
        Object obj = this.f12733e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f12729a);
        sb2.append(", fontWeight=");
        sb2.append(this.f12730b);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i10 = this.f12731c;
        if (i10 == 0) {
            str = "Normal";
        } else {
            str = i10 == 1 ? "Italic" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i11 = this.f12732d;
        if (i11 == 0) {
            str2 = "None";
        } else if (i11 == 1) {
            str2 = "Weight";
        } else if (i11 == 2) {
            str2 = "Style";
        } else if (i11 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f12733e);
        sb2.append(')');
        return sb2.toString();
    }
}
