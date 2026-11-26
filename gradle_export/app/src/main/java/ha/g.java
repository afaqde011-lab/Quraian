package ha;

import a10.h0;
import com.google.android.gms.internal.measurement.x5;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.l;

public final class g {

    public final String f6949a;

    public final String f6950b;

    public final String f6951c;

    public final List f6952d;

    public final List f6953e;

    public g(String str, String str2, String str3, List list, List list2) {
        m.e(str, "referenceTable");
        m.e(str2, "onDelete");
        m.e(str3, "onUpdate");
        this.f6949a = str;
        this.f6950b = str2;
        this.f6951c = str3;
        this.f6952d = list;
        this.f6953e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (m.a(this.f6949a, gVar.f6949a) && m.a(this.f6950b, gVar.f6950b) && m.a(this.f6951c, gVar.f6951c) && m.a(this.f6952d, gVar.f6952d)) {
            return m.a(this.f6953e, gVar.f6953e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6953e.hashCode() + g4.c.a(x5.e(x5.e(this.f6949a.hashCode() * 31, this.f6950b, 31), this.f6951c, 31), 31, this.f6952d);
    }

    public final String toString() {
        return l.i0(l.k0("\n            |ForeignKey {\n            |   referenceTable = '" + this.f6949a + "',\n            |   onDelete = '" + this.f6950b + "',\n            |   onUpdate = '" + this.f6951c + "',\n            |   columnNames = {" + h0.F(q.h1(this.f6952d)) + "\n            |   referenceColumnNames = {" + h0.E(q.h1(this.f6953e)) + "\n            |}\n        "), "    ");
    }
}
