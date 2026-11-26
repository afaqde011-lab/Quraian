package k9;

import android.os.Bundle;
import java.util.Objects;

public final class a2 {

    public final l9.g0 f9206a;

    public final int f9207b;

    public final int f9208c;

    public final z1 f9209d;

    public final Bundle f9210e;

    public a2(l9.g0 g0Var, int i10, int i11, boolean z10, z1 z1Var, Bundle bundle) {
        this.f9206a = g0Var;
        this.f9207b = i10;
        this.f9208c = i11;
        this.f9209d = z1Var;
        this.f9210e = bundle;
    }

    public final String a() {
        return this.f9206a.f10146a.f10150a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a2 a2Var = (a2) obj;
        z1 z1Var = a2Var.f9209d;
        z1 z1Var2 = this.f9209d;
        return (z1Var2 == null && z1Var == null) ? this.f9206a.equals(a2Var.f9206a) : Objects.equals(z1Var2, z1Var);
    }

    public final int hashCode() {
        return Objects.hash(this.f9209d, this.f9206a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ControllerInfo {pkg=");
        l9.g0 g0Var = this.f9206a;
        sb2.append(g0Var.f10146a.f10150a);
        sb2.append(", uid=");
        return g4.c.g(g0Var.f10146a.f10152c, "}", sb2);
    }
}
