package j3;

public final class z {

    public final String f8005a;

    public final u00.n f8006b;

    public final boolean f8007c;

    public z(String str) {
        this(str, m.U);
    }

    public z(String str, int i10) {
        this(str);
        this.f8007c = true;
    }

    public z(String str, u00.n nVar) {
        this.f8005a = str;
        this.f8006b = nVar;
    }

    public z(String str, boolean z10, u00.n nVar) {
        this(str, nVar);
        this.f8007c = z10;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f8005a;
    }
}
