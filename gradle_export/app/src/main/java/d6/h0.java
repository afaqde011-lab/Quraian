package d6;

public final class h0 {

    public final b6.m f4632a;

    public final b6.m f4633b;

    public h0(b6.m mVar, int i10) {
        int i11 = i10 & 2;
        b6.k kVar = b6.k.f2179a;
        this(kVar, i11 != 0 ? kVar : mVar);
    }

    public h0(b6.m mVar, b6.m mVar2) {
        this.f4632a = mVar;
        this.f4633b = mVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.m.a(this.f4632a, h0Var.f4632a) && kotlin.jvm.internal.m.a(this.f4633b, h0Var.f4633b);
    }

    public final int hashCode() {
        return this.f4633b.hashCode() + (this.f4632a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=" + this.f4632a + ", nonSizeOrCornerModifiers=" + this.f4633b + ')';
    }
}
