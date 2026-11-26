package o9;

import android.os.Bundle;

public final class n {

    public final Bundle f11826a;

    public u f11827b;

    public n(u uVar, boolean z10) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f11826a = bundle;
        this.f11827b = uVar;
        bundle.putBundle("selector", uVar.f11877a);
        bundle.putBoolean("activeScan", z10);
    }

    public final void a() {
        if (this.f11827b == null) {
            u uVarB = u.b(this.f11826a.getBundle("selector"));
            this.f11827b = uVarB;
            if (uVarB == null) {
                this.f11827b = u.f11876c;
            }
        }
    }

    public final boolean b() {
        return this.f11826a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            a();
            u uVar = this.f11827b;
            nVar.a();
            if (uVar.equals(nVar.f11827b) && b() == nVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return (b() ? 1 : 0) ^ this.f11827b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb2.append(this.f11827b);
        sb2.append(", activeScan=");
        sb2.append(b());
        sb2.append(", isValid=");
        a();
        u uVar = this.f11827b;
        uVar.a();
        return g4.c.l(sb2, !uVar.f11878b.contains(null), " }");
    }
}
