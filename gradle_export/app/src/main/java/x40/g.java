package x40;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.verification.SigningManager;
import ri.t1;

public final class g {
    public final String a;
    public final String b;
    public final k50.l c;

    public g(String pattern, String pin) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        kotlin.jvm.internal.m.e(pin, "pin");
        if ((!r30.r.x0(pattern, "*.", false) || r30.k.J0(pattern, "*", 1, false, 4) != -1) && ((!r30.r.x0(pattern, "**.", false) || r30.k.J0(pattern, "*", 2, false, 4) != -1) && r30.k.J0(pattern, "*", 0, false, 6) != -1)) {
            throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
        }
        String strP = t1.P(pattern);
        if (strP == null) {
            throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
        }
        this.a = strP;
        if (r30.r.x0(pin, "sha1/", false)) {
            this.b = "sha1";
            k50.l lVar = k50.l.D;
            String strSubstring = pin.substring(5);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            k50.l lVarG = sg.f.G(strSubstring);
            if (lVarG == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.c = lVarG;
            return;
        }
        if (!r30.r.x0(pin, "sha256/", false)) {
            throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
        }
        this.b = SigningManager.POST_PARAMS_ALGORITHM;
        k50.l lVar2 = k50.l.D;
        String strSubstring2 = pin.substring(7);
        kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
        k50.l lVarG2 = sg.f.G(strSubstring2);
        if (lVarG2 == null) {
            throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
        }
        this.c = lVarG2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.a, gVar.a) && kotlin.jvm.internal.m.a(this.b, gVar.b) && kotlin.jvm.internal.m.a(this.c, gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return this.b + '/' + this.c.a();
    }
}
