package d0;

import com.google.android.gms.internal.measurement.z3;

public final class f {

    public final n0.f f4427a;

    public final a40.k f4428b;

    public f(n0.f fVar, a40.k kVar) {
        this.f4427a = fVar;
        this.f4428b = kVar;
    }

    public final String toString() {
        String strP;
        a40.k kVar = this.f4428b;
        a40.y yVar = kVar.E.get(a40.y.C);
        String str = yVar != null ? yVar.B : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        z3.r(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb2.append(string);
        if (str == null || (strP = a1.b.p("[", str, "](")) == null) {
            strP = "(";
        }
        sb2.append(strP);
        sb2.append("currentBounds()=");
        sb2.append(this.f4427a.invoke());
        sb2.append(", continuation=");
        sb2.append(kVar);
        sb2.append(')');
        return sb2.toString();
    }
}
