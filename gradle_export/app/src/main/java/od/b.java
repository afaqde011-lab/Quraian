package od;

import com.google.android.gms.internal.measurement.x5;
import java.io.File;
import kotlin.jvm.internal.m;
import sg.f;

public final class b {

    public final String f11929a;

    public final String f11930b;

    public final f f11931c;

    public final File f11932d;

    public final String f11933e;

    public final cd.b f11934f;

    public b(String str, String str2, f fVar, File file, String str3, cd.b bVar) {
        m.e(str, "instanceName");
        m.e(fVar, "identityStorageProvider");
        m.e(str3, "fileName");
        this.f11929a = str;
        this.f11930b = str2;
        this.f11931c = fVar;
        this.f11932d = file;
        this.f11933e = str3;
        this.f11934f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f11929a, bVar.f11929a) && m.a(this.f11930b, bVar.f11930b) && m.a(this.f11931c, bVar.f11931c) && this.f11932d.equals(bVar.f11932d) && m.a(this.f11933e, bVar.f11933e) && m.a(this.f11934f, bVar.f11934f);
    }

    public final int hashCode() {
        int iHashCode = this.f11929a.hashCode() * 31;
        String str = this.f11930b;
        int iE = x5.e((this.f11932d.hashCode() + ((this.f11931c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31, this.f11933e, 31);
        cd.b bVar = this.f11934f;
        return iE + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.f11929a + ", apiKey=" + this.f11930b + ", experimentApiKey=null, identityStorageProvider=" + this.f11931c + ", storageDirectory=" + this.f11932d + ", fileName=" + this.f11933e + ", logger=" + this.f11934f + ')';
    }
}
