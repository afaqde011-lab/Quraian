package oi;

import java.io.File;
import ri.b0;

public final class b {

    public final b0 f11987a;

    public final String f11988b;

    public final File f11989c;

    public b(b0 b0Var, String str, File file) {
        this.f11987a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f11988b = str;
        this.f11989c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11987a.equals(bVar.f11987a) && this.f11988b.equals(bVar.f11988b) && this.f11989c.equals(bVar.f11989c);
    }

    public final int hashCode() {
        return this.f11989c.hashCode() ^ ((((this.f11987a.hashCode() ^ 1000003) * 1000003) ^ this.f11988b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f11987a + ", sessionId=" + this.f11988b + ", reportFile=" + this.f11989c + "}";
    }
}
