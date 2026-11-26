package uy;

public final class k {
    public final u30.b a;
    public final boolean b;

    public k(u30.b benefits, boolean z) {
        kotlin.jvm.internal.m.e(benefits, "benefits");
        this.a = benefits;
        this.b = z;
    }

    public static k a(k kVar, boolean z) {
        u30.b benefits = kVar.a;
        kVar.getClass();
        kotlin.jvm.internal.m.e(benefits, "benefits");
        return new k(benefits, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.a, kVar.a) && this.b == kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CancellationBenefitsUiState(benefits=" + this.a + ", isConfirmSheetVisible=" + this.b + ")";
    }
}
