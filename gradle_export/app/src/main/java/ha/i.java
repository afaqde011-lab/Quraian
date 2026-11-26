package ha;

import a10.h0;
import h00.q;
import h00.x;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import r30.l;

public final class i {

    public final String f6958a;

    public final Object f6959b;

    public final Set f6960c;

    public final Set f6961d;

    public i(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        m.e(abstractSet, "foreignKeys");
        this.f6958a = str;
        this.f6959b = map;
        this.f6960c = abstractSet;
        this.f6961d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f6958a.equals(iVar.f6958a) || !this.f6959b.equals(iVar.f6959b) || !m.a(this.f6960c, iVar.f6960c)) {
            return false;
        }
        Set set2 = this.f6961d;
        if (set2 == null || (set = iVar.f6961d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f6960c.hashCode() + ((this.f6959b.hashCode() + (this.f6958a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f6958a);
        sb2.append("',\n            |    columns = {");
        sb2.append(h0.y(q.i1(this.f6959b.values(), new ba.m(7))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(h0.y(this.f6960c));
        sb2.append("\n            |    indices = {");
        Set set = this.f6961d;
        sb2.append(h0.y(set != null ? q.i1(set, new ba.m(8)) : x.A));
        sb2.append("\n            |}\n        ");
        return l.k0(sb2.toString());
    }
}
