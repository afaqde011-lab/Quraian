package qt;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import ot.t;

public final class j {
    public final ot.e a;
    public final t b;
    public final String c;
    public final String d;
    public final u30.f e;

    public j(ot.e kind, t loadState, String str, String str2, u30.f fVar) {
        m.e(kind, "kind");
        m.e(loadState, "loadState");
        this.a = kind;
        this.b = loadState;
        this.c = str;
        this.d = str2;
        this.e = fVar;
    }

    public static j a(j jVar, t tVar, String pendingTafsirId, String appliedTafsirId, u30.f fVar, int i) {
        t loadState = tVar;
        ot.e kind = jVar.a;
        if ((i & 2) != 0) {
            loadState = jVar.b;
        }
        if ((i & 4) != 0) {
            pendingTafsirId = jVar.c;
        }
        if ((i & 8) != 0) {
            appliedTafsirId = jVar.d;
        }
        if ((i & 16) != 0) {
            fVar = jVar.e;
        }
        u30.f filePhases = fVar;
        jVar.getClass();
        m.e(kind, "kind");
        m.e(loadState, "loadState");
        m.e(pendingTafsirId, "pendingTafsirId");
        m.e(appliedTafsirId, "appliedTafsirId");
        m.e(filePhases, "filePhases");
        String str = appliedTafsirId;
        return new j(kind, loadState, pendingTafsirId, str, filePhases);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && m.a(this.b, jVar.b) && m.a(this.c, jVar.c) && m.a(this.d, jVar.d) && m.a(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x5.e(x5.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TafsirPickerUiState(kind=");
        sb.append(this.a);
        sb.append(", loadState=");
        sb.append(this.b);
        sb.append(", pendingTafsirId=");
        a1.b.z(sb, this.c, ", appliedTafsirId=", this.d, ", filePhases=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
